package lianxi3;
/*定义以指定格式打印集合得方法（ArrayList类型作为参数），使用{}扩起集合，使用@分割每个元素
* 【元素，元素，元素，元素】 →→→→→   {元素@元素@元素@元素}*/
import java.util.ArrayList;

public class Demo_04 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("wjz");
        list.add("wio");
        list.add("wyu");
        list.add("wrt");
        System.out.println(list);
        printArrayList(list);
    }
    public static void printArrayList(ArrayList  list){
        System.out.print("{");
        for (int i = 0; i <list.size() ; i++) {
            Object name = list.get(i);
            if (i == list.size()-1) {
                System.out.print(name+"}");
            }else {
                System.out.print(name+"@");
            }
        }
    }
}
