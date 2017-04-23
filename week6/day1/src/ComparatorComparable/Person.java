package ComparatorComparable;

public class Person {
  String name;
  int age;
  String gender;

  public void introduce(){
    System.out.println("Hi, I am " + name + ", a " + age + " year old " + gender);
  }

  public void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }

  public Person() {
    this.name = "Jone Doe";
    this.age = 30;
    this.gender = "female";
  }

  public Person(String name, int age, String gender){
    this.name = name;
    this.age = age;
    this.gender = gender;
  }
}
