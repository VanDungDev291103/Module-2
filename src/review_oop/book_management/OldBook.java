package review_oop.book_management;

import java.util.Scanner;

public class OldBook extends Book implements Discount{
    private String condition; // tình trạng sách
    private int publishedYear; // năm xuất bản

    public OldBook() {

    }

    public OldBook(String bookId, String bookName, String author, Double price, int quantity, String publisher, String condition, int publishedYear) {
        super(bookId, bookName, author, price, quantity, publisher);
        this.condition = condition;
        this.publishedYear = publishedYear;
    }

    @Override
    public void inputBook() {
        super.inputBook();
        Scanner sc = new Scanner(System.in);

        System.out.print("Vui lòng nhập tình trạng sách: ");
        this.condition = sc.nextLine();

        System.out.print("Vui lòng nhập năm xuất bản: ");
        this.publishedYear = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void outputBook() {
        super.outputBook();
        System.out.println("Tình trạng sách: " + this.condition);
        System.out.println("Năm xuất bản: " + this.publishedYear);
    }

    @Override
    public double calculateTotalPrice() {
        double totolPrice = getPrice() * getQuantity();
        double discount = discount(getQuantity());
        return totolPrice - discount;
    }

    @Override
    public double discount(int quantity) {
        double discountRate = 0;
        if(condition.equalsIgnoreCase("cũ vừa")){
            discountRate = 0.1; // giảm 10%
        }else if (condition.equalsIgnoreCase("rất cũ")){
            discountRate = 0.2;
        }
        return getPrice() * quantity * discountRate;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }
}
