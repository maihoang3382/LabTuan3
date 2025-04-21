package labtuan3;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import labtuan3.HocSinh;
public class DSHocSinh {
    private HocSinh[] ds;
    private int soluong;
    public void nhapDS() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong hoc sinh: ");
        soluong = sc.nextInt();
        ds = new HocSinh[soluong];
        for (int i = 0; i < soluong; i++) {
            System.out.println("Nhap thong tin hoc sinh thu " + (i + 1) + ":");
            ds[i] = new HocSinh();
            ds[i].input();
        }
    }
    public void xuatDS() {
        System.out.println("\nDanh sach hoc sinh:");
        for (HocSinh hs : ds) {
            hs.output();
        }
    }
    public void sapXep() {
        Arrays.sort(ds, new Comparator<HocSinh>() {
            public int compare(HocSinh a, HocSinh b) {
                return Float.compare(b.getDtb(), a.getDtb());
            }
        });
    }
}
