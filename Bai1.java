import java.util.Scanner;

public class Main40_1 {
    public static void main(String[] args) {
        P40_MangObject[] nhanVien = new P40_MangObject[3];
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap thong tin nhan vien: ");
        for (int i = 0; i < nhanVien.length; i++) {
            String ten = scan.nextLine();
            String diaChi = scan.nextLine();
            // Dung while de kiem tra tuoi nhap vao co phai la so nguyen hay khong
            if (scan.hasNextInt()) {
                int age = scan.nextInt(); // Đọc tuổi nếu là số nguyên
                System.out.println("Ten: " + ten + ", Thanh pho: " + diaChi + ", Tuoi: " + age);
            } else {
                System.out.println("Loi: Tuoi phai la so nguyen!");
                scan.next(); // Bỏ qua giá trị không hợp lệ
                // Xoá bộ nhớ đệm
                scan.nextLine();
                scan.close();
            }
        }
        for (P40_MangObject nv : nhanVien) {
            System.out.println("Ten: " + nv.getTen());
            System.out.println("Dia chi: " + nv.getDiaChi());
            System.out.println("Tuoi: " + nv.getTuoi());
        }

    }
}
