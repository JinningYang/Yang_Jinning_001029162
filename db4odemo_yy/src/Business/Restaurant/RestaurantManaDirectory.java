/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author kathe
 */
public class RestaurantManaDirectory {
    private ArrayList<RestaurantMana>restaurantManaList;

    public ArrayList<RestaurantMana> getRestaurantManaList() {
        return restaurantManaList;
    }

    public void setRestaurantManaList(ArrayList<RestaurantMana> restaurantManaList) {
        this.restaurantManaList = restaurantManaList;
    }
    
}
