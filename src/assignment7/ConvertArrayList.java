package assignment7;

import java.util.ArrayList;

public class ConvertArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);
        //Sử dụng phương thức toArray()chuyển đổi ArrayList thành Smảng. Truyền vào new Integer[0] để xác định kiểu của mảng đầu ra.
        Integer[] array = numbers.toArray(new Integer[0]);
        System.out.println("Element of conversion array: " +numbers);
        for(Integer num : array){
            System.out.println(num);
        }
    }
}
