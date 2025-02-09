package ss9_java_over_view_set_map.assignment_with_map;

import java.util.*;

public class Exsercise2B {
    public static void main(String[] args) {
        // kiểm tra tính duy nhất của tên
        List<String> names = Arrays.asList("Dũng", "Thông", "Truyền", "Quang", " Bách", "Tuấn", "Đinh", "Tuấn");

        // tạo 1 map để lưu trữ số lần xuất hiện của từng tên
        Map<String, Integer> nameCount = new HashMap<>();

        //Duyệt qua danh sách tên và đếm số lần xuất hiện
        for (String name : names) {
            // nếu name đã tồn tại trong map, thì tăng giá trị nó lên 1
            // nếu name chưa tồn tại, thì giá trị đếm của nó được đặt thành 1
            nameCount.put(name, nameCount.getOrDefault(name, 0) + 1);
        }

        //Hiện thị tên duy nhất và tên xuất hiện nhiều lần
        System.out.println("Tên duy nhất: ");
        for (String name : nameCount.keySet()) {
            if (nameCount.get(name) == 1) {
                System.out.println(name);
            }
        }

        System.out.println();
        System.out.println("Tên xuất hiện nhiều lần nhất");
        for (String name : nameCount.keySet()) {
            if (nameCount.get(name) > 1) {
                System.out.println(name);
            }
        }
    }
}
