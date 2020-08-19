package lambda;

public class CalculatorMain {
    public static void main(String[] args) {
        invokeCalc(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });

        invokeCalc(20,30,(int a, int b)->{return a+b;});  //Lambda表达式

        invokeCalc(40,50,( a,  b)-> a+b);  //Lambda表达式优化


    }
    public static void invokeCalc(int a ,int b ,Calculator calculator){
        int sum = calculator.calc(a,b);
        System.out.println(sum);

    }
}
