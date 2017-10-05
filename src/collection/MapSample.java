package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by huan on 2017/9/24.
 */
public class MapSample {

    public static void main(String[] rt){
//        Map<Integer,String> hashMap= new HashMap<Integer,String>();
//        hashMap.put(1,"fool");
//        hashMap.put(2,"js");
//        hashMap.put(3,"jsp");
//        hashMap.put(4,"html");
//        hashMap.put(5,"css");
//        hashMap.put(6,"boto");
//        hashMap.put(7,"jQuery");
//        hashMap.put(8,"React");
//        hashMap.put(9,"Vue");
//        System.out.println(hashMap);

        Map<String,Integer> hashMap= new HashMap<String,Integer>();
        hashMap.put("fool", 1);
        hashMap.put("js", 2);
        hashMap.put("jsp", 3);
        hashMap.put("html", 4);
        hashMap.put("css", 5);
        hashMap.put("boto", 6);
        hashMap.put("jQuery", 7);
        hashMap.put("React", 8);
        hashMap.put("Vue", 9);
        hashMap.put("boto", 60);
        System.out.println(hashMap);
        hashMap=null;

        Map<String,Integer> treeMap= new TreeMap<>();
        treeMap.put("fool", 1);
        treeMap.put("js", 2);
        treeMap.put("jsp", 3);
        treeMap.put("html", 4);
        treeMap.put("css", 5);
        treeMap.put("boto", 6);
        treeMap.put("jQuery", 7);
        treeMap.put("React", 8);
        treeMap.put("Vue", 9);
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Vue", 9);

    }

}
