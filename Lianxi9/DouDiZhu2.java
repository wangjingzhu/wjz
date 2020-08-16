package Lianxi9;

import java.util.*;

public class DouDiZhu2 {
    public static void main(String[] args) {
        HashMap<Integer,String> poker = new HashMap<>();      //1 存牌
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        List<String> colors = List.of("♣", "♠", "♥", "♦");
        List<String> Numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        int index = 0;
        poker.put(index,"大王");
        pokerIndex.add(index);
        index++;
        poker.put(index,"小王");
        pokerIndex.add(index);
        index++;
        for (String number : Numbers) {
            for (String color : colors) {
                poker.put(index,color+number);
                pokerIndex.add(index);
                index++;
            }
        }
         System.out.println(poker);
       //System.out.println(pokerIndex);
        //2 洗牌
        Collections.shuffle(pokerIndex);
        //3 发牌
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();
        for (int i = 0; i <pokerIndex.size() ; i++) {
            Integer in = pokerIndex.get(i);
            if (i>=51){
                dipai.add(in);
            }else if (i%3==0){
                player01.add(in);
            }else if (i%3==1){
                player02.add(in);
            }else if (i%3==2){
                player03.add(in);
            }
        }
        // 4 排序
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(dipai);
        // 5 看牌
        lookpoker("刘德华",poker,player01);
        lookpoker("王京珠",poker,player02);
        lookpoker("周杰伦",poker,player03);
        lookpoker("底牌  ",poker,dipai);
    }
    public static void lookpoker(String name, HashMap<Integer,String> poker,ArrayList<Integer> list){
        System.out.print(name + ":  ");
        for (Integer key : list) {
            String value = poker.get(key);
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
