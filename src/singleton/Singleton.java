package singleton;

import interfacecallback.A;

public class Singleton {

    private A a;

    public void setA(A a) {
        this.a = a;
    }

    private static Singleton ourInstance = new Singleton();

    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
    }
}
