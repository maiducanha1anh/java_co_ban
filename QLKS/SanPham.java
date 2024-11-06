package QLKS;

public class SanPham {
    String maSanPham;
    String tenSanPham;
    double giaBan;
    int soLuongTon;

    public SanPham(String maSanPham, String tenSanPham, double giaBan, int soLuongTon) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaBan = giaBan;
        this.soLuongTon = soLuongTon;
    }

    public double tinhGiaTriTonKho() {
        return giaBan * soLuongTon;
    }

    public void hienThiThongTin() {
        System.out.println(tenSanPham + ", gia ban: " + giaBan + " VND, ton: " + soLuongTon);
    }
}
