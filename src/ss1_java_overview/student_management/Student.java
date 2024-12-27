package ss1_java_overview.student_management;

import java.util.Scanner;

public class Student {
    String name;
    double mathScore; //điêm toan
    double literatureScore; // điểm văn

    void inputStudent(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên: ");
        name = sc.nextLine();

        System.out.print("Nhập điểm toán: ");
        mathScore = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập điểm văn: ");
        literatureScore = Double.parseDouble(sc.nextLine());
    }

    double calAverageScore(){
        return (mathScore + literatureScore)/2;
    }

    void outputStudent(){
        System.out.println("Tên: " + name);
        System.out.println("điểm toán: " + mathScore);
        System.out.println("Điểm văn: " + literatureScore);
        System.out.println("Điểm trung bình là: " + calAverageScore());
    }

}
