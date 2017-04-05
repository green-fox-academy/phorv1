package SumApp;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {

  List<Integer> list = new ArrayList<>();
  Sum listOfIntegers = new Sum();

  @Test
  public void sumAll1() throws Exception {
    list.add(2);
    list.add(4);
    assertEquals(6, listOfIntegers.getSumAll(list));
  }

  @Test
  public void emptyList() throws Exception {
    assertEquals(0, listOfIntegers.getSumAll(list));
  }

  @Test
  public void listWithOne() throws Exception {
    list.add(34);
    assertEquals(34, listOfIntegers.getSumAll(list));
  }

  @Test
  public void listWithMultiple() throws Exception {
    list.add(34);
    list.add(56);
    list.add(2);
    assertEquals(92, listOfIntegers.getSumAll(list));
  }

  @Test
  public void withNull() throws Exception {
    list = null;
    assertEquals(null, list);
  }
}