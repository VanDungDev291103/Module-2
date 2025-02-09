package ss9_java_over_view_set_map.assignment_with_set;

import java.util.HashSet;

public class Exercise1B {
    public static void main(String[] args) {
        //Tính tổng của các phần tử trùng lặp
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 7, 3, 5};

        // tạo 1 set để lưu trữ các phần tử duy nhất
        HashSet<Integer> uniqueSet = new HashSet<>();
        int sum = 0;

        // tính tổng các phần tử không trùng lặp và đồng thời thêm các phần tử vào set
        for (int num : arr) {
            if (!uniqueSet.contains(num)) {
                uniqueSet.add(num);
                sum += num;
            }
        }

        System.out.println("Tổng các phần tử không trùng lặp là: " + sum);

    }
}
