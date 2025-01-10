package ss8_java_overview_generic.my_stack;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack();

        //thêm phần tử
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);

        System.out.println("Ngắn xếp: " + myStack.toString());

        //lấy ra xem
        System.out.println("lấy giá trị ra để xem: " + myStack.peek()); //lấy ra giá trị ở trên cùng 5

        //lấy ra xem và xóa
        System.out.println("lấy giá trị ra xem và xóa");
        System.out.println("xóa: " + myStack.pop());
        System.out.println("sau khi xóa: " + myStack);

        //kiểm tra có rỗng hay không
        System.out.println("Kiểm tra ngăn xếp có trống không: " + myStack.isEmpty());//false là không trống , trống trống là true

        //kiểm tra số lượng phần tử. ở đây bằng 4 vì đã xóa đi phần tử trước đó
        System.out.println("Số lượng phần tử: " + myStack.size());
    }
}
