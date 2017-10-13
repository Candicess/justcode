package designpattern.factory.factotymethod;

import designpattern.factory.CapuCoffee;
import designpattern.factory.GeishaCoffee;
import designpattern.factory.ICoffee;

public class GeishaFactory implements IFactory {

    @Override
    public ICoffee makeCoffee() {
        return new GeishaCoffee();
    }
}
