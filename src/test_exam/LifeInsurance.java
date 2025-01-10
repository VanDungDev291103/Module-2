package test_exam;

import java.time.LocalDate;
import java.util.Scanner;

public class LifeInsurance extends InsurancePackage {
    // bảo hiểm sinh kỳ
    private String thoiGianKetThuc;
    private String thoiGianTroCap;

    public LifeInsurance() {

    }

    public LifeInsurance(String tenGoiBaoHiem, String thoiHanDong, double mucPhiDong, String mucDich, String cachThucDong, String thoiGianBatDau, String thoiGianKetThuc, String thoiGianTroCap) {
        super(tenGoiBaoHiem, thoiHanDong, mucPhiDong, mucDich, cachThucDong, thoiGianBatDau);
        this.thoiGianKetThuc = thoiGianKetThuc;
        this.thoiGianTroCap = thoiGianTroCap;
    }

    @Override
    public void inputGoiBaoHiem() {
        Scanner sc = new Scanner(System.in);
        super.inputGoiBaoHiem();

        System.out.print("Vui lòng nhập Thời Gian Kết Thúc: ");
        this.thoiGianKetThuc = sc.nextLine();

        System.out.print("Vui lòng nhập Thời Gian Trợ Cấp: ");
        this.thoiGianTroCap = sc.nextLine();
    }

    @Override
    public void outputBaoHiem() {
        super.outputBaoHiem();
        System.out.println("Thời gian kết thúc: " + thoiGianKetThuc);
        System.out.println("Thời gian trợ cấp: " + thoiGianTroCap);
    }

    public String getThoiGianKetThuc() {
        return thoiGianKetThuc;
    }

    public void setThoiGianKetThuc(String thoiGianKetThuc) {
        this.thoiGianKetThuc = thoiGianKetThuc;
    }

    public String getThoiGianTroCap() {
        return thoiGianTroCap;
    }

    public void setThoiGianTroCap(String thoiGianTroCap) {
        this.thoiGianTroCap = thoiGianTroCap;
    }
}
