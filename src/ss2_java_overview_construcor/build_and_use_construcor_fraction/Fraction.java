package ss2_java_overview_construcor.build_and_use_construcor_fraction;

public class Fraction {
    private int numerator;// tử số
    private int denominator;// mau so

    public Fraction() {
    }

    public Fraction(int numerator) {
        this.numerator = numerator;
        denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simlifyFraction();
    }

    void simlifyFraction() {
        int UCLN = UCLN(Math.abs(numerator), Math.abs(denominator));
        numerator /= UCLN;
        denominator /= UCLN;
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    int UCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void output() {
        if (denominator == 1) {
            System.out.println(numerator);
        } else {
            System.out.println(numerator + "/" + denominator);
        }
    }

    public Fraction copy() {
        return new Fraction(numerator, denominator);
    }

    public void add(int n) {
        numerator += n * denominator;
        simlifyFraction();
    }
}
