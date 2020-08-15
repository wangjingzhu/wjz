package lianxi8;
 // 接口作为方法的参数或返回值
import java.util.ArrayList;
import java.util.List;

public class ArraylistInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list1 = addNames(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list1.get(i));
        }
    }

    public static List<String> addNames(List<String> list){
        list.add("wjz");
        list.add("wqwe");
        list.add("wxzc");
        return list;
    }
}
