package Java_co_ban;

public class Bai13 {
    public static void main(String[] args) {
        //cấu trúc vòng lặp for 
        // Sử dụng để lặp lại đoạn chương trình khi bạn biết chính xác số lần lặp
        //Cú pháp tổng quát:
        //For( khởi tạo;điều kiện;bước nhảy){
       //(Nội dung cần lặp) 
    //}
    for( int i =0; i <=100; i++){
        System.out.println(i);

    }

    // tính tổng từ 1 đến n
    int sum =0;
    int n = 100;
    for(int i=1;i <= n;i++){
        sum += i;
    }
    System.out.println("tong tu 1 den n: "+sum);

    //tính tổng từ 0 đến 1/n
    float tong = 0;
    int a =100;
    for(int i=1;i <= a;i++){
        tong += (float)1/i;
    }
    System.out.println("tong tu 1 den n: " + tong);
    }
}
