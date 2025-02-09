package test;

import java.util.Stack;

public class main {
    static int a;
    public static void main(String[] args) {
        //int a; nếu lag giá trij cục bộ thì phải tạo giá trị cho biến
//        System.out.println(a);
        char[] asciiArray = new char[256];

        Stack<String> stack = new Stack<>();
        String name = "hello";
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            stack.push(String.valueOf(c));
        }
        System.out.println(stack);
    }
}