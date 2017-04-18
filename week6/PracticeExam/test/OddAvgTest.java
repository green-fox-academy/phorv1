import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;


class OddAvgTest {

  @Test
  void oddAverageTest() {
    List<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(3);
    list.add(4);
    assertEquals(3, OddAvg.oddAverage(list));
  }

  @Test
  void oddAverageTest_OnlyOdd() {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(3);
    list.add(5);
    list.add(7);
    assertEquals(4, OddAvg.oddAverage(list));
  }

  @Test
  void oddAverageTest_OnlyEven() {
    List<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(2);
    list.add(4);
    list.add(6);
    assertEquals(0, OddAvg.oddAverage(list));
  }
}

