package interfacecallback;

public class A {
    public static void main(String[] args){
        B b = new B();
        b.a = 2;

        b.setCallback(new ICallback() {
            @Override
            public void onCallback(String msg) {
                System.out.println("A received "+msg);
            }
        });
        b = null;
        b.doSth();

        try {
            b.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        if (b instanceof ICallback) {
            System.out.println("hahhahhahah");
        }

        System.out.println("A do my thing");
        System.out.println("A do my thing");
        System.out.println("A do my thing");
        System.out.println("A do my thing");
        System.out.println("A do my thing");
        System.out.println("A do my thing");
        System.out.println("A do my thing");
    }
}
