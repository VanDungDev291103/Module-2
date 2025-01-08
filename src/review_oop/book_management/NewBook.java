package review_oop.book_management;

import java.util.Scanner;

public class NewBook extends Book {
    private int stock; // số lượng tồn kho

    public NewBook() {

    }

    public NewBook(String bookId, String bookName, String author, Double price, int quantity, String publisher, int stock) {
        super(bookId, bookName, author, price, quantity, publisher);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public void inputBook() {
        super.inputBook();
        Scanner sc = new Scanner(System.in);

        System.out.print("Vui lòng nhập số lượng tồn kho: ");
        this.stock = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void outputBook() {
        super.outputBook();
        System.out.println("Số lượng tồn kho: " + this.stock);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
}
