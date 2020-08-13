package lianxi6;

import java.util.ArrayList;
//群主
public class Manage extends User {
    public Manage(){
    }

    public Manage(String name, int money) {
        super(name, money);
    }
    public ArrayList<Integer> send(int totalMonay, int count){
        //首先需要一个集合，用来存储若干个红包金额
        ArrayList<Integer> reList = new ArrayList<>();
        //首先看一个群主自己有多少钱
        int leftMoney = super.getMoney();  //群主当前余额

        if (totalMonay>leftMoney){
            System.out.println("余额不足！");
            return reList; //返回空集合
        }
            //20  100
        //扣钱，其实就是重新设置余额
         super.setMoney(leftMoney-totalMonay);
        //发红包需要平均拆分count份
        int avg = totalMonay / count;
        int mod = totalMonay % count; //余数，也就是甩下的零头
        //除不开的零头，包在最后一个红包当中
        //下面把红包一个一个放在集合当中
        for (int i = 0; i < count - 1; i++) {
            reList.add(avg);
        }
        //最后一个红包
        int last = avg + mod ;
        reList.add(last);
        return reList;
    }
}
