package ss2_java_overview_construcor.build_and_use_construcor_fraction;

public class Main {
    public static void main(String[] args) {
        System.out.println("Phân số 1:");
        Fraction fraction = new Fraction(1, 2);
        fraction.output();

        System.out.println("\nPhân so 2: ");
        Fraction fraction2 = new Fraction(3);
        fraction2.output();

        System.out.println("\nPhân so 3: ");
        Fraction fraction3 = new Fraction(-6, -2);
        fraction3.output();

        System.out.println("\nPhân so 4: ");
        Fraction fraction4 = new Fraction(3, -1);
        fraction4.output();

        System.out.println("\nPhân so 5: ");
        Fraction fraction5 = fraction4.copy();
        fraction5.output();

        System.out.print("Sau khi phân số cộng thêm: ");
        fraction5.add(100);// phan so cong them
        fraction5.output();
    }
}
