/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author kathe
 */
public class OrderDirectory {
    private ArrayList<Order>orderList;

    public ArrayList<Order> getOrderList() {
        return orderList;
    }
    
    OrderDirectory(){
        orderList=new ArrayList();
    }
}
