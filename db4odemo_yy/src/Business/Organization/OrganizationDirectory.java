/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author kathe
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory(){
        organizationList=new ArrayList();
    }
    
    public ArrayList<Organization> getOrganizationList(){
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization=null;
        if(type.getValue().equals(Type.Customer.getValue())){
            organization=new CustomerOrganization();
            organizationList.add(organization);
        }else if(type.getValue().equals(Type.DeliveryMan.getValue())){
            organization=new DeliveryManOrganization();
            organizationList.add(organization);
        }else if(type.getValue().equals(Type.RestaurantAdmin.getValue())){
            organization=new RestaurantManaOrganization();
            organizationList.add(organization);
        }
        
        return organization;
    }
}
