package labtuan3;
import java.util.Scanner;
public class NhanVien {
    private String maSo;
    private String hoTen;
    private double luongCoBan;
    private double heSoLuong;
    private static int soLuongNhanVien = 0;
    public NhanVien() {
        soLuongNhanVien++;
    }
    public NhanVien(String maSo, String hoTen, double luongCoBan, double heSoLuong) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        soLuongNhanVien++;
    }
    public NhanVien(NhanVien nv) {
        this(nv.maSo, nv.hoTen, nv.luongCoBan, nv.heSoLuong);
    }
    public String getMaSo() { return maSo; }
    public void setMaSo(String maSo) { this.maSo = maSo; }
    public String getHoTen() { return hoTen; }
    public void setHoTen(String hoTen) { this.hoTen = hoTen; }
    public double getHeSoLuong() { return heSoLuong; }
    public void setHeSoLuong(double heSoLuong) { this.heSoLuong = heSoLuong; }
    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã số: ");
        maSo = sc.nextLine();
        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập lương cơ bản: ");
        luongCoBan = sc.nextDouble();
        System.out.print("Nhập hệ số lương: ");
        heSoLuong = sc.nextDouble();
    }
    public void xuat() {
        System.out.printf("Mã: %s | Họ tên: %s | Lương: %.2f\n", maSo, hoTen, tinhLuong());
    }
    public static int getSoLuongNhanVien() {
        return soLuongNhanVien;
    }
}
