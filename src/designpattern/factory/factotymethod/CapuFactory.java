package designpattern.factory.factotymethod;

import designpattern.factory.CapuCoffee;
import designpattern.factory.ICoffee;

public class CapuFactory implements IFactory {

    @Override
    public ICoffee makeCoffee() {
        return new CapuCoffee();
    }
}
