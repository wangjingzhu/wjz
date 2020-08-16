package Lianxi9;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("wjz");
        hashSet.add("wjz");
        hashSet.add("通话");
        hashSet.add("重地");
        hashSet.hashCode();
        System.out.println(hashSet);

//自定义方法
        HashSet<Student> hashSet1 = new HashSet<>();
        Student student = new Student("sad",12);
        Student student1 = new Student("sad",12);
        Student student2 = new Student("asd",14);
        hashSet1.add(student);
        hashSet1.add(student1);
        hashSet1.add(student2);
        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());
        System.out.println(hashSet1);
        System.out.println("=================");
        //可变参数
//        int A = show(12,14);
//        System.out.println(A);
//    }
//    public static int show(int...a){
//        int sum = 0;
//        for (int i : a) {
//            sum += i ;
//        }
//        return sum;

        ArrayList<Student> arrayList = new ArrayList<>();   // 自定义时候，在student中调用Comparable接口
        arrayList.add(new Student("qwe",12));   // Comparable接口中重写compareTo方法  排序
        arrayList.add(new Student("zxc",11));
        arrayList.add(new Student("asd",6));
        Collections.sort(arrayList);
        System.out.println(arrayList);
        System.out.println("================");

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(12);
        arrayList1.add(15);
        arrayList1.add(124);
        arrayList1.sort(new Comparator<Integer>() {  //匿名接口Comparator  重写compare方法
            @Override
            public int compare(Integer o1, Integer o2) {
                return 01-02;  //降序
            }
        });
        System.out.println(arrayList1);
    }
}
