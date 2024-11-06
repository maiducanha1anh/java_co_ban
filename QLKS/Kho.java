package QLKS;

import java.util.ArrayList;
import java.util.List;

public class Kho {
    List<SanPham> danhSachSanPham;

    public Kho() {
        danhSachSanPham = new ArrayList<>();
    }

    public void themSanPham(SanPham sanPham) {
        danhSachSanPham.add(sanPham);
    }

    public double tinhTongGiaTriTonKho() {
        double tongGiaTri = 0;
        for (SanPham sp : danhSachSanPham) {
            tongGiaTri += sp.tinhGiaTriTonKho();
        }
        return tongGiaTri;
    }

    public void hienThiDanhSachSanPham() {
        for (SanPham sp : danhSachSanPham) {
            sp.hienThiThongTin();
        }
    }

    public void sanPhamCoGiaTriTonKhoCaoNhat() {
        SanPham sanPhamCaoNhat = null;
        SanPham sanPhamThapNhat = null;

        for (SanPham sp : danhSachSanPham) {
            if (sanPhamCaoNhat == null || sp.tinhGiaTriTonKho() > sanPhamCaoNhat.tinhGiaTriTonKho()) {
                sanPhamCaoNhat = sp;
            }
            if (sanPhamThapNhat == null || sp.tinhGiaTriTonKho() < sanPhamThapNhat.tinhGiaTriTonKho()) {
                sanPhamThapNhat = sp;
            }
        }

        System.out.println("San pham co gia tri ton kho cao nhat: " + sanPhamCaoNhat.tenSanPham);
        System.out.println("San pham co gia tri ton kho thap nhat: " + sanPhamThapNhat.tenSanPham);
    }
}
