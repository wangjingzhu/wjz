package cn.Test.jedis.test;

import cn.Test.jedis.util.JedisPoolUtils;
import org.junit.Test;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class JedisTest {
    @Test
    public void test1(){
        Jedis jedis = new Jedis("Localhost",6379);
        jedis.set("username","zhangsan");
        jedis.close();

    }
    @Test
    public void test2(){
        Jedis jedis = new Jedis("Localhost",6379);
        jedis.setex("activecode",20,"hehe");
        jedis.close();
    }
    @Test
    public void test3(){
        Jedis jedis = new Jedis("Localhost",6379);
        jedis.hset("user","name","lisi");
        jedis.hset("user","age","23");
        jedis.hset("user","gender","male");
        String name = jedis.hget("user", "name");
        System.out.println(name);
        Map<String, String> map = jedis.hgetAll("user");
        Set<String> key = map.keySet();
        for (String k : key) {
            String value = map.get(k);
            System.out.println(k +":"+value);
        }
    }
    @Test
    public void test4() {
        Jedis jedis = new Jedis();
        jedis.lpush("mylist","a","b","c");
        jedis.rpush("mylist","a","b","c");
        List<String> mylist = jedis.lrange("mylist", 0, -1);
        System.out.println(mylist);   //[c, b, a, a, b, c]
        String element1 = jedis.lpop("mylist");   //lpop左边第一个弹出
        System.out.println(element1);   //c
        String element2 = jedis.rpop("mylist");//rpop右边第一个弹出
        System.out.println(element2);   //c
    }
    @Test
    public void test5() {
        Jedis jedis = new Jedis();
        jedis.sadd("myset","java","php","c++");
        Set<String> myset = jedis.smembers("myset");
        System.out.println(myset);
    }
    @Test
    public void test6() {
        Jedis jedis = new Jedis();
        jedis.zadd("mysortedset",3,"亚索");
        jedis.zadd("mysortedset",30,"寒冰");
        jedis.zadd("mysortedset",35,"盖伦");
        Set<String> mysortedset = jedis.zrange("mysortedset", 0, -1);
        System.out.println(mysortedset);
    }
    @Test    //jedis连接池
    public void test7() {
        JedisPool jedisPool = new JedisPool();
        Jedis jedis = jedisPool.getResource();
        String String = jedis.set("String", "haha");
        jedis.close();

    }
    @Test
    public void test8(){
        Jedis jedis = JedisPoolUtils.getJedis();   //通过连接池工具获取
        jedis.set("hello","heihei");
        jedis.close();


    }

}
