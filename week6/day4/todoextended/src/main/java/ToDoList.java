import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import joptsimple.OptionSpec;

public class ToDoList {

  Path tasksFilePath;
  Path usageFile;
  List<String> list;
  String error = "System error: Something went wrong!";
  String updatedList = "Here is your new list:";
  String usage = "src/main/resources/usage.txt";
  String taskFile = "src/main/resources/tasks.txt";

  public void noArgument(String[] args) {
    try {
      usageFile = Paths.get(usage);
      List<String> noArgument = Files.readAllLines(usageFile);
      if (args.length == 0) {
        for (int i = 0; i < noArgument.size(); i++) {
          System.out.println(noArgument.get(i));
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void listTasks() {
    try {
      tasksFilePath = Paths.get(taskFile);
      List<String> orderedList = Files.readAllLines(tasksFilePath);
      if (orderedList.size() == 0) {
        System.out.println("Nothing to do today! :)");
      } else {
        for (int i = 0; i < orderedList.size(); i++) {
          if (i < 9) {
            System.out.println(" " + (i + 1) + " - " + orderedList.get(i));
          } else {
            System.out.println(i + 1 + " - " + orderedList.get(i));
          }
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void addTask(String taskToAdd) {
    tasksFilePath = Paths.get(taskFile);
    try {
      list = Files.readAllLines(tasksFilePath);
      list.add(list.size(), "[ ]" + taskToAdd);
      Files.write(tasksFilePath, list);
      System.out.println("Here is your new list:");
      listTasks();
      System.out.println();
    } catch (Exception e) {
    }
  }

  public void removeTask(String taskToRemove) {
    tasksFilePath = Paths.get(taskFile);
    try {
      list = Files.readAllLines(tasksFilePath);
      list.remove(Integer.parseInt(taskToRemove) - 1);
      Files.write(tasksFilePath, list);
      System.out.println(updatedList);
      listTasks();
      System.out.println();
    } catch (Exception e) {
      System.out.println(error);
    }
  }

  public void checkTask(String taskToCheck) {
    tasksFilePath = Paths.get(taskFile);
    String chosenTask;
    try {
      list = Files.readAllLines(tasksFilePath);
      chosenTask = list.get(Integer.parseInt(taskToCheck) - 1);
      String newString = chosenTask.replaceFirst(" ", "x");
      list.set((Integer.parseInt(taskToCheck) -1 ), newString);
      Files.write(tasksFilePath, list);

      System.out.println(updatedList);
      listTasks();
      System.out.println();
    } catch (Exception e) {
      System.out.println(error);
    }
  }
}

