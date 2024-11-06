package Baitap6;
                            
public class Sinh_vien extends Nguoi {
    private String maSinhVien;
    private String khoa;
    private String chuyenNganh;
    private String xepLoai;

    public Sinh_Vien(String soCMT, HoTen hoTen, DiaChi diaChi, String email, String soDienThoai, String maSinhVien, String khoa, String chuyenNganh, String xepLoai) {
        super(soCMT, hoTen, diaChi, email, soDienThoai);
        this.maSinhVien = maSinhVien;
        this.khoa = khoa;
        this.chuyenNganh = chuyenNganh;
        this.xepLoai = xepLoai;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    @Override
    public String toString() {
        return super.toString() + ", Mã SV: " + maSinhVien + ", Khoa: " + khoa + ", Chuyên ngành: " + chuyenNganh + ", Xếp loại: " + xepLoai;
    }
}
