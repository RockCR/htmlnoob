package WHILE;

import java.util.Scanner;

public class 金字塔 {
    public static void main(String[] args) {
        int a, b, c;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数:");

        int num = sc.nextInt();

        for (a = 1; a <= num; a++) {
            for (b = 1; b <= num - a; b++) {
                System.out.print(" ");
            }
            for (c = 1; c <= 2 * a - 1; c++) {
                System.out.print("*");
            }
            System.out.print("\n");


        }
    }
}