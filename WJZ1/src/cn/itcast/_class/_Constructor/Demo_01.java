package cn.itcast._class._Constructor;

import cn.itcast._class.Person;

import java.lang.reflect.Constructor;

class Demo_01 {
    public static void main(String[] args) throws Exception {
        Class<Person> personClass = Person.class;
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        Person person = constructor.newInstance("whj", 12);
        System.out.println(person);

        Person person1 = personClass.newInstance();   //空参构造方法
        System.out.println(person1);
    }
}
