package Zoo;

public abstract class Animal {

  String name;
  int age;
  String gender;

  abstract String wantChild();

  abstract String getName();

  abstract void move();

  abstract void eat();

  abstract void greet();

  Animal(String name) {
    this.name = name;
  }

}



