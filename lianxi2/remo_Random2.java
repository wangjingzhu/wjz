package lianxi2;

import java.util.Random;
import java.util.Scanner;

/*猜数字小游戏 */
public class remo_Random2 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入数字：");
            int qwe = scanner.nextInt();
            if (num>qwe){
                System.out.println("太小了请重新猜！");
            }else if (num<qwe){
                System.out.println("太大了想清楚！");
            }else {
                System.out.println("恭喜猜对了！");
                break;
            }
        }
        System.out.println("游戏结束！");
    }
}
