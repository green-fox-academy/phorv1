package ComparatorComparable;

public class Mentor extends Person implements Comparable {

  Level level;

  enum Level {BEGINNER(1), INTERMEDIATE(2), SENIOR(3);

    int value;

    Level(int value) {
      this.value = value;
    }

    @Override
    public String toString() {
      String constantName = super.toString();
      return constantName.toLowerCase();
    }
  }

  public void introduce() {
    System.out.println(
            "Hi, I am " + name + ", a " + age + " year old " + gender + " " + level + " mentor");
  }

  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  public Mentor() {
    level = Level.INTERMEDIATE;
  }

  public Mentor(String name, int age, String gender, Level level) {
    super(name, age, gender);
    this.level = level;
  }

  @Override
  public int compareTo(Object mentor) {
    if (mentor instanceof Mentor) {
      int x = level.value;
      int y = ((Mentor) mentor).level.value;
      return (x < y) ? -1 : ((x == y) ? 0 : 1);
    } else {
      return -999;
    }
  }
}
