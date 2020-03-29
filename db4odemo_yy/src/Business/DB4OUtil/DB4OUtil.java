package Business.DB4OUtil;

import Business.Employee.Employee;
import Business.Organization.ConfigureASystem;
import Business.Organization.EcoSystem;
import Business.Restaurant.Menu;
import Business.Restaurant.Order;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;

/**
 *
 * @author rrheg
 * @author Lingfeng
 */
public class DB4OUtil {

    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();// path to the data store
    private static DB4OUtil dB4OUtil;
    
    public synchronized static DB4OUtil getInstance(){
        System.out.println(FILENAME);
        if (dB4OUtil == null){
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(EcoSystem.class).cascadeOnUpdate(true); // Change to the object you want to save

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(EcoSystem system) {
        ObjectContainer conn = createConnection();
        system.id = Employee.getCurrentId();
        system.menuId = Menu.getCount();
        system.orderId=Order.getCount();
        conn.store(system);
        conn.commit();
        conn.close();
        System.out.println("Stored...");
    }
    
    public EcoSystem retrieveSystem(){
        ObjectContainer conn = createConnection();
        ObjectSet<EcoSystem> systems = conn.query(EcoSystem.class); // Change to the object you want to save
        EcoSystem system;
        if (systems.size() == 0){
            System.out.println("New");
            system = ConfigureASystem.configure();  // If there's no System in the record, create a new one
        }
        else{
            System.out.println("Old");
            system = systems.get(systems.size() - 1);
        }
        conn.close();
        Employee.setCurrentId(system.id);
        Menu.setCount(system.menuId);
        Order.setCount(system.orderId);
        System.out.println("ID: ");
        System.out.println(system.id);
        return system;
    }
}
