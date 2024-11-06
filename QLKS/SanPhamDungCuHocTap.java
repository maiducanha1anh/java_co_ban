package QLKS;

public class SanPhamDungCuHocTap extends SanPham {
    String thuongHieu;

    public SanPhamDungCuHocTap(String maSanPham, String tenSanPham, double giaBan, int soLuongTon, String thuongHieu) {
        super(maSanPham, tenSanPham, giaBan, soLuongTon);
        this.thuongHieu = thuongHieu;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println(tenSanPham + " (thuong hieu: " + thuongHieu + "), gia ban: " + giaBan + " VND, ton: " + soLuongTon);
    }
}
