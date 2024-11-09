package assignment7;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(8);
        numbers.add(3);
        numbers.add(5);
        //Sắp xếp danh sách
        Collections.sort(numbers);
        System.out.println("List after sorting: " +numbers);
    }
}
