package test_exam;

import java.time.LocalDate;
import java.util.Scanner;

public abstract class InsurancePackage {
    private String tenGoiBaoHiem;
    private String thoiHanDong;
    private double mucPhiDong;
    private String mucDich;
    private String cachThucDong;
    private String thoiGianBatDau;

    public InsurancePackage() {

    }

    public InsurancePackage(String tenGoiBaoHiem, String thoiHanDong, double mucPhiDong, String mucDich, String cachThucDong, String thoiGianBatDau) {
        this.tenGoiBaoHiem = tenGoiBaoHiem;
        this.thoiHanDong = thoiHanDong;
        this.mucPhiDong = mucPhiDong;
        this.mucDich = mucDich;
        this.cachThucDong = cachThucDong;
        this.thoiGianBatDau = thoiGianBatDau;
    }

    public void inputGoiBaoHiem(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Vui lòng nhập Tên Gói Bảo Hiểm: ");
        this.tenGoiBaoHiem = sc.nextLine();

        System.out.print("Vui lòng nhập Thời Hạn Đóng: ");
        this.thoiHanDong = sc.nextLine();

        System.out.print("Vui lòng nhập Mức Phí Đóng: ");
        this.mucPhiDong = Double.parseDouble(sc.nextLine());

        System.out.print("Vui lòng nhập Mục đích: ");
        this.mucDich = sc.nextLine();

        System.out.print("Vui lòng nhập Cách Thức Đóng (đóng một lần hoặc đóng theo tháng): ");
        this.cachThucDong = sc.nextLine();

        System.out.print("Vui lòng nhập Thời Gian Bắt Đầu: ");
        this.thoiGianBatDau = sc.nextLine();
    }

    public void outputBaoHiem(){
        System.out.println("Tên gói bảo hiểm: " + this.tenGoiBaoHiem);
        System.out.println("Thời hạn đóng: " + this.thoiHanDong);
        System.out.println("Mức phí đóng: " + this.mucPhiDong);
        System.out.println("Mục đích: " + this.mucDich);
        System.out.println("Cách thức đóng: " + this.cachThucDong);
        System.out.println("Thời gian bắt đầu: " + this.thoiGianBatDau);
    }

    public String getTenGoiBaoHiem() {
        return tenGoiBaoHiem;
    }

    public void setTenGoiBaoHiem(String tenGoiBaoHiem) {
        this.tenGoiBaoHiem = tenGoiBaoHiem;
    }

    public String getThoiHanDong() {
        return thoiHanDong;
    }

    public void setThoiHanDong(String thoiHanDong) {
        this.thoiHanDong = thoiHanDong;
    }

    public double getMucPhiDong() {
        return mucPhiDong;
    }

    public void setMucPhiDong(double mucPhiDong) {
        this.mucPhiDong = mucPhiDong;
    }

    public String getMucDich() {
        return mucDich;
    }

    public void setMucDich(String mucDich) {
        this.mucDich = mucDich;
    }

    public String getCachThucDong() {
        return cachThucDong;
    }

    public void setCachThucDong(String cachThucDong) {
        this.cachThucDong = cachThucDong;
    }

    public String getThoiGianBatDau() {
        return thoiGianBatDau;
    }

    public void setThoiGianBatDau(String thoiGianBatDau) {
        this.thoiGianBatDau = thoiGianBatDau;
    }
}
