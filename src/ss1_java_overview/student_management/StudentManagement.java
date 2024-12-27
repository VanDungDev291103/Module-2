package ss1_java_overview.student_management;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        // nhập và xuất thông tin của n học sinh
//        ArrayList<Student> students = new ArrayList<Student>();
        Student student = new Student();
        student.inputStudent();
        System.out.println("\n==============Thông tin học sinh===================");
        student.outputStudent();
//        Scanner sc = new Scanner(System.in);
//        int n;
//        do {
//            System.out.println("Vui lòng nhập n: ");
//            n = sc.nextInt();
//        } while (n < 1);
//        for (int i = 1; i <= n; i++) {
//            System.out.printf("Sinh viên thứ %d\n", i);
//            student.input();
//            students.add(student);
//            System.out.println();
//        }
//
//        for (int i = 1; i <= n; i++) {
//            System.out.printf("Sinh viên thứ %d\n", i);
//            students.get(i - 1).output();
//            System.out.println();
        }
//        Student student = new Student();// constructor không có tham so
//        student.input();
//        student.output();
//
//        Student student2 = new Student(1,"dũng",7);//constructor có tham so
//        student2.output();

}
