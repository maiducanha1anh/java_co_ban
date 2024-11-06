package Baitap1;
import java.util.Scanner;
public class bai7_Baitap1 {
    public static void main(String[] args) {
        //bài7: Viết chương trình nhập bán kính của hình tròn  và tính chu vi và diện tích của hình tròn đó.
                int a;
                float PI;
                PI = 3.14f;
                Scanner scanner = new Scanner(System.in);
                a= scanner.nextInt();
                System.out.println("chu vi hinh tron="+(2*a*PI));
                System.out.println("dien tich hinh tron= "+(PI*a*a));
    }
}
