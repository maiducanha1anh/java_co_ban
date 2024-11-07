package EX3;

import EX1.SinhVien;
import EX2.MonHoc;

public class KQHocTap {
    private SinhVien sinhVien;
    private MonHoc monHoc;
    private double diemKT1;
    private double diemKT2;
    private double diemKT3;
    private double diemKT4;
    private double trungBinhMon;
    private String trangThai;
    
    // Constructor
    public KQHocTap(SinhVien sinhVien, MonHoc monHoc, double diemKT1, double diemKT2, double diemKT3, double diemKT4) {
        this.sinhVien = sinhVien;
        this.monHoc = monHoc;
        this.diemKT1 = diemKT1;
        this.diemKT2 = diemKT2;
        this.diemKT3 = diemKT3;
        this.diemKT4 = diemKT4;
        tinhTrungBinhMon();
        tinhTrangThai();
    }
    
    // Phương thức tính trung bình môn
    private void tinhTrungBinhMon() {
        int soBaiKiemTra = monHoc.getSoBaiKiemTra();
        if (soBaiKiemTra == 2) {
            trungBinhMon = diemKT1 * 0.3 + diemKT2 * 0.7;
        } else if (soBaiKiemTra == 3) {
            trungBinhMon = diemKT1 * 0.2 + diemKT2 * 0.3 + diemKT3 * 0.5;
        } else if (soBaiKiemTra == 4) {
            trungBinhMon = diemKT1 * 0.1 + diemKT2 * 0.2 + diemKT3 * 0.3 + diemKT4 * 0.4;
        }
    }
    
    // Phương thức tính trạng thái môn học
    private void tinhTrangThai() {
        if (trungBinhMon >= 4) {
            trangThai = "Qua môn";
        } else {
            trangThai = "Trượt môn";
        }
    }
    
    // Phương thức tính học phí
    public double tinhHocPhi() {
        return monHoc.getSoTinChi() * 560000;
    }

    // Phương thức hiển thị thông tin kết quả học tập
    public void thongTinKQHocTap() {
        System.out.println("Mã sinh viên: " + sinhVien.getMaSinhVien());
        System.out.println("Tên sinh viên: " + sinhVien.getHoDemTen());
        System.out.println("Mã môn học: " + monHoc.getMaMonHoc());
        System.out.println("Tên môn học: " + monHoc.getTenMonHoc());
        System.out.println("Điểm bài kiểm tra 1: " + diemKT1);
        System.out.println("Điểm bài kiểm tra 2: " + diemKT2);
        System.out.println("Điểm bài kiểm tra 3: " + diemKT3);
        System.out.println("Điểm bài kiểm tra 4: " + diemKT4);
        System.out.println("Trung bình môn: " + trungBinhMon);
        System.out.println("Trạng thái: " + trangThai);
        System.out.println("Học phí: " + tinhHocPhi() + " VND");
    } 
}
