package dynamicproxy;

public class Cat implements IAnimal {

    @Override
    public void eat() {
        System.out.println("cat eat");
    }

    @Override
    public void sleep() {
        System.out.println("cat sleep");
    }
}
