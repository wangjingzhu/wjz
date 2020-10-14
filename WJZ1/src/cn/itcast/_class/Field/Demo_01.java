package cn.itcast._class.Field;

import cn.itcast._class.Person;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Demo_01 {
    public static void main(String[] args) throws Exception {
        Class<Person> personclass = Person.class;
        Field[] fields = personclass.getFields();    //或者所有public修饰的成员变量
        System.out.println(Arrays.toString(fields));

        Field a = personclass.getField("a");
        System.out.println(a);
        Person p = new Person();
        Object value = a.get(p);
        System.out.println(value);
        a.set(p,"qwe");
        System.out.println(p);
        System.out.println("======================");

        Field[] declaredField = personclass.getDeclaredFields();
        System.out.println(Arrays.toString(declaredField));

        Field name = personclass.getDeclaredField("name");
        name.setAccessible(true);     //暴力反射：忽略访问权限修饰符
        Object value1 = name.get(p);
        System.out.println(value1);

    }
}
