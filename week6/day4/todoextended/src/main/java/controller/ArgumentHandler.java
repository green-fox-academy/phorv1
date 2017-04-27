package controller;

import datasource.TodoDataAccessObject;
import entity.Todo;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

public class ArgumentHandler {

  public void executeCommands(String[] args) {

    TodoDataAccessObject dao = new TodoDataAccessObject("example.csv");
    List<Todo> testTodoList = new ArrayList<>();
    for (int i = 1; i < 100; i++) {
      testTodoList.add(new Todo(i, ZonedDateTime.now(), null,
              "example" + i));
    }
    dao.saveAll(testTodoList);

    OptionSet options = parseArguments(args);
    TodoController todoController = new TodoController();

    if (args == null || args.length == 0) {
      todoController.printUsageInfo();
      return;
    }

    if (options.has("l")) {
      todoController.listAllTodos();
    }
  }

  private OptionSet parseArguments(String[] args) {
    OptionParser parser = new OptionParser();

    parser.accepts("l");
    parser.accepts("a").withOptionalArg();
    parser.accepts("r").withOptionalArg();
    parser.accepts("c").withOptionalArg();
    parser.accepts("u").withOptionalArg();

    return parser.parse(args);
  }
}