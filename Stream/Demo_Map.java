package Stream;
//map内的Function接口，类型转换
import java.util.stream.Stream;

public class Demo_Map {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4");
        Stream<Integer> stream1 = stream.map((String s) -> Integer.parseInt(s));
        stream1.forEach((s)->{ System.out.println(s);});
    }
}
