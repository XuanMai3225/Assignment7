package assignment7;

import java.util.ArrayList;

public class RemoveanElement {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            numbers.add(i);
        }
        //Xoá số 5 khỏi DS
        numbers.remove(Integer.valueOf(5));
        System.out.println("The list after removal: " +numbers);
    }
}
