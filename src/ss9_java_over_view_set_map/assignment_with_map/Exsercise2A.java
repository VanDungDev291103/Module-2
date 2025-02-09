package ss9_java_over_view_set_map.assignment_with_map;

import java.util.HashMap;
import java.util.Map;

public class Exsercise2A {
    public static void main(String[] args) {
        //đếm số lần xuất hiện của từ trong văn bản
        String text = "đếm số từ trong văn bản đếm";

        // tạo 1 map để lưu trữ số từ và số lần xuất hiện
        Map<String, Integer> wordCount = new HashMap<>();

        // tách chuỗi thành các từ bằng khoảng trắng
        String[] words = text.split(" ");

        //Duyệt qua từng từ và tăng số lần xuất hiện trong map
        for (String word : words) {
            //chuyển các từ thành chữ thường để k phân biệt chữ hoa hay thường
            word = word.toLowerCase();

            // kiểm tra xem từ có trong map chưa
            if (wordCount.containsKey(word)) {
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        // hiện thị số lần xuất hiện của từng từ
        for (String word : wordCount.keySet()) {
            int count = wordCount.get(word);
            System.out.println(word + " : " + count);
        }


    }
}
