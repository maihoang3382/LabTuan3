package labtuan3;
import java.util.ArrayList;
import java.util.Scanner;
public class DanhSachNhanVien {
    private ArrayList<NhanVien> danhSach = new ArrayList<>();
    public void nhapDS() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng nhân viên: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập nhân viên " + (i+1));
            NhanVien nv = new NhanVien();
            nv.nhap();
            danhSach.add(nv);
        }
    }
    public void xuatDS() {
        System.out.println("Danh sách nhân viên:");
        for (NhanVien nv : danhSach) {
            nv.xuat();
        }
    }
    public void inSoLuongNhanVien() {
        System.out.println("Tổng số nhân viên: " + NhanVien.getSoLuongNhanVien());
    }
}
