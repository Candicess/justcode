package designpattern.factory;

public class CoffeeFactory {

    public static ICoffee makeCoffee(String name) {
        if ("capu".equals(name)) {
            return new CapuCoffee();
        } else if ("latte".equals(name)) {
            return new LatteCoffee();
        } else if ("geisha".equals(name)) {
            return new GeishaCoffee();
        }
        return null;
    }
}