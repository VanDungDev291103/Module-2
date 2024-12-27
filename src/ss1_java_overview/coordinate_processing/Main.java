package ss1_java_overview.coordinate_processing;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println("Điểm thứ nhất: ");
        point.input();

        System.out.println();
        Point point2 = new Point();
        System.out.println("Điểm thứ hai: ");
        point2.input();

        System.out.printf("Khoảng cách giữ 2 điểm là: %.0f", point.distance(point2));
    }
}
