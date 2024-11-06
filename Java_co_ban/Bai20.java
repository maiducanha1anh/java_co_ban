package Java_co_ban;

public class Bai20 {
    public static void main(String[] args) {
        //lệnh break, continue
        //break dùng để thoát khỏi vòng lặp
        //coutinue để bỏ qua vòng lặp hiện thời

        int sum = 0;
        int n = 100;

        String msg = "Hello World";

        // for(int i = 0; i < n; i++){
        //     sum += i;
        //     System.out.println("i = " + i);
        //     if(i == 10) {
        //         break;
        //     }
        // }

        // System.out.println("sum = " + sum);

        // for(int i =0; i < msg.length(); i++){
        //     if(msg.charAt(i) > 'o') {
        //         break;
        //     }
        //     System.out.println(msg.charAt(i));
        // }

        for (int i = 0; i < n; i++){
            if(i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
