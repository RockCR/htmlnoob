package If;

import java.util.Scanner;
public class 小明的礼物 {
    public static void main(String[] args) {
        System.out.println("开始");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入成绩");

        int num= sc.nextInt();

        if (num==100){
            System.out.println("奖励100元");
        }
        if (num>90 && num<100){
            System.out.println("奖励90元");
        }
        if (num<=90 && num>=80){
            System.out.println("奖励80元");
        }
        if (num>=60 && num<80){
            System.out.println("奖励70元");
        }
        if (num<60 && num>=50){
            System.out.println("奖励批评教育");
        }
        if (num<50 && num>=0){
            System.out.println("等到挨打！！！");
        }
        System.out.println("结束");


    }
}
