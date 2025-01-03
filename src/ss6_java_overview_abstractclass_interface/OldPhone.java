package ss6_java_overview_abstractclass_interface;

import java.io.Serializable;
import java.util.Scanner;

public class OldPhone extends Phone implements Discountable {
    private String stateBattery;// trạng thái pin
    private String description;// mô tả thêm

    public OldPhone() {

    }

    public OldPhone(String id, String namePhone, double sellingPrice, int timeGuaranteed, String manufacturer, String stateBattery, String description) {
        super(id, namePhone, sellingPrice, timeGuaranteed, manufacturer);
        this.stateBattery = stateBattery;
        this.description = description;
    }

    @Override
    public void inputPhone() {
        Scanner sc = new Scanner(System.in);
        super.inputPhone();

        System.out.print("Nhập trạng thái pin: ");
        stateBattery = sc.nextLine();

        System.out.print("Nhập thêm mô tả: ");
        description = sc.nextLine();
    }

    @Override
    public void outputPhone() {
        super.outputPhone();
        System.out.println("Trạng thái pin: " + stateBattery);
        System.out.println("Mô tả: " + description);
    }

    @Override
    public double calculateTotalPrice() {
        return getSellingPrice();
    }

    @Override
    public void discount(double percentDiscount) {
        double discountPrice = getSellingPrice() * (1 - percentDiscount / 100.0);
        setSellingPrice(discountPrice);
    }

    public String getStateBattery() {
        return stateBattery;
    }

    public void setStateBattery(String stateBattery) {
        this.stateBattery = stateBattery;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
