package ss4_java_overview_inheritance.phone_management;

import java.util.Scanner;

public class Phone {
    private String id;// mã điện thoại
    private String namePhone;//tên điện thoại
    private double sellingPrice; // Giá bán
    private int timeGuaranteed;// thời gian bảo hành
    private String manufacturer;// hãng sản xuất

    public Phone() {

    }

    public Phone(String id, String namePhone, double sellingPrice, int timeGuaranteed, String manufacturer) {
        this.id = id;
        this.namePhone = namePhone;
        this.sellingPrice = sellingPrice;
        this.timeGuaranteed = timeGuaranteed;
        this.manufacturer = manufacturer;
    }

    // hàm nhập
    public void inputPhone() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã điện thoại: ");
        id = sc.nextLine();

        System.out.print("Nhập tên điện thoại: ");
        namePhone = sc.nextLine();

        System.out.print("Nhập giá bán: ");
        sellingPrice = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập thời gian bảo hành: ");
        timeGuaranteed = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập hãng sản xuất: ");
        manufacturer = sc.nextLine();

    }

    // hàm xuất
    public void outputPhone() {
        System.out.println("Mã điện thoại: " + id);
        System.out.println("Tên điện thoại: " + namePhone);
        System.out.println("Giá bán điện thoại: " + sellingPrice);
        System.out.println("Thời gian bảo hành: " + timeGuaranteed + " Tháng");
        System.out.println("Hãng sản xuất: " + manufacturer);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamePhone() {
        return namePhone;
    }

    public void setNamePhone(String namePhone) {
        this.namePhone = namePhone;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getTimeGuaranteed() {
        return timeGuaranteed;
    }

    public void setTimeGuaranteed(int timeGuaranteed) {
        this.timeGuaranteed = timeGuaranteed;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
