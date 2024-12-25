package ss1_java_overview.student_management;

import java.util.Scanner;

public class Student {
    int id;
    String name;
    double score;

    void input(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Vui lòng nhập vào id: ");
        id = Integer.parseInt(sc.nextLine());

        System.out.print("Vui lòng nhập vào tên: ");
        name = sc.nextLine();

        System.out.print("Vui lòng nhập vào điểm: ");
        score = Double.parseDouble(sc.nextLine());
    }

    void output(){
        System.out.println("id = " + id);
        System.out.println("name: " + name);
        System.out.println("score: " + score);
    }

}
