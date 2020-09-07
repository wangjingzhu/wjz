package _MyFunctionalInterface;

import java.util.function.Supplier;

public class Demo_01Suppier {
    public static void main(String[] args) {
        int[] arry = {100,210,50,112,10,0};
      int maxvalue=  getInt(()->{
            int max = arry[0];
            for (int i : arry) {
                if (i>max){
                    max = i;
                }
            }
            return max;
        });
        System.out.println(maxvalue);
    }

    private static int getInt(Supplier<Integer> sup) {
        return sup.get();
    }
}
