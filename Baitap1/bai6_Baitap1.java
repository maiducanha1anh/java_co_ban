package Baitap1;
import java.util.Scanner;
public class bai6_Baitap1 {
    public static void main(String[] args) {
        // bài6: viết chương trình nhập vào hai cạnh của hình chữ nhật và tính chu vi và diện tích hình chữ nhạy đó.
            int a,b;
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println("chu vi hinh chu nhat= "+((a+b)*2));
            System.out.println("dien tich hinh chu nhat= "+(a*b));
    }
}
