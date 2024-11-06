package Baitapthuhanh;
import java.util.*;

public class Cau1 {
    // Lớp tạo email
    class EmailGenerator {
        private Map<String, Integer> emailCountMap;

        // Constructor
        public EmailGenerator() {
            emailCountMap = new HashMap<>();
        }

        // Phương thức chuẩn hóa tên
        private String chuanHoa(String hoTen) {
            hoTen = hoTen.trim().toLowerCase();
            return hoTen.replaceAll("\\s+", " ");
        }

        // Phương thức tạo email
        public String taoEmail(String hoTen) {
            hoTen = chuanHoa(hoTen); 
            String[] parts = hoTen.split(" "); 
            
            String ten = parts[parts.length - 1]; 
            StringBuilder email = new StringBuilder(ten); 
            for (int i = 0; i < parts.length - 1; i++) {
                email.append(parts[i].charAt(0));
            }
            String baseEmail = email.toString();
            String finalEmail = baseEmail;
            if (emailCountMap.containsKey(baseEmail)) {
                int count = emailCountMap.get(baseEmail) + 1;
                emailCountMap.put(baseEmail, count);
                finalEmail = baseEmail + count; 
            } else {
                emailCountMap.put(baseEmail, 1); 
            }
            return finalEmail + "@ptit.edu.vn";
        }
    }

    // Phương thức main để chạy chương trình
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cau1 outer = new Cau1();
        EmailGenerator emailGenerator = outer.new EmailGenerator(); // Tạo đối tượng từ lớp lồng

        // Nhập số lượng họ tên
        System.out.print("Nhập số lượng họ tên: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập họ tên thứ " + (i + 1) + ":");
            String hoTen = sc.nextLine();
            String email = emailGenerator.taoEmail(hoTen);
            System.out.println(email);
        }

        sc.close();
    }
}
