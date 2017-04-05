package SumApp;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {

  @Test
  public void getSumAll() throws Exception {
  ArrayList<Integer> list = new ArrayList<>();
  list.add(2);
  list.add(4);
    Sum listOfIntegers = new Sum();
    assertEquals(6,listOfIntegers.getSumAll(list));
  }
}