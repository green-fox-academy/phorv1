import java.util.Arrays;

public class Colors {
    public static void main(String[] argc) {
            String[][] colors = {
                    {"lime", "forest green", "olive", "pale green","spring green" },
                    {"orange red", "red", "tomato"},
                    {"orchid", "violet", "pink", "hot pink"},
            };
            for (int i = 0; i < colors.length; i++){
                System.out.println(Arrays.toString(colors[i]));
            }



    }
 }