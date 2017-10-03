package string;

public class StringDemo {

    public static void main(String[] msg){
//        String s1 = "123";
//        String s1 = "123";
        String s1 = new String("123");
        String s2 = new String("123");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        Integer i1 = -128;
        Integer i2 = -128;

        System.out.println(i1 == i2);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


        long t1 = System.currentTimeMillis();
//        String s = "";
//        for (int i = 0; i < 100000; i++) {
//            s += "hello world";
//        }

//        StringBuffer s = new StringBuffer();
//        for (int i = 0; i < 100000; i++) {
//            s.append("hello world");
//        }

        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            s.append("hello world");
        }

        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);


    }

}
