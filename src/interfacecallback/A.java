package interfacecallback;

public class A {
    public static void main(String[] args){
        B b = new B();
        b.a = 2;

        //clone demo
        b.p.phoenix = 250;
        B clone = (B) b.clone();
        clone.a = 22;
        clone.p.phoenix = 22222;

        System.out.println("b.基本类型a " + b.a);
        System.out.println("clone.基本类型a "+clone.a);
        System.out.println("b.引用类型 "+ b.p.phoenix);
        System.out.println("clone.引用类型 " + clone.p.phoenix);

        //接口回调
        b.setCallback(new ICallback() {
            @Override
            public void onCallback(String msg) {
                System.out.println("A received "+msg);
            }
        });
        //运行时异常（空指针异常）
        b = null;

        b.doSth();

//        try {
//            b.clone();
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }


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
