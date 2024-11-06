package Baitap1;

import java.util.Scanner;

public class bai10_Baitap1 {
    public static void main(String[] args) {
        // Bài 10: Nhập vào ba số a, b, c (là các số thực không âm). Kiểm tra xem có phải là ba cạnh của một tam giác hay không.
        // Nếu có thì tam giác đó thuộc loại tam giác gì? (thường, cân, vuông, vuông cân, hay đều)

        float a, b, c;
        Scanner scanner = new Scanner(System.in);
        
        // Nhập ba số
        System.out.println("Nhập vào ba số thực không âm:");
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();
        
        // In ra ba số
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        // Kiểm tra ba số có phải là ba cạnh của một tam giác không
        if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
            System.out.println("Đây là ba cạnh của một tam giác.");
            
            // Kiểm tra tam giác đều
            if (a == b && b == c) {
                System.out.println("Đây là tam giác đều.");
            }
            // Kiểm tra tam giác vuông
            else if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                // Kiểm tra tam giác vuông cân
                if (a == b || a == c || b == c) {
                    System.out.println("Đây là tam giác vuông cân.");
                } else {
                    System.out.println("Đây là tam giác vuông.");
                }
            }
            // Kiểm tra tam giác cân
            else if (a == b || a == c || b == c) {
                System.out.println("Đây là tam giác cân.");
            }
            // Nếu không phải tam giác đều, cân, hoặc vuông, thì là tam giác thường
            else {
                System.out.println("Đây là tam giác thường.");
            }
        } else {
            System.out.println("Đây không phải là ba cạnh của một tam giác.");
        }
        
        // Đóng Scanner
        scanner.close();
    }
}
