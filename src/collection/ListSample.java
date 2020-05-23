package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by huan on 2017/9/24.
 */
public class ListSample {

    public static void main(String[] args) {
        //        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("a", "b", "c"));
        //        System.out.println(stringList);

        List<String> sample = new ArrayList<String>();
        sample.add("C");

        List<String> linkedSample = new LinkedList<String>();
        linkedSample.add("i");

        //        "a"+"b"+"c";

        new StringBuilder().append("a").append("b").toString();
        new StringBuffer().append("a").append("b").toString();
    }

}
