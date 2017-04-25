import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {

  static String filePath = "src/main/resources/data.csv";
  static String exceptionError = "Something went wrong!";

  private static boolean isFileExists() {
    try {
      File file = new File(filePath);
      if (!file.exists()) {
        return false;
      }
    } catch (Exception e) {
      System.out.println(exceptionError);
    }
    return true;
  }

  static List<String[]> fileReader(String givenFile) {
    List<String[]> lines = new ArrayList<>();
    if (isFileExists()) {
      try {
        CSVReader reader = new CSVReader(new FileReader(givenFile), ';');
        lines = reader.readAll();

      } catch (IOException e) {
        System.out.println("Error during reading the file!" + e.getMessage());

      } catch (Exception e) {
        System.out.println(exceptionError + e.getMessage());
      }
    }
    return lines;
  }

  static void fileWriter(List<String[]> givenFile) {
    try {
      CSVWriter writer = new CSVWriter(new FileWriter(filePath), ';', CSVWriter.NO_QUOTE_CHARACTER);
      writer.writeAll(givenFile);
      writer.close();
    } catch (IOException e) {
      System.out.println("Error during reading the file!" + e.getMessage());
    } catch (Exception e) {
      System.out.println(exceptionError + e.getMessage());
    }
  }

  static void linePrinter(List<String[]> givenLines) {
    for (String[] stringLine : givenLines) {
      for (int i = 0; i < stringLine.length; i++) {
        System.out.println(stringLine[i] + " ");
      }
    }
  }
}

