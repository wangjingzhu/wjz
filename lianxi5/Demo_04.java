package lianxi5;

//Math.abs 绝对值  Math.ceil 向上取整 Math.floor 向下取整 Math.round 四舍五入   Math.PI 近似圆周率（double）
//计算-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个？

public class Demo_04 {
    public static void main(String[] args) {
        int count = 0;
        double min = -10.8;
        double max = 5.9;
        for (int i = (int)min; i < max; i++) {

            int abs = Math.abs(i);  //绝对值

            if (abs > 6|| abs < 2.1){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("总共有： " + count);
    }
}
