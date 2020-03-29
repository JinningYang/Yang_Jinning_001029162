/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Organization.EcoSystem;
import Business.Organization.Organization;
import Business.Restaurant.RestaurantMana;
import Business.UserAccount.UserAccount;
import userinterface.RestaurantAdminRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new AdminWorkAreaJPanel(userProcessContainer, (RestaurantMana) account, business);
    }
    public AdminRole() {
        this.roleType = this.roleType.RestaurantAdmin;
    }
    
    
}
