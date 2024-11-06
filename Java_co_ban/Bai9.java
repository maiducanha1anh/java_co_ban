package Java_co_ban;

public class Bai9 {
    public static void main(String[] args) {
        // lớp math
        int a = 100, b = 265;
        float x = -234.16f;

        int max = Math.max(b,a);
        int min = Math.min(a,b);
        System.out.println("min a,b= "+min);
        System.out.println("max a,b= "+ max);
        System.out.println("log(a)= "+ Math.log(a));


        System.out.println("lam tron x: " + Math.round(x));
        System.out.println("lam tron xuong: "+ Math.floor(x));
        System.out.println("lam tron len : "+Math.ceil(x));



    }
}
