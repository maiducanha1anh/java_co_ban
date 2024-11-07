package EX1;
import java.util.Scanner;
public class Main {
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập thông tin sinh viên
        System.out.println("Nhập thông tin sinh viên:");
        System.out.print("Họ tên: ");
        String hoDemTen = sc.nextLine();
        System.out.print("Địa chỉ: ");
        String diaChi = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Số điện thoại: ");
        String soDienThoai = sc.nextLine();
        System.out.print("Mã sinh viên: ");
        String maSinhVien = sc.nextLine();

        // Tạo đối tượng sinh viên
        SinhVien sv = new SinhVien(hoDemTen, diaChi, email, soDienThoai, maSinhVien);

        // Thực hiện các hành động
        sv.diHoc();
        sv.lamBaiTap();
        sv.nopHocPhi();
        sv.lamBaiKiemTra();
        sv.thongTin();
        
        sc.close();
    }
}

