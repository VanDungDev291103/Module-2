package ss1_java_overview.student_management;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sinh viên 1");
        Student student = new Student();
        // Student: đối tượng || student: biến đối tượng
        student.input();
        student.output();

        Student student2 = new Student();
        // Student: đối tượng || student: biến đối tượng
        System.out.println("\nSinh viên 2");
        student2.input();
        student2.output();


    }
}
