package Stream;

import java.util.stream.Stream;
//选择后面
public class Demo_Skip {
    public static void main(String[] args) {
        String[] a ={"asd","zxcx","fdsf","xcczx","zxc","aas"};
        Stream<String> stream = Stream.of(a);
        Stream<String> stream1 = stream.skip(5);
        stream1.forEach((s)-> System.out.println(s));
    }
}
