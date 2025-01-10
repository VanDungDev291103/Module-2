package test_exam;

import java.time.LocalDate;
import java.util.Scanner;

public class Customer extends InsurancePackage {
    private String fullName;
    private String dateOfBirth; // ngày sinh
    private String placeOfResidence; // nơi thường trú
    private String idNumber;
    private InsurancePackage baoHiem;

    public Customer() {

    }

    public Customer(String fullName, String dateOfBirth, String placeOfResidence, String idNumber) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.placeOfResidence = placeOfResidence;
        this.idNumber = idNumber;
    }

    public void inputCustomer() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Vui lòng nhập Họ Tên: ");
        fullName = sc.nextLine();

        System.out.print("Vui lòng nhập Ngày Sinh: ");
        dateOfBirth = sc.nextLine();

        System.out.print("Vui lòng nhập Nơi Thường Trú: ");
        placeOfResidence = sc.nextLine();

        System.out.print("Vui lòng nhập Số Chứng Minh Thư: ");
        idNumber = sc.nextLine();
    }

    public void outputCustomer() {
        System.out.println("Họ Tên: " + this.fullName);
        System.out.println("Ngày sinh: " + this.dateOfBirth);
        System.out.println("Nơi thường trú: " + this.placeOfResidence);
        System.out.println("Số chứng minh thư: " + this.idNumber);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPlaceOfResidence() {
        return placeOfResidence;
    }

    public void setPlaceOfResidence(String placeOfResidence) {
        this.placeOfResidence = placeOfResidence;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public InsurancePackage getBaoHiem() {
        return baoHiem;
    }

    public void setBaoHiem(InsurancePackage baoHiem) {
        this.baoHiem = baoHiem;
    }
}
