package test_exam;

import java.time.LocalDate;
import java.util.Scanner;

public class InsuranceInCaseOfDeath extends InsurancePackage {
    // bảo hiểm trường hợp tử vong
    private String truongHopBaoHiem;
    private String thoiGianToiThieuThamGia;

    public InsuranceInCaseOfDeath() {

    }

    public InsuranceInCaseOfDeath(String tenGoiBaoHiem, String thoiHanDong, double mucPhiDong, String mucDich, String cachThucDong, String thoiGianBatDau, String truongHopBaoHiem, String thoiGianToiThieuThamGia) {
        super(tenGoiBaoHiem, thoiHanDong, mucPhiDong, mucDich, cachThucDong, thoiGianBatDau);
        this.truongHopBaoHiem = truongHopBaoHiem;
        this.thoiGianToiThieuThamGia = thoiGianToiThieuThamGia;
    }

    @Override
    public void inputGoiBaoHiem() {
        Scanner sc = new Scanner(System.in);
        super.inputGoiBaoHiem();

        System.out.print("Vui lòng nhập Trường Hợp Bảo Hiểm: ");
        truongHopBaoHiem = sc.nextLine();

        System.out.print("Vui lòng nhập Thời Gian Tối Thiểu Tham Gia: ");
        thoiGianToiThieuThamGia = sc.nextLine();
    }

    @Override
    public void outputBaoHiem() {
        super.outputBaoHiem();
        System.out.println("Trường hợp bảo hiểm: " + truongHopBaoHiem);
        System.out.println("Thời gian tối thiểu tham gia: " + thoiGianToiThieuThamGia);
    }

    public String getTruongHopBaoHiem() {
        return truongHopBaoHiem;
    }

    public void setTruongHopBaoHiem(String truongHopBaoHiem) {
        this.truongHopBaoHiem = truongHopBaoHiem;
    }

    public String getThoiGianToiThieuThamGia() {
        return thoiGianToiThieuThamGia;
    }

    public void setThoiGianToiThieuThamGia(String thoiGianToiThieuThamGia) {
        this.thoiGianToiThieuThamGia = thoiGianToiThieuThamGia;
    }
}
