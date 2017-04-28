import au.com.bytecode.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {


  static String exceptionError = "Something went wrong!";

  static List<String[]> fileReader(String givenFile) {
    List<String[]> lines = new ArrayList<>();
      try {
        CSVReader reader = new CSVReader(new FileReader(givenFile), ';');
        lines = reader.readAll();
      } catch (IOException e) {
        System.out.println("Error during reading the file!" + e.getMessage());
      } catch (Exception e) {
        System.out.println(exceptionError + e.getMessage());
    }
    return lines;
  }
}

