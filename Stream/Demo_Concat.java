package Stream;

import java.util.stream.Stream;
//组合
public class Demo_Concat {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("asd");
        Stream<String> stream1 = Stream.of("zxc");
        Stream<String> concat = Stream.concat(stream, stream1);
        concat.forEach(s -> System.out.println(s));
    }
}
