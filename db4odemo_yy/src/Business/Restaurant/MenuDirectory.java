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
public class MenuDirectory {
    private ArrayList<Menu> menuList;
    
    public MenuDirectory(){
        menuList=new ArrayList();
    }
    
    public ArrayList<Menu> getMenuList() {
        return menuList;
    }
    
    
    
    
}
