package ss2_java_overview_construcor.buil_student_with_encapsulation;

public class Main {
    // xây dựng lớp sinh viên với tính bao đóng
    public static void main(String[] args) {
        Student student = new Student(1, "Hoang Van Dung", 8);
        System.out.println("===============Thông tin sinh viên===================");
        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getScore());

        System.out.println("===================Cập nhật thông tin sinh viên=================");
        student.setName("Hoàng Văn Dũng");
        student.setScore(10);
        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getScore());

        System.out.println();
        student.setScore(-1);
        System.out.println(student.getScore());
    }
}
