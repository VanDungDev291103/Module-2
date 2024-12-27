package ss1_java_overview.coordinate_processing;

import java.util.Scanner;

public class Point {
    // xu lý toa do
    double x;
    double y;

    void input(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Vui lòng nhập x: ");
        x = Double.parseDouble(sc.nextLine());

        System.out.print("Vui lòng nhập y: ");
        y = Double.parseDouble(sc.nextLine());
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }
}
