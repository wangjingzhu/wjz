package Stream;

import java.util.stream.Stream;

public class Demo_filter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("咋护士", "张三丰", "张阿三", "阿莎");
        Stream<String> stream2 = stream.filter((String s)->{return s.startsWith("张");});
        stream2.forEach(name-> System.out.println(name));
    }
}
