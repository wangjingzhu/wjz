package lianxi8;

public class Body {

    private int num =10;

    public class heart{

        private int num =20;

        public void beat(){
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Body.this.num);

            System.out.println("心脏跳动！");
        }
    }

    public void eat(){
        System.out.println("外部类的方法！");
        new heart().beat();
    }

    public void show(){
        class Eyes{
            public void look(){
                System.out.println("眼睛看！");
            }
        }
        Eyes eyes =new Eyes();
        eyes.look();
    }
}
