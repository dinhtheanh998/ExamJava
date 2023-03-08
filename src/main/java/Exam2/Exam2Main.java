package Exam2;

import java.util.Scanner;

public class Exam2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien nv1 = new KyThuat("NV01", "Nguyễn Văn A", "1990", "Hà Nội", "Công nghệ thông tin");
        System.out.println("Nhap thong tin nhan vien: ");
        System.out.println("Ma nhan vien: ");
        String maNV = sc.nextLine();
        System.out.println("Ho ten: ");
        String hoTen = sc.nextLine();
        System.out.println("Nam sinh: ");
        String namSinh = sc.nextLine();
        System.out.println("Dia chi: ");
        String diaChi = sc.nextLine();
        System.out.println("Chuyen nganh: ");
        String chuyenNganh = sc.nextLine();
        NhanVien nv2 = new KyThuat(maNV, hoTen, namSinh, diaChi, chuyenNganh);
        System.out.println(nv1);
        System.out.println(nv2);
    }
}
