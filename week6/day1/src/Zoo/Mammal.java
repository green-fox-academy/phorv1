package Zoo;

public class Mammal extends Animal {

  public Mammal(String name) {
    super(name);
  }

  String wantChild() {
    String string = "want a child from my uterus";
    return string;
  }

  String getName() {
    return name;
  }

  void move() {
    System.out.println("with four legs");
  }

  void eat() {
    System.out.println("chew");
  }

  void greet() {
    System.out.println("roar");
  }

}
