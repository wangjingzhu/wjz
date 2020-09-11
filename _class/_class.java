package cn.itcast._class;

public class _class {
    public static void main(String[] args) throws Exception {
        Class<Person> aClass = Person.class;
        System.out.println(aClass);

        Class<?> aClass1 = Class.forName("cn.itcast._class.Person");
        System.out.println(aClass1);

        Person person =new Person();
        Class<? extends Person> aClass2 = person.getClass();
        System.out.println(aClass2);

        System.out.println(aClass==aClass1);
    }
}
