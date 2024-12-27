package ss1_java_overview.fractionprocess;

public class FractionProcess {
    public static void main(String[] args) {
        System.out.println("=========================== Nhập thông tin ===========================");

        System.out.println("Phân số 1");
        Fraction fraction1 = new Fraction();
        fraction1.inputFraction();
        fraction1.outputFraction();

        System.out.println();
        System.out.println("\nPhân số 2");
        Fraction fraction2 = new Fraction();
        fraction2.inputFraction();
        fraction2.outputFraction();

        System.out.println();
        Fraction sumTwoFraction = fraction1.sum(fraction2);// cộng
        Fraction subtractTwoFraction = fraction1.subtract(fraction2);// trừ
        Fraction multiplyTwoFraction = fraction1.multiply(fraction2);// nhân
        Fraction divideTwoFraction = fraction1.divide(fraction2);// chia
        System.out.println("\nCộng 2 phân số là: ");
        sumTwoFraction.outputFraction();

        System.out.println("\nTrừ 2 phân số là: ");
        subtractTwoFraction.outputFraction();

        System.out.println("\nNhân 2 phân số là: ");
        multiplyTwoFraction.outputFraction();

        System.out.println("\nchia 2 phân số là: ");
        divideTwoFraction.outputFraction();

    }
}
