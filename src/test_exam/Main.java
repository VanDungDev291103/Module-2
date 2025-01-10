package test_exam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Customer> customers = new ArrayList<Customer>();
    static List<InsurancePackage> insurance = new ArrayList<InsurancePackage>();

    public static void main(String[] args) {

        customers.add(new Customer("Dũng", "29/11/2003", "daklak", "066203000000"));
        insurance.add(new InsuranceInCaseOfDeath("Bảo hiểm trong trường hợp tử vong", "Không xác định", 200.0000, "Thuc hien mai tan va chon cat", "Dong mot lan", "09/20/2015", "2 tháng", "null"));
        customers.add(new Customer("truyền", "20/11/2003", "quang nam", "06620303213000"));
        insurance.add(new InsuranceInCaseOfDeath("Bảo hiểm sinh ky", "Không xác định", 300.000, ".....", "Dong mot lan", "09/20/2015", "2 tháng", "null"));
        customers.add(new Customer("Thông", "21/09/2003", "quang tri", "0662030043141"));
        insurance.add(new InsuranceInCaseOfDeath("Bảo hiểm theo thoi han", "Không xác định", 150.000, ".........", "Dong mot lan", "09/20/2015", "2 tháng", "null"));
        Scanner sc = new Scanner(System.in);
        int choose;

        do {
            System.out.println("=================Bảo Hiểm===============");
            System.out.println("1. Nhập Bảo hiểm");
            System.out.println("2. Xuất toàn bộ danh sách thông tin bảo hiểm");
            System.out.println("3. Tìm kiếm theo số chứng minh thư");
            System.out.println("4. Hiển thị thông tin của tất cả các gói bảo hiểm có mức phí đóng bảo hiểm là cao nhất");
            System.out.println("5. thoát");

            System.out.print("Vui lòng chọn: ");
            choose = sc.nextInt();

            switch (choose) {
                case 1:
                    input();
                    System.out.println();
//                    output();
                    break;
                case 2:
                    System.out.println();
                    displayAll();
                    break;
                case 3:
                    System.out.println();
                    searchIdNumber();
                    break;
                case 4:
                    hienThiTatCaCacGoiBaoHieMucPhiCaoNhat();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Không hợp lệ!");
            }
        } while (choose < 0 || choose > 5);
    }

    public static void input() {
        Scanner sc = new Scanner(System.in);
        int n;
        Customer customer = new Customer();
        InsuranceInCaseOfDeath insurance1 = new InsuranceInCaseOfDeath();
        LifeInsurance insurance2 = new LifeInsurance();
        InsuranceAccordingToContractTerm insurance3 = new InsuranceAccordingToContractTerm();
        customer.inputCustomer();
        customers.add(customer);
        do {
            System.out.println("=============Chọn Loại Bảo hiểm=============");
            System.out.println("1. Bảo hiểm trong trường hợp tử vong ");
            System.out.println("2. Bảo hiểm sinh kỳ");
            System.out.println("3. Bảo hiểm theo thời hạn hợp đồng.");

            System.out.print("Vui lòng chọn loại bảo hiểm: ");
            n = sc.nextInt();

            switch (n) {
                case 1:
                    insurance1.inputGoiBaoHiem();
                    insurance.add(insurance1);
                    customer.outputCustomer();
                    insurance1.outputBaoHiem();
                    break;
                case 2:
                    insurance2.inputGoiBaoHiem();
                    insurance.add(insurance2);
                    customer.outputCustomer();
                    insurance2.outputBaoHiem();
                    break;
                case 3:
                    insurance3.inputGoiBaoHiem();
                    insurance.add(insurance3);
                    customer.outputCustomer();
                    insurance3.outputBaoHiem();
                    break;
                default:
                    System.out.println("Không hợp lệ!");
            }
        } while (n < 0 || n > 3);
    }

//    public static void output() {
//        for (Customer customer : customers) {
//            for (InsurancePackage insurancePackage : insurance) {
//                if (insurancePackage instanceof InsuranceInCaseOfDeath) {
//                    customer.outputCustomer();
//                    insurancePackage.outputBaoHiem();
//                    return;
//                } else if (insurancePackage instanceof LifeInsurance) {
//                    customer.outputCustomer();
//                    insurancePackage.outputBaoHiem();
//                    return;
//                } else if (insurancePackage instanceof InsuranceAccordingToContractTerm) {
//                    customer.outputCustomer();
//                    insurancePackage.outputBaoHiem();
//                    return;
//                }
//            }
//        }
//    }

    public static void displayAll() {
        boolean isEmpty = false;
        for (int i = 0; i < customers.size(); i++) {
            customers.get(i).outputCustomer();
            insurance.get(i).outputBaoHiem();
            isEmpty = true;
        }

        if (!isEmpty) {
            System.out.println("Không tồn tại");
        }
    }

    public static void searchIdNumber() {
        Scanner sc = new Scanner(System.in);

        boolean find = false;
        System.out.print("Vui lòng nhập số chứng minh thư: ");
        String idNumber = sc.nextLine();

        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getIdNumber().equals(idNumber)) {
                customers.get(i).outputCustomer();
                insurance.get(i).outputBaoHiem();
                find = true;
            }
        }

        if (!find) {
            System.out.print("Không tìm thấy số chứng minh thư đã nhập");
        }
    }

    public static void hienThiTatCaCacGoiBaoHieMucPhiCaoNhat() {
        double max = 0;
        for (int i = 0; i < insurance.size(); i++) {
            if (max < insurance.get(i).getMucPhiDong()) {
                max = insurance.get(i).getMucPhiDong();
            }
        }
        for (int j = 0; j < insurance.size(); j++)
            if (insurance.get(j).getMucPhiDong() == max) {
                insurance.get(j).outputBaoHiem();
            }
    }

}
