package Lianxi9;
 //  斗地主发牌
import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class DouDiZhu {
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();  //poker 放的总牌
        String[] colors = {"♣","♠","♥","♦"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        poker.add("大王");
        poker.add("小王");
        for (String number:numbers){
            for (String color:colors){
                poker.add(color+number);
            }
        }
        System.out.println(poker);
        /*洗牌   使用工具类Collections中的shuffle方法对牌随机排序，（静态工具类）*/
        Collections.shuffle(poker);
        /*发牌  定义4个集合，存储玩家牌和底牌*/
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> dipai= new ArrayList<>();
        /*遍历poker集合，获取每一张牌
        * 使用poker遍历的索引%3给3个玩家轮流发牌
        * 剩余3个底牌
        * （要先判断底牌（i>=51），否则牌发没了）*/
        for (int i = 0; i <poker.size() ; i++) {
            String p = poker.get(i);
            if (i >= 51){
                dipai.add(p);
            }else if (i % 3 == 0){
                player01.add(p);
            }else if (i % 3 == 1){
                player02.add(p);
            }else if (i % 3 == 2){
                player03.add(p);
            }
        }
        /*看牌*/
        System.out.println("王京珠 ：" +player01);
        System.out.println("刘德华 ：" +player02);
        System.out.println("周润发 ：" +player03);
        System.out.println("底牌 ：" +dipai);





    }
}
