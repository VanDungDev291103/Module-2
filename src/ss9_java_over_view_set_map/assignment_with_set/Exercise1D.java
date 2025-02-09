package ss9_java_over_view_set_map.assignment_with_set;

import java.util.TreeSet;

public class Exercise1D {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 4, 5, 8, 10};

        TreeSet<Integer> set = new TreeSet<>();

        for (int num : arr) {
            set.add(num);
        }

        int min = set.first(); // lấy phần tử nhỏ nhất
        int max = set.last(); // lấy phần tử lớn nhất

        System.out.println("phần tử nhỏ nhất: " + min);
        System.out.println("Phần tử lớn nhất: " + max);
    }
}
