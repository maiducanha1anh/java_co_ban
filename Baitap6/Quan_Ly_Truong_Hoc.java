import java.util.ArrayList;
import java.util.List;

public class Quan_Ly_Truong_Hoc {
    private List<Sinh_Vien> danh_Sach_Sinh_Vien;
    private List<Giang_Vien> danh_Sach_Giang_Vien;
    private List<Mon_Hoc> danh_Sach_Mon_Hoc;
    private List<Tai_Lieu> danh_Sach_Tai_Lieu;

    public Quan_Ly_Truong_Hoc() {
        this.danh_Sach_Sinh_Vien = new ArrayList<>();
        this.danh_Sach_Giang_Vien = new ArrayList<>();
        this.danh_Sach_Mon_Hoc = new ArrayList<>();
        this.danh_Sach_Tai_Lieu = new ArrayList<>();
    }

    // Thêm sinh viên
    public void them_Sinh_Vien(Sinh_Vien sv) {
        danh_Sach_Sinh_Vien.add(sv);
        System.out.println("Thêm sinh viên thành công: " + sv);
    }

    // Thêm giảng viên
    public void them_Giang_Vien(Giang_Vien gv) {
        danh_Sach_Giang_Vien.add(gv);
        System.out.println("Thêm giảng viên thành công: " + gv);
    }

    // Thêm môn học
    public void them_Mon_Hoc(Mon_Hoc mh) {
        danh_Sach_Mon_Hoc.add(mh);
        System.out.println("Thêm môn học thành công: " + mh);
    }

    // Thêm tài liệu
    public void them_Tai_Lieu(Tai_Lieu tl) {
        danh_Sach_Tai_Lieu.add(tl);
        System.out.println("Thêm tài liệu thành công: " + tl);
    }

    // Hiển thị danh sách sinh viên
    public void hien_Thi_Sinh_Vien() {
        System.out.println("Danh sách sinh viên:");
        for (Sinh_Vien sv : danh_Sach_Sinh_Vien) {
            System.out.println(sv);
        }
    }

    // Hiển thị danh sách giảng viên
    public void hien_Thi_Giang_Vien() {
        System.out.println("Danh sách giảng viên:");
        for (Giang_Vien gv : danh_Sach_Giang_Vien) {
            System.out.println(gv);
        }
    }

    // Hiển thị danh sách môn học
    public void hien_Thi_Mon_Hoc() {
        System.out.println("Danh sách môn học:");
        for (Mon_Hoc mh : danh_Sach_Mon_Hoc) {
            System.out.println(mh);
        }
    }

    // Hiển thị danh sách tài liệu
    public void hien_Thi_Tai_Lieu() {
        System.out.println("Danh sách tài liệu:");
        for (Tai_Lieu tl : danh_Sach_Tai_Lieu) {
            System.out.println(tl);
        }
    }

    public static void main(String[] args) {
        // Tạo đối tượng quản lý
        Quan_Ly_Truong_Hoc qlth = new Quan_Ly_Truong_Hoc();

        // Tạo sinh viên
        Ho_Ten hoTenSv = new Ho_Ten("Nguyen", "Van", "A");
        Dia_Chi diaChiSv = new Dia_Chi("123", "Le Loi", "Xom 1", "Xa A", "Quan 1", "HCM");
        Sinh_Vien sv = new Sinh_Vien("SV001", hoTenSv, diaChiSv, "sinhvien@gmail.com", "0123456789", "CNTT", "Khoa hoc may tinh", "Gioi");

        // Tạo giảng viên
        Ho_Ten hoTenGv = new Ho_Ten("Tran", "Thi", "B");
        Dia_Chi diaChiGv = new Dia_Chi("456", "Nguyen Hue", "Xom 2", "Xa B", "Quan 2", "HCM");
        Giang_Vien gv = new Giang_Vien("GV001", hoTenGv, diaChiGv, "giangvien@gmail.com", "0987654321", "Lap trinh", 10, 15000000, "Giang vien");

        // Tạo môn học
        Mon_Hoc mh = new Mon_Hoc("MH001", "Lap trinh Java", "Nguyen Van A", 2020, 50000, 30, 20, 4, "Lap trinh Co ban", "Giao trinh Java");

        // Tạo tài liệu
        Tai_Lieu tl = new Tai_Lieu("Giao trinh Java", "Nguyen Van A", 2020, 50000);

        // Thêm dữ liệu vào hệ thống
        qlth.them_Sinh_Vien(sv);
        qlth.them_Giang_Vien(gv);
        qlth.them_Mon_Hoc(mh);
        qlth.them_Tai_Lieu(tl);

        // Hiển thị dữ liệu
        qlth.hien_Thi_Sinh_Vien();
        qlth.hien_Thi_Giang_Vien();
        qlth.hien_Thi_Mon_Hoc();
        qlth.hien_Thi_Tai_Lieu();
    }
}
