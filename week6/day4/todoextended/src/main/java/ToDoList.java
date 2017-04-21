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
  String errorNoIndex = "System error: No index is provided!";
  String errorOutIndex = "System error: Index is out of list size!";
  String errorNotNumber = "System error: Index is not a number!";
  String updatedList = "Here is your new list:";
  String usage = "src/main/java/usage.txt";
  String taskFile = "src/main/java/tasks.txt";

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
      list.remove(Integer.parseInt(taskToRemove));
      Files.write(tasksFilePath, list);

      System.out.println(updatedList);
      listTasks();
      System.out.println();
    } catch (Exception e) {
      System.out.println(errorNotNumber);
    }
  }

  public void checkTask(String[] args) {
    tasksFilePath = Paths.get(taskFile);
    String chosenTask;
    try {
      list = Files.readAllLines(tasksFilePath);
      if (args.length == 1) {
        System.out.println(errorNoIndex);
      } else if (Integer.parseInt(args[1]) > list.size()) {
        System.out.println(errorOutIndex);
      } else {
        chosenTask = list.get(Integer.parseInt(args[1]) - 1);
        String newString = chosenTask.replaceFirst(" ", "x");
        list.set((Integer.parseInt(args[1]) - 1), newString);
        Files.write(tasksFilePath, list);
      }
      System.out.println(updatedList);
      listTasks();
      System.out.println();
    } catch (Exception e) {
      System.out.println(errorNotNumber);
    }
  }
}

