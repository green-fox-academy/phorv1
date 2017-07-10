package com.company;

public class Main {

  public static void main(String[] args) {
    int[] list = {1, 2, 3, 4, 5};
    int[] resultArray = shiftTheArray(list, 2);
    printArray(resultArray);
  }

  public static int[] shiftTheArray(int[] givenArray, int givenNumber) {

    for (int i = 0; i < givenNumber; i++) {
      for (int j = givenArray.length - 1; j > 0; j--) {
        int temp = givenArray[j];
        givenArray[j] = givenArray[j - 1];
        givenArray[j - 1] = temp;
      }
    }
      return givenArray;
  }

  private static void printArray(int[] anArray) {
    for (int i = 0; i < anArray.length; i++) {
      if (i > 0) {
        System.out.print(", ");
      }
      System.out.print(anArray[i]);
    }
  }
}