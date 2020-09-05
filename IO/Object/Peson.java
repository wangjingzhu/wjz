package IO.Object;

import java.io.Serializable;

public class Peson implements Serializable {  //Serializable序列化反序列化标记接口
    static final long serialVersionUID = -1L;   //自定义序列号
    String name ;
    int age ;

    @Override
    public String toString() {
        return "Peson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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

    public Peson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Peson() {
    }
}
