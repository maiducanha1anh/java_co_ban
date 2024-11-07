package EX2;

public class MonHoc {
    // Thuộc tính của môn học
    private String maMonHoc;
    private String tenMonHoc;
    private int soTiet;
    private int soTinChi;
    private int soBaiKiemTra;
    private String nguoiDay;
    
    // Constructor không có tham số
    public MonHoc() {
        // Khởi tạo giá trị mặc định nếu cần
    }
    
    // Constructor có tham số
    public MonHoc(String maMonHoc, String tenMonHoc, int soTiet, int soTinChi, int soBaiKiemTra, String nguoiDay) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.soTiet = soTiet;
        this.soTinChi = soTinChi;
        this.soBaiKiemTra = soBaiKiemTra;
        this.nguoiDay = nguoiDay;
    }
    
    // Getter và Setter
    public String getMaMonHoc() {
        return maMonHoc;
    }
    
    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }
    
    public String getTenMonHoc() {
        return tenMonHoc;
    }
    
    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }
    
    public int getSoTiet() {
        return soTiet;
    }
    
    public void setSoTiet(int soTiet) {
        this.soTiet = soTiet;
    }
    
    public int getSoTinChi() {
        return soTinChi;
    }
    
    public void setSoTinChi(int soTinChi) {
        if (soTinChi >= 1 && soTinChi <= 4) {
            this.soTinChi = soTinChi;
        } else {
            System.out.println("Số tín chỉ phải từ 1 đến 4.");
        }
    }
    
    public int getSoBaiKiemTra() {
        return soBaiKiemTra;
    }
    
    public void setSoBaiKiemTra(int soBaiKiemTra) {
        if (soBaiKiemTra > 1 && soBaiKiemTra < 5) {
            this.soBaiKiemTra = soBaiKiemTra;
        } else {
            System.out.println("Số bài kiểm tra phải lớn hơn 1 và nhỏ hơn 5.");
        }
    }
    
    public String getNguoiDay() {
        return nguoiDay;
    }
    
    public void setNguoiDay(String nguoiDay) {
        this.nguoiDay = nguoiDay;
    }
    
    // Phương thức cung cấp thông tin môn học
    public void thongTinMonHoc() {
        System.out.println("Thông tin môn học:");
        System.out.println("Mã môn học: " + maMonHoc);
        System.out.println("Tên môn học: " + tenMonHoc);
        System.out.println("Số tiết: " + soTiet);
        System.out.println("Số tín chỉ: " + soTinChi);
        System.out.println("Số bài kiểm tra: " + soBaiKiemTra);
        System.out.println("Giảng viên: " + nguoiDay);
    }
}
