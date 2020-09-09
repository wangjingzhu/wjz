package _File;
  //                      递归计算
public class Demo {
    public static void main(String[] args) {
        int s = sum(3);
        System.out.println(s);
        int s1 = sum1(3);
        System.out.println(s1);
    }
    public static int sum(int n){
        if (n==1){
            return 1;            //1-n之间的和
        }
        return n + sum(n-1);
    }
    public static int sum1(int n){
        if (n==1){
            return 1;             //递归阶乘
        }
        return n *sum1(n-1);
    }
}
