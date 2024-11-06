package Baitap6;

import java.util.List;

public class Mon_hoc extends Tai_Lieu {
     private String maMonHoc;
    private int soTietLyThuyet;
    private int soTietThucHanh;
    private int soTinChi;
    private String monTienQuyet;
    private List<TaiLieu> taiLieuThamKhao;

    public Mon_Hoc(String tenTaiLieu, String tacGia, int namXuatBan, double giaBia, String maMonHoc, int soTietLyThuyet, int soTietThucHanh, int soTinChi, String monTienQuyet, List<TaiLieu> taiLieuThamKhao) {
        super(tenTaiLieu, tacGia, namXuatBan, giaBia);
        this.maMonHoc = maMonHoc;
        this.soTietLyThuyet = soTietLyThuyet;
        this.soTietThucHanh = soTietThucHanh;
        this.soTinChi = soTinChi;
        this.monTienQuyet = monTienQuyet;
        this.taiLieuThamKhao = taiLieuThamKhao;
    }

    @Override
    public String toString() {
        return super.toString() + ", Mã môn học: " + maMonHoc + ", Số tiết lý thuyết: " + soTietLyThuyet + ", Số tiết thực hành: " + soTietThucHanh + ", Số tín chỉ: " + soTinChi + ", Môn tiên quyết: " + monTienQuyet;
    }
}
