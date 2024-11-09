package assignment7;

import java.util.ArrayList;

public class CreateandAddElements {
    public static void main(String[] args) {
        ArrayList<String> names =new ArrayList<>();
        names.add("Xuan Mai");
        names.add("Dong Hy");
        names.add("Nhung");
        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }
    }
}
