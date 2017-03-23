import java.util.*;

public class Matchmaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<>(Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));
        ArrayList<String> order = new ArrayList<>();
        int length = girls.size();
        for (int i = 0; i < length; i++) {
            order.add(girls.get(i));
            order.add(boys.get(i));
        }
        System.out.println(order);
    }
}
