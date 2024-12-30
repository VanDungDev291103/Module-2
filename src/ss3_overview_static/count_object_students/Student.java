package ss3_overview_static.count_object_students;

public class Student {
    private int id;
    private String name;
    private double score;
    private static int countObjectStudent = 0; // khi tạo đối tươợng thông qua constructor thì ta đa biến đếm lên

    public Student() {
        countObjectStudent++;
    }

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
        countObjectStudent++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public static int getCountObjectStudent() {
        return countObjectStudent;
    }

    public static void setCountObjectStudent(int countObjectStudent) {
        Student.countObjectStudent = countObjectStudent;
    }
}
