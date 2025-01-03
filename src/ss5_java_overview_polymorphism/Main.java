package ss5_java_overview_polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Phone> phones = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        phones.add(new NewPhone("DTM01", "Iphone 8 Plus", 20000000, 12, "Iphone", 10));
        phones.add(new NewPhone("DTM02", "Iphone 12", 240000000, 12, "Iphone", 5));

        phones.add(new OldPhone("DTC01", "Iphone 8 Plus", 4000000, 12, "Iphone", "Tốt", "99% new like"));
        phones.add(new OldPhone("DTC02", "Iphone 13", 10000000, 12, "Iphone", "Tốt", "99% new like"));

        int choose;
        while (true) {
//            do {
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
                    sortByPrice();
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

//            } while (choose < 1 || choose > 9);
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
                    for (int i = 0; i < phones.size(); i++) {
                        System.out.println("Thông tin điện thoại thứ " + (i + 1));
                        phones.get(i).outputPhone();
                    }
                    break;
                case 2:
                    System.out.println("\n===============Điện thoại cũ==============");
                    int count = 1;
                    for (Phone phone : phones) {
                        if (phone instanceof OldPhone) {
                            System.out.println("Thông tin điện thoại thứ " + count++);
                            phone.outputPhone();
                        }
                    }
                    break;
                case 3:
                    System.out.println("\n===============Điện thoại mới==============");
                    int count2 = 1;
                    for (Phone phone : phones) {
                        if (phone instanceof NewPhone) {
                            System.out.println("Thông tin điện thoại thứ " + count2++);
                            phone.outputPhone();
                        }
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
                    OldPhone oldPhone = new OldPhone();
                    oldPhone.inputPhone();
                    phones.add(oldPhone);
                    System.out.println("Thêm mới thành công");
                    break;
                case 2:
                    NewPhone newPhone = new NewPhone();
                    newPhone.inputPhone();
                    phones.add(newPhone);
                    System.out.println("Thêm mới thành công");
                    break;

                case 3:
                    return;
                default:
                    System.out.println("lựa chọn không hợp lệ! vui lòng chọn lại");
            }
        } while (choose < 1 || choose > 3);
    }

    //3. update
    public static void update() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã muốn cập nhật: ");
        String id = sc.nextLine();

        if (id.startsWith("DTC")) {
            boolean isExist = false;
            for (Phone phone : phones) {
                if (phone instanceof OldPhone) {
                    if (phone.getId().equals(id)) {
                        isExist = true;
                        phone.inputPhone();
                        System.out.println("Cập nhật thành công");
                        break;
                    }
                }
            }
            if (!isExist) {
                System.out.println("Không tìm thấy mã muốn cập nhật");
            }
        } else if (id.startsWith("DTM")) {
            boolean isExist = false;
            for (Phone phone : phones) {
                if (phone instanceof NewPhone) {
                    if (phone.getId().equals(id)) {
                        isExist = true;
                        phone.inputPhone();
                        System.out.println("Cập nhật thành công");
                        break;
                    }
                }
            }
            if (!isExist) {
                System.out.println("Không tìm thấy mã muốn cập nhật");
            }
        } else {
            System.out.println("Mã không hợp lệ!");
        }

    }

    //4/ delete
    public static void delete() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã muốn xóa: ");
        String id = sc.nextLine();

        if (id.startsWith("DTC")) {
            boolean isExist = false;
            for (Phone phone : phones) {
                if (phone instanceof OldPhone) {
                    if (phone.getId().equals(id)) {
                        isExist = true;
                        System.out.printf("Bạn có xóa điện thoại có mã %s không ? ", id);
                        System.out.println("\nChọn yes để xác nhận xóa, no để hủy ");
                        if ("yes".equalsIgnoreCase(sc.nextLine())) {
                            phones.remove(phone);
                            System.out.println("Xóa thành công");
                        } else {
                            System.out.println("Đã hủy việc xóa");
                        }
                        break;
                    }
                }
            }
            if (!isExist) {
                System.out.println("Không tìm thấy mã muốn xóa");
            }
        }
        if (id.startsWith("DTM")) {
            boolean isExist = false;
            for (Phone phone : phones) {
                if (phone instanceof NewPhone) {
                    if (phone.getId().equals(id)) {
                        isExist = true;
                        System.out.printf("Bạn có xóa điện thoại có mã %s không ? ", id);
                        System.out.println("\nChọn yes để xác nhận xóa, no để hủy ");
                        if ("yes".equalsIgnoreCase(sc.nextLine())) {
                            phones.remove(phone);
                            System.out.println("Xóa thành công");
                        } else {
                            System.out.println("Đã hủy việc xóa");
                        }
                        break;
                    }
                }
            }
            if (!isExist) {
                System.out.println("Không tìm thấy mã muốn xóa");
            }
        }
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

            switch (choose) {
                case 1: // sắp xếp tăng dần Bubble sort
                    for (int i = 0; i < phones.size() - 1; i++) {
                        for (int j = i + 1; j < phones.size() - 1 - i; j++) {
                            if (phones.get(j).getSellingPrice() > phones.get(j + 1).getSellingPrice()) {
                                Phone temp = phones.get(j);
                                phones.set(j, phones.get(j + 1));
                                phones.set(j + 1, temp);
                            }
                        }
                    }
                    System.out.println("============ Giá điện thoại theo giá tăng dần ========= ");
                    menuShowlist();
                    break;

                case 2: // sắp xếp theo giá giảm dần
                    for (int i = 0; i < phones.size() - 1; i++) {
                        for (int j = i + 1; j < phones.size() - 1 - i; j++) {
                            if (phones.get(i).getSellingPrice() < phones.get(j + 1).getSellingPrice()) {
                                Phone temp = phones.get(i);
                                phones.set(i, phones.get(j + 1));
                                phones.set(j + 1, temp);
                            }
                        }
                    }
                    System.out.println("============ Giá điện thoại theo giá giảm dần ========= ");
                    menuShowlist();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("lựa chọn không hợp lệ! vui lòng chọn lại");
            }
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

            switch (chooseOption) {
                case 1:
                    searchPrice();
                    break;
                case 2:
                    searchName();
                    break;
                case 3:
                    searchManufacturer();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ! vui lòng chọn lại");
            }
        } while (chooseOption < 1 || chooseOption > 4);
    }

    // tìm kiếm theo giá
    public static void searchPrice() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập khoảng giá tìm từ : ");
        double searchPriceFrom = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập khoảng giá tìm đến : ");
        double searchPriceTo = Double.parseDouble(sc.nextLine());

        System.out.println("========= Kết quả tìm kiếm ============");
        boolean isExist = false;
        for (Phone phone : phones) {
            if (phone.getSellingPrice() >= searchPriceFrom && phone.getSellingPrice() <= searchPriceTo) {
                phone.outputPhone();
                isExist = true;
            }
        }
        if (!isExist) {
            System.out.println("không tìm thấy điện thoại với giá khoảng giá bạn đã nhập!");
        }
    }

    // tìm kiếm điện thoại theo tên
    public static void searchName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên cần tìm: ");
        String name = sc.nextLine();

        System.out.println("========= Kết quả tìm kiếm ============");
        boolean isExist = false;
        for (Phone phone : phones) {
            if (phone.getNamePhone().equalsIgnoreCase(name)) {
                phone.outputPhone();
                isExist = true;
            }
        }
        if (!isExist) {
            System.out.println("Không tìm thấy điện thoại với tên " + name);
        }
    }

    // tìm kiếm điện thoại theo hãng
    public static void searchManufacturer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vui lòng nhập hãng cần tìm: ");
        String manufacturer = sc.nextLine();

        System.out.println("========= Kết quả tìm kiếm ============");
        boolean isExist = false;
        for (Phone phone : phones) {
            if (phone.getManufacturer().equalsIgnoreCase(manufacturer)) {
                phone.outputPhone();
                isExist = true;
            }
        }
        if (!isExist) {
            System.out.println("Không tìm thấy điện thoại với hãng " + manufacturer);
        }
    }

}
