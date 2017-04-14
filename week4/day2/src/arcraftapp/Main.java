package arcraftapp;

public class Main {

  public static void main(String[] args) {

    Aircraft myf16 = new F16();
    myf16.fight();
    Aircraft myf35 = new F35();
    myf35.fight();
    System.out.println(myf16.getStatus());
  }

}

