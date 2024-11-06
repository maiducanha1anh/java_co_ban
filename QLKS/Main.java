package QLKS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kho kho = new Kho();

        System.out.print("Nhap so luong san pham: ");
        int soLuongSanPham = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < soLuongSanPham; i++) {
            System.out.println("\nNhap thong tin cho san pham thu " + (i + 1) + ":");
            System.out.print("Nhap ma san pham: ");
            String maSanPham = scanner.nextLine();
            System.out.print("Nhap ten san pham: ");
            String tenSanPham = scanner.nextLine();

            System.out.print("Nhap loai san pham (sach/dung cu hoc tap): ");
            String loaiSanPham = scanner.nextLine();

            SanPham sanPham = null;
            if (loaiSanPham.equalsIgnoreCase("sach")) {
                System.out.print("Nhap tac gia: ");
                String tacGia = scanner.nextLine();
                System.out.print("Nhap gia ban: ");
                double giaBan = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhap so luong ton kho: ");
                int soLuongTon = Integer.parseInt(scanner.nextLine());

                sanPham = new SanPhamSach(maSanPham, tenSanPham, giaBan, soLuongTon, tacGia);
            } else if (loaiSanPham.equalsIgnoreCase("dung cu hoc tap")) {
                System.out.print("Nhap thuong hieu: ");
                String thuongHieu = scanner.nextLine();
                System.out.print("Nhap gia ban: ");
                double giaBan = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhap so luong ton kho: ");
                int soLuongTon = Integer.parseInt(scanner.nextLine());

                sanPham = new SanPhamDungCuHocTap(maSanPham, tenSanPham, giaBan, soLuongTon, thuongHieu);
            } else {
                System.out.println("Loai san pham khong hop le. Vui long nhap lai.");
                i--; 
                continue;
            }

            kho.themSanPham(sanPham);
        }

        System.out.println("\nTong gia tri ton kho: " + kho.tinhTongGiaTriTonKho() + " VND");

        System.out.println("\nDanh sach san pham trong kho:");
        kho.hienThiDanhSachSanPham();

        kho.sanPhamCoGiaTriTonKhoCaoNhat();
        scanner.close();
    }
}
