package GraMmer;

public class BMI {
    public static void main(String[] args) {
        double h=1.72;int w=70;double BMI;BMI=w/(h*h);
        System.out.println("你的身高为:" +h);
        System.out.println("你的体重是:" +w);
        System.out.println("你的BMI为:" +BMI);
        System.out.println("你的体重属于:");
        if (BMI<18.5)System.out.println("体重过轻");
        if (BMI>18.5 && BMI<24.9)System.out.println("正常范围");
        if (BMI>24.9 && BMI<29.9)System.out.println("体重过重");
        if (BMI>29.9)System.out.println("肥胖");

    }
}
