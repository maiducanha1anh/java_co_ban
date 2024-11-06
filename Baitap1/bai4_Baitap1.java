package Baitap1;
import java.util.Scanner;
public class bai4_Baitap1 {
    public static void main(String[] args) {
        //bài4: nhập vào hai số nguyên a,b. So sánh xem số nào lớn hơn, số nào nhỏ hơn hay hai số bằng nhau.In kết quả ra màn hình.
        int a,b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("nhap vao hai so nguyen:");
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        if(a>b){
            System.out.println("a lon hon b");
        }
        else{
            System.out.println("b lon hon a");
        }

    }
}
