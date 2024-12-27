package ss1_java_overview.fractionprocess;

import java.util.Scanner;

public class Fraction {
    // lớp phân số
    private int numerator;// tử số
    private int denominator;// mẫu số

    public Fraction() {
    }

    public Fraction(int denominator, int numerator) {
        this.denominator = denominator;
        this.numerator = numerator;
    }

    public void inputFraction() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tử số: ");
        this.numerator = Integer.parseInt(sc.nextLine());
        do {
            System.out.print("Nhập mẫu số: ");
            this.denominator = Integer.parseInt(sc.nextLine());
            if (this.denominator == 0) {
                System.out.println("Vui lòng nhập lại");
            }
        } while (this.denominator == 0);
    }

    void outputFraction() {
        simlifyFraction();
        System.out.printf("phân số là: %d/%d ", this.numerator, this.denominator);
    }

    // rút gọn phân số
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

    // Phương thức cộng phân số
    public Fraction sum(Fraction f) {
        Fraction sum = new Fraction();
        sum.numerator = this.numerator * f.denominator + this.denominator * f.numerator;
        sum.denominator = this.denominator * f.denominator;
        return sum;
    }

    // Phương thức trừ phân số
    public Fraction subtract(Fraction f) {
        Fraction subtract = new Fraction();
        subtract.numerator = this.numerator * f.denominator - f.numerator * this.denominator;
        subtract.denominator = this.denominator * f.denominator;
        return subtract;
    }

    // phương thức nhân phân số
    public Fraction multiply(Fraction f) {
        Fraction multiply = new Fraction();
        multiply.numerator = this.numerator * f.numerator;
        multiply.denominator = this.denominator * f.denominator;
        return multiply;
    }

    // phương thức chia phân số
    public Fraction divide(Fraction f) {
        Fraction divide = new Fraction();
        if (f.numerator == 0) {
            System.out.println("Không thể chia cho 0");
        }
        divide.numerator = this.numerator * f.denominator;
        divide.denominator = this.denominator * f.numerator;
        return divide;
    }

    // kiểm tra phân số dương
    public String sign() {
        if (this.numerator == 0) {
            return "Phân số bằng không";
        } else if ((this.numerator > 0 && this.denominator > 0) || (this.numerator < 0 && this.denominator < 0)) {
            return "Phân số dương";
        } else {
            return "Phân số âm";
        }
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
}
