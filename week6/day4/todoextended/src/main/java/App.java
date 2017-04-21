import java.io.IOException;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class App {

  public static void main(String[] args) {

    ToDoList toDoList;
    toDoList = new ToDoList();

    OptionParser parser = new OptionParser();
    parser.accepts("l");
    parser.accepts("a").withOptionalArg();
    parser.accepts("r").withOptionalArg();
    parser.accepts("c").withOptionalArg();

    OptionSet options = parser.parse(args);

    if (options.nonOptionArguments().isEmpty()) {
      toDoList.NoArgument();
    }

    if (options.hasArgument("a")) {
      toDoList.AddTask(options.valueOf("a").toString());
    }

    if (options.hasArgument("r")) {
      toDoList.RemoveTask(options.valueOf("r").toString());
    }

    if (options.has("l")) {
      System.out.println("`-l` was given with the no additional information.");
    }


  }
}
