import java.util.*;

public class AppendLetter{
    public static void main(String... args){
        ArrayList<String> far = new ArrayList<>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));
        for (int i = 0; i < far.size(); i++) {
            String letter = "a";
            far.set(i, far.get(i) + letter);
        }
        System.out.println(far);
    }
}