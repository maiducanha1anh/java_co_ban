package Baitapthuhanh;

import java.util.Scanner;

public class NhanVien {
    private static int count = 0; // Đếm số lượng nhân viên để tạo mã tự động
    private String maNV;
    private String hoTen;
    private int luongCoBan;
    private int soNgayCong;
    private String chucVu;

    // Constructor
    public NhanVien(String hoTen, int luongCoBan, int soNgayCong, String chucVu) {
        count++;
        this.maNV = "NV" + String.format("%02d", count); // Tạo mã NV01, NV02, ...
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.soNgayCong = soNgayCong;
        this.chucVu = chucVu;
    }

    // Tính lương tháng
    public int tinhLuong() {
        return luongCoBan * soNgayCong;
    }

    // Tính thưởng dựa trên số ngày công
    public int tinhThuong() {
        int luongThang = tinhLuong();
        if (soNgayCong >= 25) {
            return (int) (0.2 * luongThang); // Thưởng 20%
        } else if (soNgayCong >= 22) {
            return (int) (0.1 * luongThang); // Thưởng 10%
        } else {
            return 0; // Không có thưởng
        }
    }

    // Tính phụ cấp dựa vào chức vụ
    public int tinhPhuCap() {
        switch (chucVu) {
            case "GD":
                return 250000;
            case "PGD":
                return 200000;
            case "TP":
                return 180000;
            default: // NV
                return 150000;
        }
    }

    // Tính tổng thu nhập
    public int tinhThuNhap() {
        return tinhLuong() + tinhThuong() + tinhPhuCap();
    }

    // Phương thức hiển thị thông tin
    public void hienThi() {
        int luongThang = tinhLuong();
        int thuong = tinhThuong();
        int phuCap = tinhPhuCap();
        int thuNhap = tinhThuNhap();
        System.out.println(maNV + " " + hoTen + " " + luongThang + " " + thuong + " " + phuCap + " " + thuNhap);
    }

    // Phương thức main để nhập và xử lý thông tin
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập thông tin nhân viên
        System.out.println("Nhập họ tên:");
        String hoTen = sc.nextLine();
        
        System.out.println("Nhập lương cơ bản:");
        int luongCoBan = Integer.parseInt(sc.nextLine());
        
        System.out.println("Nhập số ngày công:");
        int soNgayCong = Integer.parseInt(sc.nextLine());
        
        System.out.println("Nhập chức vụ (GD/PGD/TP/NV):");
        String chucVu = sc.nextLine();

        // Tạo đối tượng nhân viên
        NhanVien nv = new NhanVien(hoTen, luongCoBan, soNgayCong, chucVu);

        // Hiển thị thông tin nhân viên
        nv.hienThi();

        sc.close();
    }
}
