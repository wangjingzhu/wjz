package lianxi4;

public class Demo_01 {
    public static void main(String[] args) {
        String str ="wjz";
        String str1="wjz";
        String st2 = "WJZ";
        System.out.println(str==str1);
        System.out.println(st2.equals(str1) );
        System.out.println(st2.equalsIgnoreCase(str));
    }
}
