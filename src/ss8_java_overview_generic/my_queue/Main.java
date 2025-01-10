package ss8_java_overview_generic.my_queue;

public class Main {
    public static void main(String[] args) {
        My_Queue<Integer> my_queue = new My_Queue<>();

        //thêm phần tử
        my_queue.add(10);
        my_queue.add(20);
        my_queue.add(30);
        my_queue.add(40);

        System.out.println("ngăn xếp " + my_queue.toString());

        //lấy ra xem
        System.out.println("lấy giá trị ra để xem: " + my_queue.peek()); //lấy ra giá trị ở đầu 10

        //lấy ra xem và xóa
        System.out.println("lấy giá trị ra xem và xóa");
        System.out.println("xóa: " + my_queue.poll());
        System.out.println("sau khi xóa: " + my_queue);

        //kiểm tra có rỗng hay không
        System.out.println("Kiểm tra ngăn xếp có trống không: " + my_queue.isEmpty());//false là không trống , trống trống là true

        //kiểm tra số lượng phần tử. ở đây bằng 3 vì đã xóa đi phần tử trước đó
        System.out.println("Số lượng phần tử: " + my_queue.size());
    }
}
