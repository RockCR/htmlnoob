package grammar_demo;
import java.util.Scanner;

public class 最高的和尚 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int m = x>y?x:y;
        int n = z>m?z:m;
        System.out.println("maxHeight:" +n);
    }
}
