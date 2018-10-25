package com.zpkj.project17;

public class Waitress {
    
    CreateIterator DinerMenuIterator;
    
    CreateIterator DinerMenu;
    
    public Waitress(  PancakeHouseMenu DinerMenuIterator, DinerMenu DinerMenu) {
        this.DinerMenuIterator = DinerMenuIterator;
        this.DinerMenu = DinerMenu;
    }
    public void printMenu(){
        MyIterator<Object> createIterator = DinerMenuIterator.createMyIterator();
        MyIterator<Object> createMyIterator = DinerMenu.createMyIterator();
        printMenuIterator(createIterator);
        System.out.println("-------------");
        printMenuIterator(createMyIterator);
    }
    
    void printMenuIterator(MyIterator<Object> iterator){
        while (iterator.hasNext()) {
            MenuItem item  = (MenuItem)iterator.next();
            System.out.println(item.getName());
            System.out.println(item.getDescription());
            System.out.println(item.getPrice());
        }
    }
    
    

}
