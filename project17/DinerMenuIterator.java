package com.zpkj.project17;


public class DinerMenuIterator implements MyIterator<Object> {
    
    MenuItem[] menuItems;
    
    int position = 0;
    
    protected DinerMenuIterator(MenuItem[] menuItems) {
        super();
        this.menuItems = menuItems;
    }

    
    @Override
    public boolean hasNext() {
        if(position>=menuItems.length ||menuItems[position]==null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }
    
}
