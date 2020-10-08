package cn.itcast.test;

import cn.itcast.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    @Before                      //资源申请：所有测试方法执行前执行
    public void init(){
        System.out.println("init...");
    }
    @After                        //资源释放：所有测试方法执行完执行
    public void close(){
        System.out.println("close..");
    }

    @Test
    public void Testadd(){
        Calculator cl =new Calculator();
        int result = cl.add(1, 2);

        Assert.assertEquals(3,result);        //断言
    }
}
