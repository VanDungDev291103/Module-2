package ss7_java_overview_collection.build_array_list;

import java.util.Arrays;

public class MyArrayList {
    private int capacity;
    private int size;
    private int[] array;

    private int[] emptyArray = {};

    public int size() {
        return size;
    }

    public MyArrayList() {
        array = emptyArray;
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        this.array = new int[this.capacity];
    }

    //a. add
    public void add(int element) {
        if (array == emptyArray) {
            this.capacity = 10;
            this.array = new int[this.capacity];
        }
        if (size == capacity) {
            this.capacity *= 1.5;
            if (size == capacity) {
                capacity++;
            }

            // tạo mảng mới
            int[] Array2 = new int[this.capacity];

            //copy elemt qua
            for (int i = 0; i < size; i++) {
                Array2[i] = array[i];
            }

            //cho tham chiếu tới vùng nhớ mới
            array = Array2;
        }
        array[size] = element;
        size++;
    }

    //b. to String

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < size; i++) {
            str.append(array[i]).append("\t");
        }
        return str.toString();
    }

    //c. thêm phần tử vào vị trí index
    public void add(int index, int element) {
        if (index < 0 || index > size) {
            System.out.println("Index ngoai pham vi !!!");
            return;
        }
        if (size == this.capacity) {
            this.capacity *= 1.5;
            if (size == this.capacity) {
                capacity++;
            }

            int[] array2 = new int[this.capacity];

            for (int i = 0; i < index; i++) {
                array2[i] = array[i];
            }

            array2[index] = element;

            for (int i = index; i < size; i++) {
                array2[i + 1] = array[i];
            }

            array = array2;
        } else {
            for (int i = size; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = element;
        }
        size++;
    }

    //d. set(int index , int element)
    public void set(int index, int element) {
        if (index < 0 || index >= size) {
            System.out.println("Index ngoai pham vi !!!");
            return;
        }
        array[index] = element;
    }

    //e. get(int index)
    public Integer get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index ngoai pham vi !!!");
            return null;
        }
        return array[index];
    }

    //f. indexOf(int element)
    public int indexOf(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    //g. lastIndexOf(int element)
    public int lastIndexOf(int element) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    //h. remove(int index)
    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index ngoai pham vi !!!");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    //i. removeElement (int element)
    public void removeElement(int element) {
        int newIndex = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] != element) {
                array[newIndex] = array[i];
                newIndex++;
            }
        }
        size = newIndex;
    }
}
