package Baitap6;

public class Giang_vien extends Nguoi{
    private String maGiangVien;
    private String chuyenMon;
    private int soNamKinhNghiem;
    private double mucLuong;
    private String viTriCongTac;

    public Giang_Vien(String soCMT, HoTen hoTen, DiaChi diaChi, String email, String soDienThoai, String maGiangVien, String chuyenMon, int soNamKinhNghiem, double mucLuong, String viTriCongTac) {
        super(soCMT, hoTen, diaChi, email, soDienThoai);
        this.maGiangVien = maGiangVien;
        this.chuyenMon = chuyenMon;
        this.soNamKinhNghiem = soNamKinhNghiem;
        this.mucLuong = mucLuong;
        this.viTriCongTac = viTriCongTac;
    }

    public String getMaGiangVien() {
        return maGiangVien;
    }

    @Override
    public String toString() {
        return super.toString() + ", Mã GV: " + maGiangVien + ", Chuyên môn: " + chuyenMon + ", Số năm kinh nghiệm: " + soNamKinhNghiem + ", Mức lương: " + mucLuong + ", Vị trí công tác: " + viTriCongTac;
    }
}
