package Lianxi9;

import java.util.*;

public class _HashMap {
    public static void main(String[] args) {
//        show01();
//        System.out.println("================");
//        show02();
//    }
//
//    private static void show02() {
//        HashMap<Person,String> map1 = new HashMap<>();
//        map1.put(new Person("qwe",90),"深圳");
//        map1.put(new Person("ghkh",76),"西安");
//        map1.put(new Person("yuou",456),"山西");
//        map1.put(new Person("qwe",90),"深圳");
//        Set<Map.Entry<Person, String>> set = map1.entrySet();
//        for (Map.Entry<Person, String>  kv : set){
//            System.out.println(kv.getKey() + kv.getValue());   //可以在Person中重写Hashcode和equals来保证k唯一
//        }
//    }
//
//    private static void show01() {
//        HashMap<String,Person> map = new HashMap<>();
//        map.put("北京",new Person("权威",12));
//        map.put("上海",new Person("阿萨",99));
//        map.put("广州",new Person("请问",65));
//        map.put("北京",new Person("转型",15));
//        Set<String> set = map.keySet();
//        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext()){
//            String key = iterator.next();
//            Person value = map.get(key);
//            System.out.println(key + ":" + value);
//        }
//
//        System.out.println("=============================");

        Scanner sc = new Scanner(System.in);    //计算一个字符串中没一个字符出现的次数
        System.out.println("请输入一个字符串： ");
        String str = sc.next();
        HashMap<Character,Integer> map1 = new HashMap<>();
        for (Character c:str.toCharArray()){
            if (map1.containsKey(c)){      //key存在
                Integer value = map1.get(c);
                value++;
                map1.put(c,value);
            }else {                       //key不存在
                map1.put(c,1);
            }
        }
        System.out.println(map1);       //遍历
        for (Character key :map1.keySet()){
            Integer value = map1.get(key);
            System.out.println(key + "=" + value);
        }
    }
}
