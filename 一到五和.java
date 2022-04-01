package WHILE;

public class 一到五和 {
    public static void main(String[] args) {
        int x=1,y=1;
        while (x<=5){
            y+=x;
            x++;
        }
        System.out.println("一到五的和为："+y);
    }
}
