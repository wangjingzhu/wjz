package lianxi8;

public class Hero {
    private String name;
    private int age;
    private Weapon weapon;
    private SKll sKll;

    public void show1(){
        System.out.println("我叫" + name + "，开始释放技能了");
        sKll.use(); //调用接口的抽象方法
    }

    public SKll getsKll() {
        return sKll;
    }

    public void setsKll(SKll sKll) {
        this.sKll = sKll;
    }

    public void show(){
        System.out.println(age + "岁的" + name + "用他的" + weapon.getCode() +"打项怡娜");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Hero(String name, int age, Weapon weapon,SKll sKll) {
        this.name = name;
        this.age = age;
        this.weapon = weapon;
        this.sKll = sKll;
    }

    public Hero() {
    }
}
