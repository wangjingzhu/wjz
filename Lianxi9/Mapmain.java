package Lianxi9;

import java.awt.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapmain {
    public static void main(String[] args) {
//        Map<String,Integer> name = new HashMap<>();
//        Integer asd1 = name.put("asd", 12);
//        System.out.println(asd1);
//        Object i = name.put("asd",14);
//        System.out.println(i);
//        name.put("aZXd",145);
//        name.put("ASsd",15);
//        name.put("afgz",17);
//        System.out.println(name);
//
//        Integer asd = name.remove("asd");
//        System.out.println(asd);
//
//        Integer aSsd = name.get("ASsd");
//        System.out.println(aSsd);
//        Integer xzc = name.get("xzc");
//        System.out.println(xzc);
//        System.out.println("==============");
        Map<String,Integer> name = new HashMap<>();
        name.put("诈欺我",18);
        name.put("自行车",50);
        name.put("阿萨",239);
        name.put("附属国",59);
        Set<String> set = name.keySet();           //keyset方法取出key值，get获取value，进行遍历
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            Integer value = name.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("=================================");
        for (String key1 :set){
            Integer value1 = name.get(key1);
            System.out.println(key1 + "" + value1);
        }

        System.out.println("=============================");

        Map<String,Integer> name1 = new HashMap<>();
        name1.put("hjg",18);
        name1.put("自vbn",50);
        name1.put("ui",239);
        name1.put("rty",59);
        Set<Map.Entry<String, Integer>> entrySet = name1.entrySet(); //利用Map.Entry中的entryset方法，把K和V放到一个set集合里
        Iterator<Map.Entry<String, Integer>> iterator1 = entrySet.iterator();
        while (iterator1.hasNext()){
            Map.Entry<String, Integer> next = iterator1.next();
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key + value);
        }
        System.out.println("====================================");
        for (Map.Entry<String, Integer> a : name1.entrySet()){
            System.out.println( a.getKey() + "!!" +a.getValue() );
        }
    }
}
