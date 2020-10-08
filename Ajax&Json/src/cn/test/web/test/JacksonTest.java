package cn.test.web.test;

import cn.test.web.domain.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.util.Date;

public class JacksonTest {
    //java转json
    @Test
    public void Test1() throws Exception {
        Person p = new Person();
        p.setAge(23);
        p.setName("张三");
        p.setGender("男");

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(p);
        System.out.println(json);

    }
    @Test
    public void Test2() throws Exception {
        Person p = new Person();
        p.setAge(23);
        p.setName("张三");
        p.setGender("男");
        p.setBirthday(new Date());

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(p);
        System.out.println(json);
    }
    //json转java
    @Test
    public void Test3() throws Exception {
        String json = "{\"name\":\"张三\",\"age\":23,\"gender\":\"男\"}";
        ObjectMapper mapper =new ObjectMapper();
        Person person = mapper.readValue(json, Person.class);
        System.out.println(person);
    }
}
