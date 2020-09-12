package cn.itcast.annotation;

public @interface MyAnno {
    int value();
    String[] name();
    MyAnno1 anno();
    Person pe();


}
