package ss3_overview_static.count_object_students;

public class Main {
    public static void main(String[] args) {
        // đếm số lượng đối tượng sinh viên được tạo ra
        Student student = new Student();
        Student student2 = new Student(1, "Dũng", 9);
        Student student3 = new Student(2,"A",5);

        System.out.println("Số lượng đối tượng được tạo ra là: " + Student.getCountObjectStudent());
    }
}
