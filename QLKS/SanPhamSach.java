package QLKS;

public class SanPhamSach extends SanPham {
    String tacGia;

    public SanPhamSach(String maSanPham, String tenSanPham, double giaBan, int soLuongTon, String tacGia) {
        super(maSanPham, tenSanPham, giaBan, soLuongTon);
        this.tacGia = tacGia;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println(tenSanPham + " (tac gia: " + tacGia + "), gia ban: " + giaBan + " VND, ton: " + soLuongTon);
    }
}
