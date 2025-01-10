package test_exam;

import java.time.LocalDate;
import java.util.Scanner;

public class InsuranceAccordingToContractTerm extends InsurancePackage {
    private String thoiGianKetThuc;
    private String sanPhamBaoHiemDiKem;

    public InsuranceAccordingToContractTerm() {

    }

    public InsuranceAccordingToContractTerm(String tenGoiBaoHiem, String thoiHanDong, double mucPhiDong, String mucDich, String cachThucDong, String thoiGianBatDau, String thoiGianKetThuc, String sanPhamBaoHiemDiKem) {
        super(tenGoiBaoHiem, thoiHanDong, mucPhiDong, mucDich, cachThucDong, thoiGianBatDau);
        this.thoiGianKetThuc = thoiGianKetThuc;
        this.sanPhamBaoHiemDiKem = sanPhamBaoHiemDiKem;
    }

    @Override
    public void inputGoiBaoHiem() {
        Scanner sc = new Scanner(System.in);
        super.inputGoiBaoHiem();

        System.out.print("Vui lòng nhập Thời Gian Kết Thúc: " + thoiGianKetThuc);
        this.thoiGianKetThuc = sc.nextLine();
        System.out.print("Vui lòng nhập Sản Phẩm Bảo Hiểm Đi Kèm: " + sanPhamBaoHiemDiKem);
        this.sanPhamBaoHiemDiKem = sc.nextLine();
    }

    @Override
    public void outputBaoHiem() {
        super.outputBaoHiem();
        System.out.println("Thời gian kết thúc: " + thoiGianKetThuc);
        System.out.println("Sản phẩm bảo hiểm đi kèm: " + sanPhamBaoHiemDiKem);
    }

    public String getThoiGianKetThuc() {
        return thoiGianKetThuc;
    }

    public void setThoiGianKetThuc(String thoiGianKetThuc) {
        this.thoiGianKetThuc = thoiGianKetThuc;
    }

    public String getSanPhamBaoHiemDiKem() {
        return sanPhamBaoHiemDiKem;
    }

    public void setSanPhamBaoHiemDiKem(String sanPhamBaoHiemDiKem) {
        this.sanPhamBaoHiemDiKem = sanPhamBaoHiemDiKem;
    }
}
