package Zoo;

public class Bird extends Animal {


  Bird(String name) {
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
    System.out.println("flapping wings");
  }

  void eat() {
    System.out.println("peck");
  }

  void greet() {
    System.out.println("sing");
  }
}

