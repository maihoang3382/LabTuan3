package labtuan3;
public class DemoNhanVien {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien();
        NhanVien nv2 = new NhanVien("NV002", "Mai Hồng", 4000, 2.5);
        NhanVien nv3 = new NhanVien(nv2);
        System.out.println("Nhập nhân viên 1:");
        nv1.nhap();
        System.out.println("Nhập lại tên cho nhân viên 2:");
        nv2.setHoTen("Hoàng Mai");
        nv1.xuat();
        nv2.xuat();
        nv3.xuat();
        NhanVien max = nv1;
        if (nv2.getHeSoLuong() > max.getHeSoLuong()) max = nv2;
        if (nv3.getHeSoLuong() > max.getHeSoLuong()) max = nv3;
        System.out.println("Nhân viên có hệ số lương cao nhất:");
        max.xuat();
        DanhSachNhanVien dsnv = new DanhSachNhanVien();
        dsnv.nhapDS();
        dsnv.xuatDS();
        dsnv.inSoLuongNhanVien();
    }
}
