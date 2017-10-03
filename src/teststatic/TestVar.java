package teststatic;

public class TestVar {

    public static String data;

    static int a;
    static {
        a = 1;
    }

    public static class TestVar1{
        static String data;

        public void method() {
            data = "123";
            TestVar.data = "213";
        }

    }
    public static class TestVar2{
        static String data;
    }
    public void test(){

    }
}
