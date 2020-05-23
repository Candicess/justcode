package dynamicproxy;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        //创建中介类实例
        DynamicProxy catProxy = new DynamicProxy(new Cat());

        //获取代理类实例sell
        IAnimal animal = (IAnimal)(Proxy.newProxyInstance(IAnimal.class.getClassLoader(), new Class[] {IAnimal.class}, catProxy));

        //通过代理类对象调用代理类方法，实际上会转到invoke方法调用
        animal.eat();
        animal.sleep();
    }

}
