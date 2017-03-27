import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
            for (Entry x : keyMap.entrySet()) {
                System.out.println(x.getKey() + "|" + x.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}