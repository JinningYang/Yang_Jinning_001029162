/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    private ArrayList<Restaurant>restaurantList;
    public void setRestaurantList(ArrayList<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }
    
    public RestaurantDirectory(){
        restaurantList=new ArrayList();
    }
    
    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }
    public Restaurant createRestaurant(String name){
        Restaurant restaurant = new Restaurant(name);
        restaurant.setName(name);
        restaurantList.add(restaurant);
        return restaurant;
    }
}
