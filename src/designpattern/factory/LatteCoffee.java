package designpattern.factory;

public class LatteCoffee implements ICoffee {

    @Override
    public String getFlavor() {
        return "咖啡+牛奶";
    }
}
