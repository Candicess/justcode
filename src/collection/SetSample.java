package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by huan on 2017/9/24.
 */
public class SetSample {
    public static void main(String[] arg){
        Set<String> hashSet= new HashSet<String>();
        hashSet.add("if");
        hashSet.add("you");
        hashSet.add("wanna");
        hashSet.add("go");
        hashSet.add("then");
        hashSet.add("just");
        hashSet.add("go");
        hashSet.add("now");
        System.out.println(hashSet);

        Set<String> treeSet= new TreeSet<>();
        treeSet.add("if");
        treeSet.add("you");
        treeSet.add("wanna");
        treeSet.add("go");
        treeSet.add("then");
        treeSet.add("just");
        treeSet.add("go");
        treeSet.add("now");
        System.out.println(treeSet);
    }
}
