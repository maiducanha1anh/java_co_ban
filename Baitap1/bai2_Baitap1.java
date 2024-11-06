package Baitap1;
import java.util.Scanner;

public class bai2_Baitap1 {
    public static void main(String[] args) {


//bai 2: nhap vao 1 so nguyen n , kiem tra xem so do la am hay duong, chan hay le. in ra ket qua man hinh.
        int a;

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao mot so nguyen: ");
        a = scanner.nextInt();
        System.out.println("a= "+a);
        if (a % 2== 0){
            if(a>0){
                System.out.println("a là số dương chẵn ");
            }
            else{
                System.out.println("a là số âm chẵn");  
            }
                     
        }
        else{
            if(a>0){
                System.out.println("a là số dương lẻ ");
            }
            else{
                System.out.println("a là số âm lẻ ");
            }
        }

    }
}

