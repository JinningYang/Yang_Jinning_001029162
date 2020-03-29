/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory extends UserAccountDirectory{
    private ArrayList<Customer> customerList;
    
    public CustomerDirectory(){
        customerList=new ArrayList();
    }
    
    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public Customer createCustomer(String name){
        Customer customer=new Customer();
        customer.setName(name);
        customerList.add(customer);
        return customer;
    }
}
