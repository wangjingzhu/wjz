package lianxi1;

import java.lang.reflect.Array;
import java.util.Arrays;
/**数组的拷贝 4种方式
 * 1.for
 * 2.Arrays.copyof
 * 3.System.arraycopy
 * 4. .clone()产生了一个一模一样的副本
 * 4种都是浅拷贝
 *  浅拷贝  深拷贝
 * */
public class lianxi2 {
   /* public static int[] copyArray(int[] array) {
        int[] ret = new  int[array.length];
        for (int i = 0; i <array.length ; i++) {
            ret[i] = array[i];
        }
        return ret;
    }*/

    /*public static void main(String[] args) {
     int[] array = {1,2,3,4,5,6,7};
     int[] ret = Arrays.copyOf(array,array.length);
     System.out.println(Arrays.toString(ret));
    }*/
    public static void main(String[] args) {
        int[] array = {1,2,3,4,10,12};
        System.out.println(isUp(array));
    }

    public static boolean isUp(int[] args) {
        for (int i = 0; i <args.length-1 ; i++) {
            if (args[i]>args[i+1]){
                return false;
            }
        }
        return true;
    }
}
