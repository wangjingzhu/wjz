package lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Demo01Arrays {
    public static void main(String[] args) {
        Penson[] arry ={
                new Penson("妲己",18),
                new Penson("法鸡",23),
                new Penson("去昂",45),
        };
//        Arrays.sort(arry, new Comparator<Penson>() {
//            @Override
//            public int compare(Penson o1, Penson o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });
//        Arrays.sort(arry,(Penson o1, Penson o2)->{      //Lambda表达式
//            return o1.getAge()-o2.getAge();});

        Arrays.sort(arry,( o1,  o2)->o1.getAge()-o2.getAge()); //Lambda表达式优化
        for (Penson s :arry){
            System.out.println(s);
        }
    }
}
