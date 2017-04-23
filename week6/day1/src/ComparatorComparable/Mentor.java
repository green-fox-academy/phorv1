package ComparatorComparable;

public class Mentor extends Person implements Comparable {
  String level;

  public void introduce(){
    System.out.println("Hi, I am " + name + ", a " + age + " year old " + gender + " " +level + " mentor");
  }

  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

    public Mentor() {
      this.level = "intermediate";
    }

  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }

  @Override
  public int compareTo(Object o) {
    return 0;
  }
}
