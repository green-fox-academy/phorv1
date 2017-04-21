import java.io.IOException;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class App {

  public static void main(String[] args) {

    ToDoList toDoList;
    toDoList = new ToDoList();
    toDoList.noArgument(args);
    OptionParser parser = new OptionParser();
    parser.accepts("l");
    parser.accepts("a").withOptionalArg();
    parser.accepts("r").withOptionalArg();
    parser.accepts("c").withOptionalArg();

    OptionSet options = parser.parse(args);

    if (options.has("l")) {
      toDoList.listTasks();
    }

    if (options.hasArgument("a")) {
      toDoList.addTask(options.valueOf("a").toString());
    }

    if (options.hasArgument("r")) {
      toDoList.removeTask(options.valueOf("r").toString());
    }

    if (options.hasArgument("c")) {
      toDoList.checkTask(options.valueOf("c").toString());
    }

  }
}
