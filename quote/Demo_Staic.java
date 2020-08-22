package quote;

import lambda.Calculator;

public class Demo_Staic {
    public static int method(int num, Calcable c){
        return c.calsAbs(num);

    }
    public static void main(String[] args) {
//        int i = method(-10, (m) -> {
//            return Math.abs(m);
//        });
        int i = method(-10,Math::abs);
        System.out.println(i);
    }
}
