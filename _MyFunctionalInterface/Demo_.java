package _MyFunctionalInterface;

import java.util.Arrays;
import java.util.Comparator;

public class Demo_ {
    public static Comparator<String> getComparator(){
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return ;
//            }
//        }
        return (o1,o2)->o1.length()-o2.length();
    }

    public static void main(String[] args) {
        String[] arry = {"qweqwe","zxc","asdasddsaasdas"};
        Arrays.sort(arry,getComparator());
        System.out.println(Arrays.toString(arry));
    }
}
