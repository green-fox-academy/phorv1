
public class Student {
  String name;
  int age;
  String gender;
  String previousOrganisation;
  int skippedDays;

  public void introduce(){
    System.out.println("Hi, I am " + name + ", a " + age + " year old " + gender + " from " + previousOrganisation
            + " who skipped " + skippedDays + " days from the course already.");
  }

  public void getGoal() {
    System.out.println("Be a junior software developer");
  }

  public void skipDays(int numberOfDays){
    this.skippedDays += numberOfDays;
  }

  public Student() {
    this.name = "Jone Doe";
    this.age = 30;
    this.gender = "female";
    this.previousOrganisation = "The School of Life";
    this.skippedDays = 0;
  }

  public Student(String name, int age, String gender, String previousOrganisation){
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.previousOrganisation = previousOrganisation;
    this.skippedDays = 0;
  }

}
