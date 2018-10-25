package com.zpkj.project17;

import java.util.ArrayList;
/**
 * 煎饼屋菜单
 */
public class PancakeHouseMenu implements CreateIterator{
    
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        super();
        menuItems = new ArrayList<MenuItem>();
        addItem("K&B's Pancake Breakfast", "Pancakes whih scrambled eggs, and toast", true, 2.99);
        
        addItem("Regular Pancake Breakfast", "Pancakes whih fired eggs, sausage", false, 2.99);
        
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        
        addItem("Waffles", "whih your choice of blueberries or strawberries", true, 3.59);
        
    }
    
    public void addItem(String name,String description,boolean vegetarian,double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
    

    @Override
    public String toString() {
        return "PancakeHouseMenu [menuItems=" + menuItems + "]";
    }

    @Override
    public MyIterator<Object> createMyIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
    
    
    
    
    
    
    

}
