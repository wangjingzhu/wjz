package lianxi10;


import java.util.Scanner;

public class DemoExcepion {
    static String[] usernames = {"张三","李四","王五"};
    public static void main(String[] args)  /*throws RegisterException*/ {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要注册的用户名： ");
        String username = sc.next();
        checkUsername(username);

    }
    public  static void checkUsername(String username) /*throws RegisterException*/  {
        for (String name : usernames){
            if (name.equals(username)){
                try {
                    throw new RegisterException("用户名已经注册！");
                }catch (RegisterException e){
                    e.printStackTrace();
                    return;
                }
            }
        }
        System.out.println("恭喜注册成功！");
    }
}
