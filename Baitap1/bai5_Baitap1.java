package Baitap1;
import java.util.Scanner;
public class bai5_Baitap1 {
    public static void main(String[] args) {
        // bài 5: Hãy nhập 4 số thực a,b,c,d. Tìm giá trị lớn nhất của chúng và gán giá trị lớn nhất đó cho biến max.In giá trị MAx tìm được ra màn hình.Trong trường hợp 4 số bằng nhau thì in ra: không có số lớn nhất.
            float a,b,c,d;
            float MAX;
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextFloat();
            b = scanner.nextFloat();
            c = scanner.nextFloat();
            d = scanner.nextFloat();
            System.out.println("nhap bon so thuc tu bam phim:");
            System.out.println("a= "+a);
            System.out.println("b= "+b);
            System.out.println("c= "+c);
            System.out.println("d= "+d);
            if(a>b && a>c && a>d){
                MAX = a;
                System.out.println("so lon nhat la: "+MAX);
            }
            else if(b>a && b>c && b>d){
                MAX = b;
                System.out.println("so lon nhat la: "+MAX);
            }
            else if(c>b && c>a && c>d){
                MAX = c;
                System.out.println("so lon nhat la: "+MAX);
            }
            else if(d>a && d>c && d>b){
                MAX = d;
                System.out.println("so lon nhat la: "+MAX);
            }
            else if (a==b && b==c && c==d){
                System.out.println("khong co so lon nhat");
            }
    }
}
