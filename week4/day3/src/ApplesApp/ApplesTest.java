package ApplesApp;

import static org.junit.Assert.*;
import org.junit.Test;

public class ApplesTest {
  @Test
  public void getApple() throws Exception {
    Apples apple = new Apples("green apple");
    assertEquals("green apple", apple.getApple());
  }

}