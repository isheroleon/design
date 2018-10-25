package com.zpkj.project17;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements MyIterator<Object>{
    
    ArrayList<MenuItem> menuItems;
    int position=0;

    protected PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
        super();
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position>=menuItems.size() || menuItems.get(position)==null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }

}
