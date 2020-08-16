package Lianxi9;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Demo_01 {
    public static void main(String[] args) {
//        Calendar time = Calendar.getInstance();
//        System.out.println(time.get(Calendar.YEAR) + "  " + time.get(Calendar.MONTH)
//         + "  " + time.get(Calendar.DATE));
//        System.out.println(time.getTime());


//        long l = System.currentTimeMillis();
//        for (int i = 0; i < 9999; i++) {
//            System.out.println(i);
//        }
//        long l1 = System.currentTimeMillis();
//        System.out.println(l1-l);
//        int[] src = {1,2,3,4,5,6};
//        int[] dest = {2,3,4,9,10,11};
//        System.out.println(Arrays.toString(dest));
//        System.arraycopy(src,0,dest,0,3);
//        System.out.println(Arrays.toString(dest));

//        String sr = "asd";
//        StringBuilder stringBuilder = new StringBuilder(sr);
//        stringBuilder.append("asd").append("zxc");
//        System.out.println(stringBuilder);
//        System.out.println(stringBuilder.toString());

//        String sr = 100+"woao";
//        System.out.println(sr+30);

//        Collection<String> collection = new ArrayList<>();
//        collection.add("whz");
//        collection.add("asd");
//        collection.add("fdsd");
//        collection.add("xvc");
//        System.out.println(collection);
//
//        boolean b = collection.contains("whz");
//        System.out.println(b);
//
//        collection.remove("asd");
//        System.out.println(collection);
//
//       collection.clear();
//        System.out.println(collection);
//
//        System.out.println(collection.isEmpty());

//          Collection collection = new ArrayList();
//          collection.add("sdqa");
//          collection.add("szxc");
//          collection.add("xvca");
//          collection.add("sxbfea");
//          Iterator l1 = collection.iterator();  //获取迭代器的实现对象，使用Iterator接口接收（多态）
//            while (l1.hasNext()){                 //.hasNext判断还有没有下一个元素，返回boolers
//               Object l2 = l1.next();            //.next 取出集合下一个元素
//               System.out.println(l2);
//            }

//        int[] a = {1,3,2,4};
//        for (int b  : a) {
//            System.out.println(b);
//        }

//        inter inter = new inter();
//        inter.qwe(21);
//        inter<Integer> inter1 = new inter();
//        inter1.qwe(1);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(12);
        arrayList.add(14);
        arrayList.add(15);
        show(arrayList);
    }
    public static void show(ArrayList<Integer> a){
//        Iterator<?> iterator = a.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        for (Object object : a){
            System.out.println(object);
        }
    }
}
