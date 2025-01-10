package ss8_java_overview_generic.my_stack;

import review_oop.book_management.NewBook;

public class MyStack<E> {
    private class Node {
        private E data;
        private Node next;

        public Node(E data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    private int size;

    //a. push() : thêm vào
    public void push(E data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    //b. peek: lấy ra xem nhưng không xóa
    public E peek() {
        if(head == null) {
            return null;
        }
        return head.data;
    }

    //c. pop() : lu ra xem và xóa
    public E pop() {
        if(head == null) {
            return null;
        }

        Node temp = head;
        if(size == 1){
            head = null;
            tail = null;
        }else{
            head = head.next;
        }
        size--;
        return temp.data;
    }

    //d. isEmpty(): Kiểm tra rỗng hay không
    public boolean isEmpty() {
        return size == 0;
    }

    //e. size() : trả về số lương phần tử
    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        for (int i = 0; i < size; i++) {
            sb.append(temp.data).append(" ");
            temp = temp.next;
        }
        return sb.toString();
    }
}
