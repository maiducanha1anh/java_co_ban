package Baitap6;

public class Dia_chi {
    private String soNha;
    private String tenDuong;
    private String tenXom;
    private String tenXaPhuong;
    private String quanHuyen;
    private String thanhPho;

    public Dia_Chi(String soNha, String tenDuong, String tenXom, String tenXaPhuong, String quanHuyen, String thanhPho) {
        this.soNha = soNha;
        this.tenDuong = tenDuong;
        this.tenXom = tenXom;
        this.tenXaPhuong = tenXaPhuong;
        this.quanHuyen = quanHuyen;
        this.thanhPho = thanhPho;
    }

    @Override
    public String toString() {
        return soNha + " " + tenDuong + ", " + (tenXom != null ? tenXom + ", " : "") + tenXaPhuong + ", " + quanHuyen + ", " + thanhPho;
}
}
