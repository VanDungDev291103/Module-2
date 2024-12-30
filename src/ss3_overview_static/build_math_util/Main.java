package ss3_overview_static.build_math_util;

public class Main {
    public static void main(String[] args) {
        // xây dựng lớp tiện ích MathUti
        double n1 = 5;
        double n2 = 4;

        double sum = MathUtil.add(n1,n2);
        System.out.println("Tổng: " + sum);

        double difference = MathUtil.substract(n1,n2);
        System.out.println("Hiệu: " + difference);

        double product = MathUtil.multiply(n1,n2);
        System.out.println("Tích: " + product);

        double quotient = MathUtil.divide(n1,n2);
        System.out.println("Thương: " + quotient);

    }
}
