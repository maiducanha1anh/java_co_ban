package Java_co_ban;

public class bai14 {
    public static void main(String[] args) {
        //cấu trúc lặp while
        //sử dụng để lặp lại đoạn chương trình chừng nào điều kiện còn thỏa mãn
        //cú pháp tổng quát:
        //while(điều kiện){
        //nội dung cần lặp
        //}


// tính tổng từ 1 đến 1/n
        
        // float sum = 0;
        // int i = 1;
        // int n= 100;
        // while(i <= n){
        //     sum += (float)1/i;
        //     i++;
        // }
        // System.out.println("sum = " + sum);

// in ra từng kí tự trong xâu

        String a =" hello world";
        int i =0;
        while(i < a.length()) {
            System.out.println(a.charAt(i));
            i++;
        }
// in kí tự trong xâu ngược lại
        String b="hello world";
        int c = b.length()-1;
        while(c>= 0){
            System.out.println(b.charAt(c));

    }
}
