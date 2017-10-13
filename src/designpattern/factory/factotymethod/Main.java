package designpattern.factory.factotymethod;

import designpattern.factory.ICoffee;

public class Main {
    public static void main(String[] args){
        IFactory factory = new CapuFactory();
        ICoffee coffee = factory.makeCoffee();
        System.out.println(coffee.getFlavor());
        System.gc();
    }
}
