package Baitap1;
import java.util.Scanner;
public class bai8_Baitap1 {
    public static void main(String[] args) {
        //bài8: Giải và biện luận phương trình bậc nhất ax +b=0.
            float a,b;
            float x;
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println("a= "+a);
            System.out.println("b= "+b);
            if(a==0){
                if(b==0){
                    System.out.println("phuong trinh co vo so nghiem");
                }
                else{
                    System.out.println("phuong trinh vo nghiem");
                }
            }else{
                x = -b/a;
                System.out.println("phuong trinh co nghiem "+x );
            }
    }
}
