package ss7_java_overview_collection.build_my_linked_list;

public class MyLinkedList {
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    private Node head;
    private Node tail;

    private int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    //b. toString()
    public String toString() {
        StringBuilder str = new StringBuilder();
        Node temp = head;
        for (int i = 0; i < size; i++) {
            str.append(temp.data).append(" ");
            temp = temp.next;
        }
        return str.toString();
    }

    //c. addLast(int element)
    public void addLast(int data) {
        if(head == null){
            addFirst(data);
        }else {
            Node newNode = new Node(data);
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    //d. add(int index, int element)
    public void add(int index, int element) {
        if (index < 0 || index > size) {
            System.out.println("index ngoai vung");
        } else if (index == 0) {
            addFirst(element);
        } else {
            Node temp = head;
            for (int i = 1; i < size; i++) {
                temp = temp.next;
            }
            Node newNode = new Node(element);
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }

    //e. removeFirst()
    public Integer removeFirst() {
        if (head == null) {
            return null;
        }
        Node temp = head;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            head = temp.next;
        }
        size--;
        return temp.data;
    }

    //f. removeLast()
    public Integer removeLast() {
        if (head == null) {
            return null;
        }
        Node temp = head;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            for (int i = 2; i < size; i++) {
                temp = temp.next;
            }
            tail = temp;
            temp = temp.next;
            tail.next = null;

        }
        size--;
        return temp.data;
    }

    //g. remove(int index)
    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("index ngoai vung");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }

    //h. getFirst()
    public Integer getFirst() {
        if (head == null) {
            return null;
        }
        return head.data;
    }

    //i.getLast()
    public Integer getLast() {
        if (head == null) {
            return null;
        }
        return tail.data;
    }

    //j. get(int index)
    public Integer get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("index ngoai vung");
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    //k. set(int index , int element)
    public void set(int index, int element) {
        if (index < 0 || index >= size) {
            System.out.println("index ngoai vung");
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.data = element;
        }
    }

    //l. indexOf(int element)
    public Integer indexOf(int element) {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.data == element) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    //m. lastIndexOf(int element)
    public Integer lastIndexOf(int element) {
        int lastIndex = -1;
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.data == element) {
                lastIndex = i;
            }
            temp = temp.next;
        }
        return lastIndex;
    }

}
