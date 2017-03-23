import java.util.*;

public class QuoteSwap{
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do",
                "create,", "I", "cannot", "not", "understand."));
        String change = "cannot";
        list.set(5, list.get(2));
        list.set(2, change);
        for (String i : list) {
            System.out.print(i + " ");
        }
    }
}