package lianxi6;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manage manage = new Manage("群主",100);

        Member one = new Member("成员A",0);
        Member two = new Member("成员B",0);
        Member three = new Member("成员C",0);

        manage.show(); //100
        one.show();   //0
        two.show();   //0
        three.show(); //0
        System.out.println("=========================");

        //群主共发了20块钱，分成3个红包
        ArrayList<Integer> redList = manage.send(20,3);
        //三个普通成员收红包
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manage.show(); //100-20=80   6、6、8随机分给三个人
        one.show();
        two.show();
        three.show();
    }
}
