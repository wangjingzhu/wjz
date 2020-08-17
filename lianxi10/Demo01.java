package lianxi10;

import java.util.List;

public class Demo01 {
    public static void main(String[] args) {
        try {
            int[] a ={1,2,3};
            System.out.println(a[3]);
            List<Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));
        }catch (RuntimeException e){
            System.out.println(e.toString());;
        }catch (Exception x){
            System.out.println(x.toString());
        }
    }
}
