package Labtuan3;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        PhanSo p1 = new PhanSo();
        System.out.print("Phan so p1 ban dau: ");
        p1.xuatPhanSo();
        System.out.println("Nhap phan so p1:");
        p1.nhapPhanSo();
        System.out.print("Phan so p1 sau khi nhap: ");
        p1.xuatPhanSo();
        PhanSo p2 = new PhanSo(4, 16);
        System.out.print("Phan so p2: ");
        p2.xuatPhanSo();
        System.out.println("Nhap phan so p3:");
        Scanner scanner = new Scanner(System.in);
        int tu, mau;
        System.out.print("Nhap tu so p3: ");
        tu = scanner.nextInt();
        do {
            System.out.print("Nhap mau so p3: ");
            mau = scanner.nextInt();
        } while (mau == 0);
        PhanSo p3 = new PhanSo(tu, mau);
        System.out.print("Phan so p3: ");
        p3.xuatPhanSo();
        PhanSo tong = p1.cong(p3);
        System.out.print("Tong p1 + p3: ");
        tong.xuatPhanSo();
        PhanSo p4 = new PhanSo(tong);
        System.out.print("Phan so p4 sao chep tu tong: ");
        p4.xuatPhanSo();
        PhanSo tich = p4.nhan(p2);
        System.out.print("Tich p4 * p2: ");
        tich.xuatPhanSo();
    }
}
