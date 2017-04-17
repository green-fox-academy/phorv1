package Zoo;

public class Reptile extends Animal {

  public Reptile(String name) {
    super(name);
  }

  String wantChild() {
    String string = "want a child from an egg";
    return string;
  }

  String getName() {
    return name;
  }

  void move() {
    System.out.println("creep");
  }

  void eat() {
    System.out.println("swallow");
  }

  void greet() {
    System.out.println("hiss");
  }

}
