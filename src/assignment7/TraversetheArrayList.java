package assignment7;

import java.util.ArrayList;

public class TraversetheArrayList {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("1. Da Nang");
        cities.add("2. Hai Phong");
        cities.add("3. Hoi An");
        cities.add("4. Da Lat");
        cities.add("5. Vung Tau");
        for(int i = 0; i < cities.size(); i++){
            System.out.println(cities.get(i));
        }
    }
}
