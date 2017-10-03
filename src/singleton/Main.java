package singleton;

import interfacecallback.A;

public class Main {

    public void whatEver(){
        A a = new A();
        Singleton.getInstance().setA(a);
    }

}
