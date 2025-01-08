package review_oop.book_management;

import ss6_java_overview_abstractclass_interface.NewPhone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookStore {
    static List<Book> books = new ArrayList<Book>();
    public static void main(String[] args) {

        books.add(new NewBook("NB001","Văn","Văn Dũng",120.000,3,"Lan hương",3));
        books.add(new OldBook("OS001","Văn","Văn Dũng",80.000,1,"Lan hương","cũ vừa", 1991));
        Scanner sc = new Scanner(System.in);
        int n;

        while (true){
            System.out.println("=====================MENU======================");
            System.out.println("1. Thêm sách mới");
            System.out.println("2. Thêm sách cũ");
            System.out.println("3. Xóa sách");
            System.out.println("4. Sửa thông tin sách");
            System.out.println("5. tìm kiếm sách");
            System.out.println("6. Hiện thị tất cả sách");
            System.out.println("7. tính tiền sách");
            System.out.println("8. thoát");

            System.out.print("Bạn vui lòng chọn: ");
            n = Integer.parseInt(sc.nextLine());

            switch (n){
                case 1:
                    System.out.println("=============Thêm sách mới=============");
                    addNewBook();
                    break;
                case 2:
                    System.out.println("=============Thêm sách cũ===============");
                    addOldBook();
                    break;
                case 3:
                    deleteBook();
                    break;
                case 4:
                    System.out.println("==========sửa thông tin sách=============");
                    updateBook();
                    break;
                case 5:
                    break;
                case 6:
                    displayAllBooks();
                    break;
                case 7:
                    break;
                case 8:
                    return;
                default:
                    System.out.println("không hợp lệ!");
            }
        }
    }

    public static void addNewBook(){
        NewBook newBook = new NewBook();
        newBook.inputBook();
        books.add(newBook);
        System.out.println("Thêm thành công");
    }

    public static void addOldBook(){
        OldBook oldBook = new OldBook();
        oldBook.inputBook();
        books.add(oldBook);
        System.out.println("Thêm thành công");
    }

    public static void deleteBook(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Vui lòng nhập mã sách muốn xóa: ");
        String bookID = sc.nextLine();

        boolean isFound = false;

        // Duyệt qua danh sách sách để tìm sách có mã trùng với bookID
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookId().equalsIgnoreCase(bookID)) {
                books.remove(i);  // Xóa sách khỏi danh sách
                System.out.println("Sách với mã " + bookID + " đã được xóa thành công!");
                isFound = true;
                break;
            }
        }

        // Nếu không tìm thấy sách
        if (!isFound) {
            System.out.println("Không tìm thấy sách với mã " + bookID);
        }
    }

    public static void updateBook() {
        Scanner sc = new Scanner(System.in);

        // Yêu cầu người dùng nhập mã sách muốn sửa
        System.out.print("Vui lòng nhập mã sách muốn sửa: ");
        String bookID = sc.nextLine();

        boolean found = false;  // Biến để kiểm tra sách có tồn tại không

        // Duyệt qua danh sách sách để tìm sách cần sửa
        for (Book book : books) {
            if (book.getBookId().equalsIgnoreCase(bookID)) {
                found = true;

                // In ra thông tin hiện tại của sách
                System.out.println("Thông tin sách hiện tại: ");
                book.outputBook(); // Giả sử có phương thức `outputBook()` để hiển thị thông tin sách

                // Yêu cầu người dùng nhập thông tin mới
                System.out.println("Nhập thông tin mới (để trống nếu không thay đổi):");

                // Nhập tên sách mới
                System.out.print("Tên sách: ");
                String newName = sc.nextLine();
                if (!newName.isEmpty()) {
                    book.setBookName(newName);
                }

                // Nhập tác giả mới
                System.out.print("Tác giả: ");
                String newAuthor = sc.nextLine();
                if (!newAuthor.isEmpty()) {
                    book.setAuthor(newAuthor);
                }

                // Nhập giá mới
                System.out.print("Giá sách: ");
                String newPrice = sc.nextLine();
                if (!newPrice.isEmpty()) {
                    book.setPrice(Double.parseDouble(newPrice));
                }

                // Nhập nhà xuất bản mới
                System.out.print("Nhà xuất bản: ");
                String newPublisher = sc.nextLine();
                if (!newPublisher.isEmpty()) {
                    book.setPublisher(newPublisher);
                }

                // In thông báo sửa thành công
                System.out.println("Thông tin sách đã được sửa thành công!");
                break;
            }
        }

        // Nếu không tìm thấy sách với mã nhập vào
        if (!found) {
            System.out.println("Không tìm thấy sách với mã đã nhập.");
        }
    }

    public static void displayAllBooks(){
        System.out.println("Danh sách tất cả sách");
        for(int i = 0; i < books.size(); i++){
            books.get(i).outputBook();
        }
    }


}
