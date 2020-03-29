/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author kathe
 */
public class SysAdminOrganization extends Organization{
    
    public SysAdminOrganization(){
        super(Type.SysAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
       ArrayList<Role>roles=new ArrayList();
       roles.add(new SystemAdminRole());
       return roles;
    }
    
}
