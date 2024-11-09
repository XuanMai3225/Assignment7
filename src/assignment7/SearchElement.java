package assignment7;

import java.util.ArrayList;

public class SearchElement {
    public static void main(String[] args) {
        ArrayList<String> keywords = new ArrayList<>();
        keywords.add("Java");
        keywords.add("C++");
        keywords.add("Python");
        keywords.add("JavaScript");
        if(keywords.contains("Python")){
            System.out.println("Python in on the list.");
        }else{
            System.out.println("Python not in the list.");
        }
    }
}
