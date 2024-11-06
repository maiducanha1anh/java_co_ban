package Baitap1;
import java.util.Scanner;
public class bai3_Baitap1 {
    public static void main(String[] args) {
        //bài3:nhập vào hai số nguyên a,b.In ra màn hình tổng ,hiệu,tích,thương của chúng.
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ra hai so a,b: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("a= "+ a);
        System.out.println("b= "+ b);
        System.out.println("a+b= "+(a+b));
        System.out.println("a-b= "+(a-b));
        System.out.println("a*b= "+(a*b));
        System.out.println("a/b= "+(a/b));
    }
   
}
