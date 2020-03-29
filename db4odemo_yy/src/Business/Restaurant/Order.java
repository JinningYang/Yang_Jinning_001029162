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
public class Order {
    private int orderId;
    private UserAccount orderCustomer;
    private UserAccount orderDeliveryman;
    private Menu orderMenu;
    private Restaurant restaurant;
    public static int count;
    private String status;
    private String evaluation;

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public static void setCount(int n) {
        count = n;
    }
    public static int getCount() {
        return count;
    }
    
    public Order(){
        orderId=count;
        count++;
    }
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public UserAccount getOrderCustomer() {
        return orderCustomer;
    }

    public void setOrderCustomer(UserAccount orderCustomer) {
        this.orderCustomer = orderCustomer;
    }

    public UserAccount getOrderDeliveryman() {
        return orderDeliveryman;
    }

    public void setOrderDeliveryman(UserAccount orderDeliveryman) {
        this.orderDeliveryman = orderDeliveryman;
    }

    public Menu getOrderMenu() {
        return orderMenu;
    }

    public void setOrderMenu(Menu orderMenu) {
        this.orderMenu = orderMenu;
    }
    
}
