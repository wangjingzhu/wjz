package Stream;
//消费
import java.util.stream.Stream;

public class Demo_Foreach {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("挖矿", "切沃", "阿萨的", "自行车");
        stream.forEach(name-> System.out.println(name));
    }
}
