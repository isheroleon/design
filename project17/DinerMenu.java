package com.zpkj.project17;

import java.util.Arrays;

/**
 * 午餐菜单
 */
public class DinerMenu implements CreateIterator{
    
    static final int MAX_ITEMS = 6;
    
    int numberOfItems = 0;
    
    MenuItem[] menuItems;

    public DinerMenu() {
        super();
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", "描述", true, 2.99);
        addItem("Vegetarian BLT", "描述", true, 2.99);
        addItem("Vegetarian BLT", "描述", true, 2.99);
        addItem("Vegetarian BLT", "描述", true, 2.99);
       
    }
    
    public void addItem(String name,String description,boolean vegetarian,double price){
        MenuItem menuItem =new MenuItem(name, description, vegetarian, price);
        if(numberOfItems>=6){
            System.out.println("sorry,menu is full!can't add item to menu");
        }else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }
    
    public MyIterator<Object> createMyIterator(){
        return new DinerMenuIterator(menuItems);
    }


    @Override
    public String toString() {
        return "DinerMenu [numberOfItems=" + numberOfItems + ", menuItems=" + Arrays.toString(menuItems) + "]";
    }
    
    

    
    
    
}
