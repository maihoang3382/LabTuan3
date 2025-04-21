package labtuan3;
import labtuan3.HocSinh;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        HocSinh hs1 = new HocSinh();
        hs1.input();
        hs1.output();
        HocSinh hs2 = new HocSinh(111, "Mai Viet Hoang", 10f);
        hs2.output();
        HocSinh hs3 = new HocSinh(222, "Hoang Viet Mai", 10f);
        hs3.output();
        hs3.setHoten("Viet Hoang Mai");
        hs3.output();
        float max = hs1.getDtb();
        String ht = hs1.getHoten();
        if (hs2.getDtb() > max) {
            max = hs2.getDtb();
            ht = hs2.getHoten();
        }
        if (hs3.getDtb() > max) {
            max = hs3.getDtb();
            ht = hs3.getHoten();
        }
        System.out.println("Hoc sinh co DTB cao nhat: " + ht + " voi DTB: " + max);
    }
}

