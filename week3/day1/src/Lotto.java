import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lotto {

    public static void main(String[] args) {
        Path numbers = Paths.get("assets/otos.csv");
            int pieces = 0;

        try {
            List<String> text = Files.readAllLines(numbers);
            Map<String, Integer> keyMap = new HashMap<>();

            for (String line : text){
                String[] column = line.split(";");

                for (int i = column.length-5; i < column.length; i++) {
                keyMap.put(column [i], pieces);
                int numbersAppers = pieces ++;
                    if (keyMap.containsKey(column[i])) {
                        keyMap.put(column[i], numbersAppers);
                    }
                    System.out.println(column[i] + "|" + numbersAppers);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}