package GreenFoxApp;

public class Sponsor extends Person {
  String company;
  int hiredStudents;

  public void introduce(){
    System.out.println("Hi, I am " + name + ", a " + age + " year old " + gender + " who represents " + company +
            " and hired " + hiredStudents + " students so far.");
  }

  public void getGoal() {
    System.out.println("Hire brilliant junior software devlopers.");
  }

  public void hire(){
    hiredStudents++;
  }

  public Sponsor() {
    this.company = "Google";
    this.hiredStudents = 0;
  }

  public Sponsor(String name, int age, String gender, String company){
    super(name, age, gender);
    this.company = company;
    this.hiredStudents = 0;
  }
}
