package ss11_java_overview_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Vui lòng nhập điện thoại cũ với mã DTCXXXXX (với XXX là số): ");
//        input = sc.nextLine();
//
//        System.out.println(input.matches("DTC[0-9]{3}"));
//        System.out.println("Nhập số điện thoại");
//        input = sc.nextLine();
//        System.out.println("=================Kiểm tra sdt===================");
//        System.out.println(input.matches("(0|\\+84)([32|33|34|35|36|37|38|39])[0-9]{7}"));

        // a. Kiểm tra số điện thoại
        System.out.print("Vui lòng nhập số điện thoại: ");
        String phoneNumber = sc.nextLine();
        System.out.println(phoneNumber.matches("(0|[(][+][84][)])(32|33|34|35|36|37|38|39)\\d{7}$"));

        //b.  Kiểm tra email
        System.out.print("Vui lòng nhập email: ");
        String email = sc.nextLine();
        System.out.println(email.matches("[a-zA-Z0-9_]{6,32}@[a-zA-Z0-9]{2,12}\\.[a-zA-Z0-9]{2,12}"));

        //c. Kiểm tra username
        System.out.print("Vui lòng nhập username: ");
        String username = sc.nextLine();
        System.out.println(username.matches("[a-zA-Z0-9._]{6,32}"));

        //d.  Kiểm tra password
        System.out.print("Vui lòng nhập password: ");
        String password = sc.nextLine();
        System.out.println(password.matches("[A-Z][a-zA-Z0-9!@#$%^&*()_]{6,32}"));
    }
}
