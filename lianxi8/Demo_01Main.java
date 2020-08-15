package lianxi8;

public class Demo_01Main {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("盖伦");
        hero.setAge(18);
        Weapon weapon = new Weapon("大宝剑");
        hero.setWeapon(weapon);
        hero.show();

        System.out.println("======================");

        Hero hero1 = new Hero();
        hero1.setName("艾希");
      /*hero1.setsKll(new SkllImpl());  //使用单独定义的实现了
        hero1.show1();*/

        SKll sKll = new SKll() {       //使用匿名内部类
            @Override
            public void use() {
                System.out.println("Biu￥￥￥");
            }
        };
        hero1.setsKll(sKll);
        hero1.show1();

        hero1.setsKll(new SKll() {    //使用匿名对象和匿名内部类
            @Override
            public void use() {
                System.out.println("Biu!!!!");
            }
        });
        hero1.show1();
    }
}
