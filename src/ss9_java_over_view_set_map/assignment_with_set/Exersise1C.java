package ss9_java_over_view_set_map.assignment_with_set;

import java.util.HashSet;

public class Exersise1C {
    public static void main(String[] args) {
        // tìm các phần tử chung trong 2 mảng
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {2, 3, 4, 6, 1, 7};

        // tạo 2 set để lưu trũ các phần tử hai mảng
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        // thêm phần tử mảng 1 vào set 1
        for (int num1 : arr1) {
            set1.add(num1);
        }
        // thêm phần tử mảng 2 vào set 2
        for (int num2 : arr2) {
            set2.add(num2);
        }

        // tạo 1 set mới để lưu trữ các phần tử chung
        HashSet<Integer> set3 = new HashSet<>(set1);

        // giữ lại chỉ các phần tử trong set 2
        set3.retainAll(set2);

        System.out.println("các phần tử chung giữa hai mảng là: ");
        for (int element : set3) {
            System.out.print(element + " ");
        }
    }
}
