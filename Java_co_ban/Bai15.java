package Java_co_ban;

public class Bai15 {
    public static void main(String[] args) {
        //Cấu trúc lặp do-while
        //cú pháp tổng quát
        //do{
        //nội dung tổng quát
        //}while{điều kiện};
        int i = 0;
        int n = 3;
        do {
            System.out.println("toi dang o trong vong lap do-while");
            System.out.println("i = "+i);
            i++;
        }while(i < n);

        // for(;true;){
        //     System.out.println("vong lap vo han ");
        // }
        
        while(true){
            System.out.println("vong lap vo han");
        }
    }
}
