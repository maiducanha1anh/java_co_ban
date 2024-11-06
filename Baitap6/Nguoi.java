package Baitap6;

public class Nguoi {
    private String soCMT;
    private HoTen hoTen;
    private DiaChi diaChi;
    private String email;
    private String soDienThoai;

    public Nguoi(String soCMT, HoTen hoTen, DiaChi diaChi, String email, String soDienThoai) {
        this.soCMT = soCMT;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.email = email;
        this.soDienThoai = soDienThoai;
    }

    public String getSoCMT() {
        return soCMT;
    }

    public HoTen getHoTen() {
        return hoTen;
    }

    public DiaChi getDiaChi() {
        return diaChi;
    }

    @Override
    public String toString() {
        return "CMT: " + soCMT + ", Họ tên: " + hoTen + ", Địa chỉ: " + diaChi + ", Email: " + email + ", SĐT: " + soDienThoai;
    }
}
