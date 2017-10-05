package reference;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/**
 * Created by huan on 2017/9/24.
 */
public class Reference {

    public static void main(String[] rt){
        SoftReference<HashMap<String, Integer>> softHashMap = new SoftReference<HashMap<String, Integer>>(null);
        if (softHashMap != null) {
            HashMap<String, Integer> hashMap = softHashMap.get();
//            hashMap.put()
        }


        WeakReference<HashMap<String, Integer>> weakHashMap = new WeakReference<HashMap<String, Integer>>(null);
        if (weakHashMap != null) {
            HashMap<String, Integer> hashMap = weakHashMap.get();
//            hashMap.put()
        }
    }

}
