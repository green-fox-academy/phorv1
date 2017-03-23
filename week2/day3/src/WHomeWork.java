import java.util.ArrayList;
import java.util.HashMap;

public class WHomeWork {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(90);
        grades.add(85);
        grades.add(70);

        for (int i = 0; i < grades.size(); i++) {
            System.out.printf("grade #%d == %d\n",i, grades.get(i));
        }
        HashMap<String,String> hm = new HashMap<>();
        hm.put("Kati", "Androi");
        hm.put("Patrik", "Apple");
        hm.put("Gabor", "JPEG");
        for (String key: hm.keySet())
            System.out.println(key + ":" + hm.get(key));
        System.out.println();

    }
}
