package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    static Suitable rabbit = new Suitable();
    public static void main(String[] msg) throws NoSuchFieldException {
//        rabbit.doSomething();

        try {
//            Class<?> clazz = Class.forName("reflection.Suitable");
            Class<Suitable> clazz = Suitable.class;
            Suitable grass = (Suitable) clazz.newInstance();
            Method cappichino = clazz.getDeclaredMethod("doSomething", String.class, int.class);
            cappichino.setAccessible(true);
            cappichino.invoke(grass,"HelloRabbits",25);


            Field nut = clazz.getDeclaredField("nut");
            nut.setInt(grass,25);
            System.out.println(nut.getInt(grass));


            for (Field field : clazz.getDeclaredFields()) {
                System.out.println(field.getName());
            }

            System.out.println("-----------");

            for (Field field: clazz.getFields()) {
                System.out.println(field.getName());
            }


//            System.out.println(clazz.getDeclaredMethods().length);
//            System.out.println(clazz.getMethods().length);


//            grass.doSomething();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
