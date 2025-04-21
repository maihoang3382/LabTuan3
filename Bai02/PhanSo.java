package Labtuan3;
import java.util.Scanner;
public class PhanSo {
    private int tuSo;
    private int mauSo;
    public PhanSo() {
        this.tuSo = 0;
        this.mauSo = 1;
    }
    public PhanSo(int tuSo, int mauSo) {
        if (mauSo == 0) {
            System.out.println("mau so phai khac 0 gan mac dinh bang 1.");
            mauSo = 1;
        }
        this.tuSo = tuSo;
        this.mauSo = mauSo;
        rutGon();
    }
    public PhanSo(PhanSo ps) {
        this.tuSo = ps.tuSo;
        this.mauSo = ps.mauSo;
    }
    public void nhapPhanSo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        tuSo = scanner.nextInt();
        do {
            System.out.print("Nhap mau so khac 0: ");
            mauSo = scanner.nextInt();
        } while (mauSo == 0);
        rutGon();
    }
    public void xuatPhanSo() {
        System.out.println(tuSo + "/" + mauSo);
    }
    private void rutGon() {
        int ucln = gcd(Math.abs(tuSo), Math.abs(mauSo));
        tuSo /= ucln;
        mauSo /= ucln;
        if (mauSo < 0) {
            tuSo *= -1;
            mauSo *= -1;
        }
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public PhanSo cong(PhanSo ps) {
        int tu = this.tuSo * ps.mauSo + ps.tuSo * this.mauSo;
        int mau = this.mauSo * ps.mauSo;
        return new PhanSo(tu, mau);
    }
    public PhanSo nhan(PhanSo ps) {
        int tu = this.tuSo * ps.tuSo;
        int mau = this.mauSo * ps.mauSo;
        return new PhanSo(tu, mau);
    }
}
