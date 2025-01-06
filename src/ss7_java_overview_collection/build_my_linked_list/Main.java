package ss7_java_overview_collection.build_my_linked_list;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();

        //a. thêm vào đầu
        myLinkedList.addFirst(10);
        myLinkedList.addFirst(20);
        myLinkedList.addFirst(30);
        myLinkedList.addFirst(40);
        myLinkedList.addFirst(50);

        //b.toString
        System.out.println("Các phần tử: " + myLinkedList.toString());

        //c. Theem phần tử vào cuối
        myLinkedList.addLast(30);
        myLinkedList.addLast(50);

        //d. thêm phần tử vào vị trí
        myLinkedList.add(3, 30);
        System.out.println("Danh sách sau khi thêm phần tử: " + myLinkedList.toString());

        //e. xóa phần tử đầu
        myLinkedList.removeFirst();
        System.out.println("Danh sách sau khi xóa phần tử đầu tiền: " + myLinkedList.toString());

        //f. xóa phần tử cuối
        myLinkedList.removeLast();
        System.out.println("Danh sách sau khi xóa phần tử cuối cùng: " + myLinkedList.toString());

        //g. remove(int index)
        myLinkedList.remove(4);
        System.out.println("Danh sách sau khi xóa phần tử ở vị trí thứ 4: " + myLinkedList.toString());

        //h. getFirst()
        Integer firstElement = myLinkedList.getFirst();
        System.out.println("Phần tử đầu tiên trong danh sách: " + firstElement);

        //i.getLast()
        Integer lastElement = myLinkedList.getLast();
        System.out.println("Phần tử cuối cùng trong danh sách: " + lastElement);

        //j. get(int index)
        Integer elementAtIndex = myLinkedList.get(3);
        System.out.println("Phần tử thứ 3 trong danh sách: " + elementAtIndex);

        //k. set(int index , int element)
        myLinkedList.set(2, 22);
        System.out.println("Danh sách sau khi thay đổi phần tử thứ 3 thành 11: " + myLinkedList.toString());

        //l. indexOf(int element)
        Integer indexOfElement = myLinkedList.indexOf(10);
        System.out.println("Vị trí index của phần tử 10 là: " + indexOfElement);

        //m. lastIndexOf(int element)
        Integer lastIndexOfElement = myLinkedList.lastIndexOf(20);
        System.out.println("Vị trí index cuối cùng của phần tử 20 là: " + lastIndexOfElement);
    }
    }
}
