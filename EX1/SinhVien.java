package EX1;

public class SinhVien {
    
        // Thuộc tính của sinh viên
        private String hoDemTen;
        private String diaChi;
        private String email;
        private String soDienThoai;
        private String maSinhVien;
        
        // Constructor không có tham số
        public SinhVien() {
            // Khởi tạo giá trị mặc định nếu cần
        }
        
        // Constructor có tham số
        public SinhVien(String hoDemTen, String diaChi, String email, String soDienThoai, String maSinhVien) {
            this.hoDemTen = hoDemTen;
            this.diaChi = diaChi;
            this.email = email;
            this.soDienThoai = soDienThoai;
            this.maSinhVien = maSinhVien;
        }
        
        // Getter và Setter
        public String getHoDemTen() {
            return hoDemTen;
        }
        
        public void setHoDemTen(String hoDemTen) {
            this.hoDemTen = hoDemTen;
        }
        
        public String getDiaChi() {
            return diaChi;
        }
        
        public void setDiaChi(String diaChi) {
            this.diaChi = diaChi;
        }
        
        public String getEmail() {
            return email;
        }
        
        public void setEmail(String email) {
            this.email = email;
        }
        
        public String getSoDienThoai() {
            return soDienThoai;
        }
        
        public void setSoDienThoai(String soDienThoai) {
            this.soDienThoai = soDienThoai;
        }
        
        public String getMaSinhVien() {
            return maSinhVien;
        }
        
        public void setMaSinhVien(String maSinhVien) {
            this.maSinhVien = maSinhVien;
        }
        
        // Các phương thức hành động
        public void diHoc() {
            System.out.println(hoDemTen + " đang đi học.");
        }
        
        public void lamBaiTap() {
            System.out.println(hoDemTen + " đang làm bài tập.");
        }
        
        public void nopHocPhi() {
            System.out.println(hoDemTen + " đã nộp học phí.");
        }
        
        public void lamBaiKiemTra() {
            System.out.println(hoDemTen + " đang làm bài kiểm tra.");
        }
        
        public void thongTin() {
            System.out.println("Thông tin sinh viên: ");
            System.out.println("Họ tên: " + hoDemTen);
            System.out.println("Địa chỉ: " + diaChi);
            System.out.println("Email: " + email);
            System.out.println("Số điện thoại: " + soDienThoai);
            System.out.println("Mã sinh viên: " + maSinhVien);
        }
    }
