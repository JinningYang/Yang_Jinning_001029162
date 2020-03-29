/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;

import Business.Restaurant.RestaurantDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    public int id;
    public int menuId;
    public int orderId;
    
    private RestaurantDirectory restaurantDirectory;

    public static EcoSystem getBusiness() {
        return business;
    }

    public RestaurantDirectory getRestaurantDirectory() {
        return restaurantDirectory == null ? restaurantDirectory = new RestaurantDirectory() : restaurantDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory == null ? customerDirectory = new CustomerDirectory() : customerDirectory;
    }

    public DeliveryManDirectory getDeliveryManDirectory() {
        return deliveryManDirectory == null ? deliveryManDirectory = new DeliveryManDirectory() : deliveryManDirectory;
    }
    private CustomerDirectory customerDirectory;
    private DeliveryManDirectory deliveryManDirectory;

    public EcoSystem(RestaurantDirectory restaurantDirectory, CustomerDirectory customerDirectory, DeliveryManDirectory deliveryManDirectory) {
        this.restaurantDirectory = restaurantDirectory;
        this.customerDirectory = customerDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
    }
  
    
    public static EcoSystem getInstance(){
        System.out.println("NewInst");
        if(business==null){
            System.out.println("Set1");
            business=new EcoSystem();
            business.id = 1;
            business.menuId = 1;
            business.orderId=1;
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        
    }

    
    public boolean usernameAvailable(String userName){
       if (!this.getUserAccountDirectory().usernameAvailable(userName)){
           return false;
       }
       for (Restaurant r : this.getRestaurantDirectory().getRestaurantList()) {
            if (!r.getUserAccountDirectory().usernameAvailable(userName)) {
                return false;
            }
       }
       if (!this.getDeliveryManDirectory().usernameAvailable(userName)) {
           return false;
       }
       if(!this.getCustomerDirectory().usernameAvailable(userName)){
           return false;
       }
       // TODO: Check with system admin.
       return true;
    }
    
   
}
