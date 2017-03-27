import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.Map.Entry;

public class Lotto {

    public static void main(String[] args) {
        Path numbers = Paths.get("assets/otos.csv");

        try {
            List<String> text = Files.readAllLines(numbers);
            Map<String, Integer> keyMap = new HashMap<>();

            for (String line : text){
                String[] column = line.split(";");

                for (int i = column.length-5; i < column.length; i++) {
                    if (keyMap.containsKey(column[i])) {
                        keyMap.put(column[i], keyMap.get(column[i]) + 1);
                    } else {
                        keyMap.put(column[i], 0);
                    }
                }
            }

            Set<Entry<String, Integer>> set = keyMap.entrySet();
            List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(
                    set);
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                    return o2.getValue().compareTo(o1.getValue());
                }
            });
            for (Entry<String, Integer> entry : list) {
                if (entry.getValue() >= 192) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}