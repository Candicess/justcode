package singleton;

/**
 * 外部使用不能new，只能SingletonThreadSafe.getInstance()
 * 线程安全
 *
 *
 */
public class SingletonThreadSafe {

    private static SingletonThreadSafe instance;

    private SingletonThreadSafe() {
    }

    public static SingletonThreadSafe getInstance(){
        if (instance == null) {
            synchronized(SingletonThreadSafe.class){
                if (instance == null){
                    instance = new SingletonThreadSafe();
                }
            }
        }
        return instance;
    }
}