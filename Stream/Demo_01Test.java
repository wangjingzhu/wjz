package Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Demo_01Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("阿达的");
        list.add("王啊");
        list.add("王静竹");
        list.add("阿瑟东");
        list.add("史蒂夫");
        list.add("张三的");
        list.add("法国");
        Stream<String> one = list.stream().filter((s) -> s.length() == 3).limit(3);
        ArrayList<String> list1 = new ArrayList<>();
        list.add("阿瑟东");
        list.add("张分");
        list.add("张场v");
        list.add("张划局");
        list.add("体育");
        Stream<String> two = list1.stream().filter(s -> s.startsWith("张")).skip(2);
        Stream.concat(one, two).map(s -> new Person(s)).forEach(p -> System.out.println(p));
    }
}
