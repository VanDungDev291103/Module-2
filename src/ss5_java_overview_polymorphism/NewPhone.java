package ss5_java_overview_polymorphism;

import java.util.Scanner;

public class NewPhone extends Phone {
    private int quantity;// số lượng

    public NewPhone() {

    }

    public NewPhone(String id, String namePhone, double sellingPrice, int timeGuaranteed, String manufacturer, int quantity) {
        super(id, namePhone, sellingPrice, timeGuaranteed, manufacturer);
        this.quantity = quantity;
    }

    @Override
    public void inputPhone() {
        Scanner sc = new Scanner(System.in);
        super.inputPhone();

        System.out.print("Nhập số lượng: ");
        quantity = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void outputPhone() {
        super.outputPhone();
        System.out.println("Số lượng: " + quantity);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
