package ss7_java_overview_collection.build_array_list;

public class Main {
    public static void main(String[] args) {
        MyArrayList myArrList = new MyArrayList();

        //a. add
        myArrList.add(10);
        myArrList.add(20);
        myArrList.add(30);
        myArrList.add(40);
        myArrList.add(50);
        myArrList.add(10);
        myArrList.add(20);

        //b. ToString
        System.out.println("Danh sách ban đầu: " + myArrList.toString());

        //c. add(int index , int element)
        myArrList.add(3, 33);
        System.out.println("Danh sách sau khi thay thế: " + myArrList.toString());

        //d. set(int index , int element)
        myArrList.set(5, 33);
        System.out.println("Danh sách sau khi thay thế: " + myArrList.toString());

        //e. get(int index)
        int elementAtIndex = myArrList.get(4);
        System.out.println("Phần tử tại vị trí thứ 4 là: " + elementAtIndex);

        //f. indexOf(int element)
        int elementToFind = 30;
        int indexToFind = myArrList.indexOf(elementToFind);
        if (indexToFind != -1) {
            System.out.println("Vị trí index của phần tử " + elementToFind + " là: " + indexToFind);
        } else {
            System.out.println("Không tìm thấy phần từ: " + elementToFind + " trong danh sách");
        }

        //g. lastIndexOf(int element)
        int LastIndexOfElement = myArrList.lastIndexOf(elementToFind);
        if (LastIndexOfElement != -1) {
            System.out.println("Vị trí index của phần tử " + elementToFind + " là: " + LastIndexOfElement);
        } else {
            System.out.println("Không tìm thấy phần từ: " + elementToFind + " trong danh sách");
        }

        //h. remove(int index)
        myArrList.remove(1);
        System.out.println("Danh sách sau khi xóa ở vị trí thứ 1: " + myArrList.toString());

        //i. removeElement (int element)
        myArrList.removeElement(10);
        System.out.println("Danh sách sau khi xóa tất cả các phần tử có giá trị 10: " + myArrList.toString());

    }
    }
}
