/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Restaurant.Order;
import Business.Role.AdminRole;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private WorkQueue workQueue;
    private ArrayList<Order> historyOrders;

    public ArrayList<Order> getHistoryOrders() {
        return historyOrders;
    }
    public UserAccount() {
        workQueue = new WorkQueue();
        historyOrders = new ArrayList<>();
    }
    public UserAccount(UserAccount other) {
        username = other.username;
        password = other.password;
        employee = other.employee;
        role = other.role;
        workQueue = other.workQueue;
        historyOrders=other.historyOrders;
    }
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}