package pack;

import java.util.Scanner;

public class 和尚身高 {
    public static void main(String[] args) {
        //键盘录入，创建对象
        Scanner sc = new Scanner(System.in);
        //键盘录入三个身高赋值
        System.out.println("请输入第一个和尚的身高:");
        int height1 = sc.nextInt();
        System.out.println("请输入第二个和尚的身高:");
        int height2 = sc.nextInt();
        System.out.println("请输入第三个和尚的身高:");
        int height3 = sc.nextInt();
        //用三元运算符获取前两个和尚的较高身高，并用临时身高变量暂时保存起来
        int tempHeight = height1 > height2 ? height1 : height2;
        //用临时身高与第三个和尚比较
        int maxheight = tempHeight > height3 ? tempHeight : height3;
        //输出结果
        System.out.println("这三个和尚身高最高的是："+maxheight+"cm");




    }
}