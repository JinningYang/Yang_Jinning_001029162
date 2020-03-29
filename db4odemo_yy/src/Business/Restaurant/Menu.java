/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

/**
 *
 * @author kathe
 */
public class Menu {
    private int menuId;
    private String menuName;
    private double price;
    private static int count;
    public static void setCount(int n) {
        count = n;
    }
    public static int getCount() {
        return count;
    }
    public Menu(){
        menuId=count;
        count++;
    }
    public Menu(String name, double price) {
        menuId=count;
        count++;
        this.menuName = name;
        this.price = price;
    }
    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
