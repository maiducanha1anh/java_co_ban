package EX2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Nhập thông tin môn học
        System.out.println("Nhập thông tin môn học:");
        
        System.out.print("Mã môn học: ");
        String maMonHoc = sc.nextLine();
        
        System.out.print("Tên môn học: ");
        String tenMonHoc = sc.nextLine();
        
        System.out.print("Số tiết: ");
        int soTiet = sc.nextInt();
        
        System.out.print("Số tín chỉ (1-4): ");
        int soTinChi = sc.nextInt();
        
        System.out.print("Số bài kiểm tra (2-4): ");
        int soBaiKiemTra = sc.nextInt();
        sc.nextLine();  // Đọc dòng còn lại
        
        System.out.print("Giảng viên: ");
        String nguoiDay = sc.nextLine();
        
        // Tạo đối tượng môn học
        MonHoc monHoc = new MonHoc(maMonHoc, tenMonHoc, soTiet, soTinChi, soBaiKiemTra, nguoiDay);
        
        // Hiển thị thông tin môn học
        monHoc.thongTinMonHoc();
        
        sc.close();
    }
}
