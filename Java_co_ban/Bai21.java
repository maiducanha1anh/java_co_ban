package Java_co_ban;

public class Bai21 {
    public static void main(String[] args) {
        //phương thức
        //Là tập các lệnh, cú pháp được nhóm lại với nhau bên trong một lớp để thực hiện một chức năng hoàn chỉnh nào đó
        //Ta có thể cung cấp các thông tin cần thiết cho phương thức hoạt động thông qua tham số truyền vào
        //Sử dụng phương thức để tái sử dụng lại code
        //Còn có tên khác là hàm (function)
        //Cú pháp: access_modifier type name(params) {body}
        //Gọi phương thức:tên(danh sách tham số);
        
        int a = 56, b = 120;

        int tong = add(200, 60);
        System.out.println("tong = " + tong);

        int[] numbers = {120, 200, 323, 14, 5};

        float avg = average(numbers);
        System.out.println("gia tri trung binh: " + avg);
        }
        public static void findMax(int a, int b, int c) {
            int max = a;
            if(max < b) {
                max = b;
            
            }
            if(max < c) {
                max = c;
            }
            System.out.println("MAX = " + max);
            
        }



        public static int add(int a, int b) {
            int sum = a + b;
            return sum;
            
        }
        public static float average(int[] arr) {
            int sum = 0;
            for (int i : arr) {
                sum +=i;
            }

            return (float) sum / arr.length;
            
        }
        public static void dosomething() {
            //bla bla
        }
    }

