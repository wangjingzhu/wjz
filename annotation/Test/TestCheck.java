package cn.itcast.annotation.Test;

/*简单的测试框架
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCheck {
    public static void main(String[] args) throws IOException {
        Calculator c = new Calculator();
        Class cls = c.getClass();
        Method[] methods = cls.getMethods();

        int number = 0;  //出现异常次数
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\Program Files\\IDde gzqj\\WJZ1\\src\\cn\\itcast\\annotation\\bug.txt"));
        for (Method method : methods) {
            if (method.isAnnotationPresent(Check.class)){
                try {
                    method.invoke(c);
                } catch (Exception e) {      //捕获异常
                    number++;           //记录异常次数
                    bw.write(method.getName()+"方法出异常了");
                    bw.newLine();
                    bw.write("异常的名称："+e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因"+e.getCause().getMessage());
                    bw.newLine();
                    bw.write("---------------------------");
                    bw.newLine();
                }
            }
        }
        bw.write("本次测试一共出现"+ number +"次异常");
        bw.flush();
        bw.close();
    }
}
