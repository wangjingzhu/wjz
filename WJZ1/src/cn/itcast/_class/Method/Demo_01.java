package cn.itcast._class.Method;

import cn.itcast._class.Person;

import java.lang.reflect.Method;

public class Demo_01 {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;

        Method eat_method = personClass.getMethod("eat");
        eat_method.invoke(new Person());  //invoke：执行方法

        Method eat_method1 = personClass.getMethod("eat", String.class);
        eat_method1.invoke(new Person(),"苹果");
        System.out.println("====================");
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);//打印所有方法，包括看不到的object里的方法
            String name = method.getName();
            System.out.println(name);   //获取方法名
        }
    }
}
