package Java_co_ban;

public class Bai22 {
    //tham số, đối số
    // tham số được coi như biến cục bộ của một phương thức, được khai báo trong ngoặc tronf khi định nghĩa phương thức 
    //bạn có thẻ khai báo bao nhiêu tham số tùy ý
    //Giá trị truyền vào phương thức khi thực hiện lời gọi được gọi là đối số
    //Tham số chỉ có thể là các biến, đối số có thể là các biến hoặc giá trị cụ thể 
    //Biến của các tham số được sử dụng thay cho nhiều tham số cùng kiểu
    //Cấu trúc: kiểu ..tên_biến
    //Ví dụ: public void add(int...args) {...}
    //Khi sử dụng có thể coi biến các tham số như một biến của mảng 1 chiều
    //Khi gọi phương thức ta có thể truyền bao nhiêu đối số tùy ý



    public static void main(String[] args) {
        // parameter
        //argument
        int a = 20;
        add(200, 20);
        String[] arr = {"Trang", "Nam", "Nhung"};
        showInfo(arr, a);
        float x = 25.3f;
        float y = 3.14156f;
        float[] arrf = {25.25f, 65, 27, 34.6f};
        float[] arrf2 = {25.25f, 65, 27, 34.6f};


        addMultil(arrf);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void showInfo(String[] str, int number) {
        
    }

    public static void addMultil(float...args) {
        float sum = 0;
        for (float arg : args){
            sum += arg;
        }
        System.out.println("Sum= "+sum);
    }



}
