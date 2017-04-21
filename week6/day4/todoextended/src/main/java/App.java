import java.io.IOException;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class App {

  public static void main(String[] args) {

    ToDoList toDoList;
    toDoList = new ToDoList();

    OptionParser parser = new OptionParser();
    parser.accepts("l"); //you don't need "-" is not a legal option character
    parser.accepts("a").withOptionalArg();
    parser.accepts("r").withOptionalArg();
    parser.accepts("c").withOptionalArg();

    OptionSet options = parser.parse(args);

    if (options.hasArgument("a")) {
      toDoList.AddTask(options.valueOf("a").toString());
    } else {
      System.out.println("System error: Argument is required after '-a'");
    }

    if (options.has("l")) {
      System.out.println("`-l` was given with the no additional information.");
    }

    if (options.has("l")) {
      System.out.println("`-l` was given with the no additional information.");
    }

    if (options.has("l")) {
      System.out.println("`-l` was given with the no additional information.");
    }


  }
}
