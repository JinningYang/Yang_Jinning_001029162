/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.UserAccount.UserAccount;

/**
 *
 * @author kathe
 */
public class RestaurantMana extends UserAccount{
    private Restaurant managedRestaurant;
    public Restaurant getManagedRestaurant() {
        return managedRestaurant;
    }
    public RestaurantMana(Restaurant r) {
        super();
        managedRestaurant = r;
    }
    public RestaurantMana(UserAccount ua, Restaurant r) {
        super(ua);
        managedRestaurant = r;
    }
}
