package pack;

public class 比较身高 {
    public static void main(String[]args){
        int a=150;
        int b=210;
        int c=165;

        int taller1=a>b?a:b;
        int taller2=taller1>c?taller1:c;
        System.out.println("taller="+taller2);




    }

}
