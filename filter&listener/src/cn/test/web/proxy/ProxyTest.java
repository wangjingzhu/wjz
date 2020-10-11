package cn.test.web.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        //创建真实对象
        Lenovo lenovo = new Lenovo();
        //动态代理增强lenovo对象
        SaleComputer proxy_lenovo = (SaleComputer) Proxy.newProxyInstance(lenovo.getClass().getClassLoader(), lenovo.getClass().getInterfaces(), new InvocationHandler() {
            /*代理逻辑编写的方法：代理对象调用的所有方法都会触发该方法
            * proxy代理对象
            * method代理对象调用的方法被封装为对象
            * args代理对象调用方法时，传递的实际参数*/
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
              /*  System.out.println("该方法执行了。。。");
                System.out.println(method.getName());
                System.out.println(args[0]);*/
                if (method.getName().equals("sale")){
                    double money = (double) args[0];
                    money = money * 0.85;
                    System.out.println("专车接你");
                    String obj = (String) method.invoke(lenovo, money);
                    System.out.println("免费送货");
                    return obj+"_鼠标垫 ";
                }else {
                    Object obj = method.invoke(lenovo, args);
                    return obj;
                }
            }
        });
        String computer = proxy_lenovo.sale(8000);
        System.out.println(computer);
 //       lenovo.show();
    }
}
