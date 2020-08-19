package lambda;

public class lambda01 {
    public static void main(String[] args) {
        invokeCook(new Cook() {
            @Override
            public void makefood() {
                System.out.println("吃饭了");  //匿名内部类
            }
        });

        invokeCook(()->{
            System.out.println("吃饭了");   //Lambda表达式
        });

        invokeCook(()-> System.out.println("吃饭了"));  //Lambda表达式优化
    }
    public static void invokeCook(Cook cook){
        cook.makefood();
    }
}
