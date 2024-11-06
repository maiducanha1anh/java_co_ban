package Baitap6;

public class Tai_lieu {
    private String tenTaiLieu;
    private String tacGia;
    private int namXuatBan;
    private double giaBia;

    // Constructor
    public TaiLieu(String tenTaiLieu, String tacGia, int namXuatBan, double giaBia) {
        this.tenTaiLieu = tenTaiLieu;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.giaBia = giaBia;
    }

    // Getters
    public String getTenTaiLieu() {
        return tenTaiLieu;
    }

    public String getTacGia() {
        return tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public double getGiaBia() {
        return giaBia;
    }

    // Setters
    public void setTenTaiLieu(String tenTaiLieu) {
        this.tenTaiLieu = tenTaiLieu;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public void setGiaBia(double giaBia) {
        this.giaBia = giaBia;
    }

    // toString method
    @Override
    public String toString() {
        return "Tài liệu: " + tenTaiLieu + ", Tác giả: " + tacGia + ", Năm xuất bản: " + namXuatBan + ", Giá bìa: " + giaBia;
    }
}
