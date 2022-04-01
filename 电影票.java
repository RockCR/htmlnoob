package WHILE;


public class 电影票 {
    public static void main(String[] args) {
    System.out.println("剧院可售座位信息:" );


    for (int i =1;i<=4;i++){
        for (int j =1;j<=10;j++){
            if (j==1 || i==10){
                continue;
            }else {
                System.out.println("第"+i + "排,第" + i + "列可售");
            }
        }
    }

    }
}
