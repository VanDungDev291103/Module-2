package review_oop.book_management;

import java.util.Scanner;

public abstract class Book {
    private String bookId;
    private String bookName;
    private String author;
    private Double price;
    private int quantity;
    private String publisher;// nhà xuất bản

    public Book() {

    }

    public Book(String bookId, String bookName, String author, Double price, int quantity, String publisher) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
        this.publisher = publisher;
    }

    public void inputBook(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Vui lòng nhập mã sách: ");
        this.bookId = sc.nextLine();

        System.out.print("Vui lòng nhập Tên sách: ");
        this.bookName = sc.nextLine();

        System.out.print("Vui lòng nhập tác giả: ");
        this.author = sc.nextLine();

        System.out.print("Vui lòng nhập giá: ");
        this.price = Double.parseDouble(sc.nextLine());

        System.out.print("Vui lòng nhập số lượng: ");
        this.quantity = Integer.parseInt(sc.nextLine());

        System.out.print("Vui lòng nhập nhà xuất bản: ");
        this.publisher = sc.nextLine();
    }

    public void outputBook(){
        System.out.println("Mã sách: " + this.bookId);
        System.out.println("Tên sách: " + this.bookName);
        System.out.println("Tác giả: " + this.author);
        System.out.println("Giá bán: " + this.price);
        System.out.println("số lượng: " + this.quantity);
        System.out.println("Nhà xuất bản: " + this.publisher);
    }

    public abstract double calculateTotalPrice();

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
