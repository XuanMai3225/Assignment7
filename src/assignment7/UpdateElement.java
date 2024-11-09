package assignment7;

import java.util.ArrayList;

public class UpdateElement {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 1; i <= 5; i++){
            numbers.add(i);
        }
        //Sử dụng phương thức set() với chỉ số 2 (phần tử thứ 3, vì chỉ số bắt đầu từ 0)
        numbers.set(2, 100);
        System.out.println("List after update: " +numbers);
    }
}
