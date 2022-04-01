package If;

import java.util.Scanner;
public class if判断奇偶数 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int x = sc.nextInt();
     if (x%2==0){
         System.out.println("这个数是偶数");
     }else{
         System.out.println("这个数是奇数");
     }
     System.out.println("结束");


    }
}
