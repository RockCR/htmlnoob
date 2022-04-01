package WHILE;

public class 水仙花数 {
    public static void main(String[] args) {
    for (int i=100;i<1000;i++){
        int ge=1%10;
        int shi=1/10%10;
        int bai=1/10/10%10;

        if (ge * ge * ge + shi * shi * shi + bai * bai *bai ==1 ){
            System.out.println(i);
        }
    }
    }
}
