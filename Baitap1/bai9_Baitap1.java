package Baitap1;
import java.util.Scanner;
public class bai9_Baitap1 {
    public static void main(String[] args) {
        //bài 9 : giải hệ phương trình bậc 2: ax^2 + bx +c =0.
        float a,b,x,c,detal;
        double x1, x2;
        Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            x = scanner.nextInt();
            System.out.println("nhap so nguyen vao phuong trinh: ");
            System.out.println("a= "+a);
            System.out.println("b= "+b);
            System.out.println("c= "+c);
            if(a==0){
            if(b==0){
                if(c==0){
                    System.out.println("phuong trinh co vo so nghiem");
                }
                else{
                    System.out.println("phuong trinh vo nghiem");
                }
            }else{
              x= -c/b;
              System.out.println("phuong trinh co nghiem duy nhat:  "+x);

            }
        }else {
            detal= b*b-4*a*c;
            if (detal>0){
                //hai nghiem phan biet
                x1 = (-b + Math.sqrt(detal)) / (2*a);
                x2 = (-b - Math.sqrt(detal)) / (2*a);
                System.out.println("phuong trinh co hai nghiem phan biet: ");
                System.out.println("nghiem thu nhat: x1= "+ x1);
                System.out.println("nghiem thu hai: x2= "+ x2);
            }else if(detal==0){
                x = -b/ (2*a);
                System.out.println("phuong trinh co mot nghiem duy nhat: ");
                System.out.println("nghiem x = " + x);
            }else{
                System.out.println("phuong trinh tren vo nghiem");
          }
    }
    }
}
