package ss4_java_overview_inheritance.phone_management;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<NewPhone> newPhones = new ArrayList<>();
    static ArrayList<OldPhone> oldPhones = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        newPhones.add(new NewPhone("DTM01", "Iphone 8 Plus", 20000000, 12, "Iphone", 10));
        newPhones.add(new NewPhone("DTM02", "Iphone 12", 240000000, 12, "Iphone", 5));

        oldPhones.add(new OldPhone("DTC01", "Iphone 8 Plus", 4000000, 12, "Iphone", "Tốt", "99% new like"));
        oldPhones.add(new OldPhone("DTC02", "Iphone 13", 10000000, 12, "Iphone", "Tốt", "99% new like"));

        int choose;
        while (true) {
            do {
                System.out.println("\n=========Chương trình quản lý điện thoại==============");
                System.out.println("1. Xem danh sách điện thoại");
                System.out.println("2. Thêm mới");
                System.out.println("3. Cập nhật");
                System.out.println("4. Xóa");
                System.out.println("5. Sắp xếp theo giấ");
                System.out.println("6. Tìm kiếm");
                System.out.println("7. Tính tổng tiền");
                System.out.println("8. Giảm giá cho điện thoại cũ");
                System.out.println("9. Thoát");

                System.out.print("Bạn vui lòng chọn: ");
                choose = Integer.parseInt(sc.nextLine());

                switch (choose) {
                    case 1:
                        menuShowlist();
                        break;
                    case 2:
                        addNew();
                        break;
                    case 3:
                        update();
                        break;
                    case 4:
                        delete();
                        break;
                    case 5:
                        break;
                    case 6:
                        searchPhone();
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        return;
                    default:
                        System.out.println("lựa chọn không hợp lệ! vui lòng chọn lại");
                }

            } while (choose < 1 || choose > 9);
        }
    }

    //1Xem danh sách điện thoại
    public static void menuShowlist() {
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            System.out.println();
            System.out.println("===========Xem danh sách điện thoại===========");
            System.out.println("1. Xem tất cả");
            System.out.println("2. Xem điện thoại cũ");
            System.out.println("3. Xem điện thoại mới");
            System.out.println("4. Trở về menu chính");

            System.out.print("Mời bạn chọn chức năng: ");
            choose = Integer.parseInt(sc.nextLine());

            switch (choose) {
                case 1:
                    System.out.println("\n===========Danh sách tất cả điện thoại==============");
                    for (int i = 0; i < oldPhones.size(); i++) {
                        System.out.println("Thông tin điện thoại thứ " + (i + 1));
                        oldPhones.get(i).outputPhone();
                    }

                    for (int i = 0; i < newPhones.size(); i++) {
                        System.out.println("\nThông tin điện thoại thứ " + (i + 1));
                        newPhones.get(i).outputPhone();
                    }
                    break;
                case 2:
                    System.out.println("\n===============Điện thoại cũ==============");
                    for (int i = 0; i < oldPhones.size(); i++) {
                        System.out.println("Thông tin điện thoại thứ " + (i + 1));
                        oldPhones.get(i).outputPhone();
                    }
                    break;
                case 3:
                    System.out.println("\n===============Điện thoại mới==============");
                    for (int i = 0; i < newPhones.size(); i++) {
                        System.out.println("Thông tin điện thoại thứ " + (i + 1));
                        newPhones.get(i).outputPhone();
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("lựa chọn không hợp lệ! vui lòng chọn lại");
            }
        } while (choose < 1 || choose > 4);
    }

    //2.Thêm mới
    public static void addNew() {
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            System.out.println("\n===========Thêm mới===========");
            System.out.println("1. Thêm điện thoại cũ");
            System.out.println("2. Thêm điện thoại mới");
            System.out.println("3. Trở về menu chính");

            System.out.print("Mời bạn chọn chức năng: ");
            choose = Integer.parseInt(sc.nextLine());

            switch (choose) {
                case 1:
                    System.out.print("Nhập mã điện thoại: ");
                    String id = sc.nextLine();

                    System.out.print("Nhập tên điện thoại: ");
                    String namePhone = sc.nextLine();

                    System.out.print("Nhập giá bán: ");
                    double sellingPrice = Double.parseDouble(sc.nextLine());

                    System.out.print("Nhập thời gian bảo hành: ");
                    int timeGuaranteed = Integer.parseInt(sc.nextLine());

                    System.out.print("Nhập hãng sản xuất: ");
                    String manufacturer = sc.nextLine();

                    System.out.print("Nhập trạng thái pin: ");
                    String stateBattery = sc.nextLine();

                    System.out.print("Nhập thêm mô tả: ");
                    String description = sc.nextLine();

                    OldPhone newOldPhone = new OldPhone(id, namePhone, sellingPrice, timeGuaranteed, manufacturer, stateBattery, description);
                    oldPhones.add(newOldPhone);

                    System.out.println("Thêm mới thành công");
                    break;

                case 2:
                    System.out.print("Nhập mã điện thoại: ");
                    String id2 = sc.nextLine();

                    System.out.print("Nhập tên điện thoại: ");
                    String namePhone2 = sc.nextLine();

                    System.out.print("Nhập giá bán: ");
                    double sellingPrice2 = Double.parseDouble(sc.nextLine());

                    System.out.print("Nhập thời gian bảo hành: ");
                    int timeGuaranteed2 = Integer.parseInt(sc.nextLine());

                    System.out.print("Nhập hãng sản xuất: ");
                    String manufacturer2 = sc.nextLine();

                    System.out.print("Nhập số lượng: ");
                    int quantity = Integer.parseInt(sc.nextLine());

                    NewPhone addNewPhone = new NewPhone(id2, namePhone2, sellingPrice2, timeGuaranteed2, manufacturer2, quantity);
                    newPhones.add(addNewPhone);

                    System.out.println("Thêm mới thành công");
                    break;

                case 3:
                    return;
                default:
                    System.out.println("lựa chọn không hợp lệ! vui lòng chọn lại");
            }
        } while (choose < 1 || choose > 3);
    }

    //5. sắp xếp theo giá
    public static void sortByPrice() {
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            System.out.println("\n===========Sắp xếp theo giá===========");
            System.out.println("1. Tăng dần");
            System.out.println("2. Giảm dần");
            System.out.println("3. Trở về menu chính");

            System.out.print("Mời bạn chọn chức năng: ");
            choose = Integer.parseInt(sc.nextLine());
        } while (choose < 1 || choose > 3);
    }

    //6. tìm kiếm
    public static void searchPhone() {
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            System.out.println("\n===========Tìm kiếm===========");
            System.out.println("1. Tìm kiếm tất cả điện thoại");
            System.out.println("2. Tìm kiếm điện thoại cũ");
            System.out.println("3. Tìm kiếm điện thoại mới");
            System.out.println("4. Trở về menu chính");

            System.out.print("Mời bạn chọn chức năng: ");
            choose = Integer.parseInt(sc.nextLine());

            switch (choose) {
                case 1:
                    searchOption();
                    break;
                case 2:
                    searchOption();
                    break;
                case 3:
                    searchOption();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! vui lòng chọn lại");
            }
        } while (choose < 1 || choose > 3);
    }

    // tìm kiếm theo lựa chọn
    public static void searchOption() {
        Scanner sc = new Scanner(System.in);
        int chooseOption;
        do {
            System.out.println("\n===========Tìm kiếm===========");
            System.out.println("1. Tìm kiếm theo giá");
            System.out.println("2. Tìm kiếm theo tên");
            System.out.println("3. Tìm kiếm theo hãng");
            System.out.println("4. Trở về menu Tìm kiếm");

            System.out.print("Mời bạn chọn chức năng: ");
            chooseOption = Integer.parseInt(sc.nextLine());
        } while (chooseOption < 1 || chooseOption > 3);
    }

    //3. update
    public static void update() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã muốn cập nhật: ");
        String id = sc.nextLine();

        if (id.startsWith("DTC")) {
            boolean isExist = false;
            for (OldPhone oldPhone : oldPhones) {
                if (oldPhone.getId().equals(id)) {
                    isExist = true;
                    oldPhone.inputPhone();
                    System.out.println("Cập nhật thành công");
                    break;
                }
            }
            if (!isExist) {
                System.out.println("Không tìm thấy mã muốn cập nhật");
            }
        } else if (id.startsWith("DTM")) {
            boolean isExist = false;
            for (NewPhone newPhone : newPhones) {
                if (newPhone.getId().equals(id)) {
                    isExist = true;
                    newPhone.inputPhone();
                    System.out.println("Cập nhật thành công");
                    break;
                }
            }
            if (!isExist) {
                System.out.println("Không tìm thấy mã muốn cập nhật");
            }
        }else {
            System.out.println("Mã không hợp lệ!");
        }

    }

    //4/ delete
    public static void delete(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã muốn xóa: ");
        String id = sc.nextLine();

        if(id.startsWith("DTC")) {
            boolean isExist = false;
            for (OldPhone oldPhone : oldPhones) {
                if (oldPhone.getId().equals(id)) {
                    isExist = true;
                    System.out.printf("Bạn có xóa điện thoại có mã %s không ? ",id);
                    System.out.println("\nChọn yes để xác nhận xóa, no để hủy ");
                    if ("yes".equalsIgnoreCase(sc.nextLine())) {
                        oldPhones.remove(oldPhone);
                        System.out.println("Xóa thành công");
                    }else{
                        System.out.println("Đã hủy việc xóa");
                    }
                    break;
                }
            }
            if (!isExist) {
                System.out.println("Không tìm thấy mã muốn xóa");
            }
        }
        if (id.startsWith("DTM")) {
            boolean isExist = false;
            for (NewPhone newPhone : newPhones) {
                if (newPhone.getId().equals(id)) {
                    isExist = true;
                    System.out.printf("Bạn có xóa điện thoại có mã %s không ? ",id);
                    System.out.println("\nChọn yes để xác nhận xóa, no để hủy ");
                    if ("yes".equalsIgnoreCase(sc.nextLine())) {
                        newPhones.remove(newPhone);
                        System.out.println("Xóa thành công");
                    }else{
                        System.out.println("Đã hủy việc xóa");
                    }
                    break;
                }
            }
            if (!isExist) {
                System.out.println("Không tìm thấy mã muốn xóa");
            }
        }
    }
}
