/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Restaurant extends Organization{
    private OrganizationDirectory organizationDirectory;
    private MenuDirectory menuDirectory;
    RestaurantManaDirectory managers;

    public RestaurantManaDirectory getManagers() {
        return managers;
    }

    public void setManagers(RestaurantManaDirectory managers) {
        this.managers = managers;
    }
    private OrderDirectory orderDirectory;
    
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    public Restaurant(String name){
        super(name);
        organizationDirectory=new OrganizationDirectory();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    public MenuDirectory getMenuDirectory() {
       return menuDirectory == null ? menuDirectory = new MenuDirectory() : menuDirectory;
    }
    
    public OrderDirectory getOrderDirectory(){
        return orderDirectory == null ? orderDirectory = new OrderDirectory() : orderDirectory;
    }
}
