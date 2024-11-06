package Java_co_ban;

public class Bai18 {
    public static void main(String[] args) {
        // mảng 1 chiều
        //mảng là một tập hợp chứa các biến cùng kiểu dưới một tên chung.
        //các phần tử trong một mảng thường nằm ở các vùng nhớ liền kề nhau
        // Cú pháp khai báo : kiểu _dữ_liệu [] tên _mảng;
        //CÚ pháp khởi tạo mảng : kiểu [] tên_mảng = {các giá trị};
        //Truy cập các phần tử mảng qua chỉ số mảng
        //chỉ số mảng luôn bắt đầu từ 0, kết thúc ở length -1

        // vi du: numbers[0]=200; int x = number[2];
        // cấp phát cho mảng: tên_mảng = new kiểu [số lượng phần tử];



        int[] numbers = {1, 2, 3, 4, 5};
        String[] friends = {"Nam","Hung","la","hien"};
        float[] marks = {6.5f, 8.5f, 7.25f, 9.75f};
        // System.out.println("độ dài mảng numbers: " + numbers.length);
        // System.out.println("độ dài mảng friends:"+ friends.length);
        // System.out.println("độ dài mảng marks:"+ marks.length);

        // System.out.println(friends[3]);
        // friends[3] = "hoang";
        // System.out.println(friends[1]);

        // for (int i =0; i < friends.length; i++){
        //     System.out.println("friends[" + i + "]= " + friends[i]);
        // }

        int[] array = new int[100];

        // System.out.println(array[0]);
        // System.out.println(array[10]);

        String[] str = new String[20];
        // System.out.println(str[2]);
        boolean[] bools = new boolean[200];
        bools[1]= true;
        bools[30]= false;
        System.out.println(bools[5]);
    }
}
