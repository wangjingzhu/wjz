package Stream;

import java.util.stream.Stream;
//选择前面
public class Demo_Limit {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("qwe", "qweqwe", "zxcczx", "sad");
        Stream<String> stream1 = stream.limit(2);
        stream1.forEach((s)->{ System.out.println(s); });
    }
}
