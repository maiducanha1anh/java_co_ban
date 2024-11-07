package EX3;
import java.util.Scanner;

import EX1.SinhVien;
import EX2.MonHoc;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Nhập thông tin sinh viên
        System.out.println("Nhập thông tin sinh viên:");
        System.out.print("Mã sinh viên: ");
        String maSinhVien = sc.nextLine();
        System.out.print("Tên sinh viên: ");
        String hoDemTen = sc.nextLine();
        SinhVien sinhVien = new SinhVien(maSinhVien, hoDemTen);

        // Nhập thông tin môn học
        System.out.println("Nhập thông tin môn học:");
        System.out.print("Mã môn học: ");
        String maMonHoc = sc.nextLine();
        System.out.print("Tên môn học: ");
        String tenMonHoc = sc.nextLine();
        System.out.print("Số tín chỉ (1-4): ");
        int soTinChi = sc.nextInt();
        System.out.print("Số bài kiểm tra (2-4): ");
        int soBaiKiemTra = sc.nextInt();
        sc.nextLine(); // Đọc dòng còn lại
        System.out.print("Giảng viên: ");
        String nguoiDay = sc.nextLine();
        MonHoc monHoc = new MonHoc(maMonHoc, tenMonHoc, soTinChi, soBaiKiemTra, nguoiDay);

        // Nhập điểm bài kiểm tra
        System.out.println("Nhập điểm các bài kiểm tra:");
        System.out.print("Điểm bài kiểm tra 1: ");
        double diemKT1 = sc.nextDouble();
        System.out.print("Điểm bài kiểm tra 2: ");
        double diemKT2 = sc.nextDouble();
        double diemKT3 = 0;
        double diemKT4 = 0;
        if (soBaiKiemTra >= 3) {
            System.out.print("Điểm bài kiểm tra 3: ");
            diemKT3 = sc.nextDouble();
        }
        if (soBaiKiemTra == 4) {
            System.out.print("Điểm bài kiểm tra 4: ");
            diemKT4 = sc.nextDouble();
        }

        // Tạo đối tượng kết quả học tập
        KQHocTap kqHocTap = new KQHocTap(sinhVien, monHoc, diemKT1, diemKT2, diemKT3, diemKT4);
        
        // Hiển thị thông tin kết quả học tập
        kqHocTap.thongTinKQHocTap();
        
        sc.close();
    }
}

