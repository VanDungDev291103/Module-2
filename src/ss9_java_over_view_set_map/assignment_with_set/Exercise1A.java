package ss9_java_over_view_set_map.assignment_with_set;

import java.util.HashSet;
import java.util.Set;

public class Exercise1A {
    //loại bỏ các phần tử trùng lặp
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 7};

        int[] uniqueArray = removeDuplicates(arr);

        //hiện thị danh sách phần tử duy nhất
        System.out.println("Phần tử duy nhất");
        for (int num : uniqueArray) {
            System.out.println(num);
        }
    }

    static int[] removeDuplicates(int[] arr) {
        //chuyển mảng thành set để loại bỏ phần tử trùng lặp
        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : arr) {
            uniqueSet.add(num);
        }

        // chuyển lại từ set thành mảng
        int[] uniqueArray = new int[uniqueSet.size()];
        int index = 0;
        for (int num : uniqueSet) {
            uniqueArray[index] = num;
            index++;
        }

        return uniqueArray;
    }
}
