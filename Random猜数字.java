package WHILE;


import java.util.Random;
import java.util.Scanner;

public class Random猜数字 {
    public static void main(String[] args) {
    //要完成猜数字的游戏，首先需要一个猜的数字，使用随机数生成该数字，范围
        Random r = new Random();
        int number = r.nextInt(100)+1;

        while (true){
            //使用程序实现猜数字，每次均要输入猜测的数字值，需要使用键盘录入实现
            Scanner sc = new Scanner(System.in);
            System.out.println("请速入你要猜的数字: ");
            int guessNumber = sc.nextInt();


            if (guessNumber > number){
                System.out.println("你猜的数字大了！");
            }else if (guessNumber < number){
                System.out.println("你猜的数字小了！");
            }else{
                System.out.println("你猜对了！");
                break;
            }
        }

    }
}
