package WHILE;

import java.util.Scanner;

public class 规律求和 {
    public static void main(String[] args) {
        int num1 = 1, num2 = 1, temp;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入查看第N个数中的值:");

        int num = sc.nextInt();

        for (int i = 2; i < num; i++) {
            num1 += num2;
            //交换num1和num2的值
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("第" +num + "个数为" +num2);
    }
}