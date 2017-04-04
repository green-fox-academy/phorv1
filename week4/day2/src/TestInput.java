import java.util.ArrayList;

public class TestInput {
  public static void main(String[] args) {
    ArrayList<Person> people = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Mentor> mentros = new ArrayList<>();

    Person mark = new Person("Mark", 46, "male");
    people.add(mark);
    Person jane = new Person();
    people.add(jane);
    Student john = new Student("John Doe", 20, "male", "BME");
    students.add(john);
    Student student = new Student();
    students.add(student);
    Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
    mentros.add(gandhi);
    Mentor mentor = new Mentor();
    mentros.add(mentor);
    Sponsor sponsor = new Sponsor();
    Sponsor elon = new Sponsor("Elon Musk", 46, "male", "SpaceX");

    student.skipDays(3);

    for (int i = 0; i < 5; i++) {
      elon.hire();
    }
    for (int i = 0; i < 3; i++) {
      sponsor.hire();
    }

    for(Person person : people) {
      person.introduce();
      person.getGoal();
    }
    for(Student currentStudent : students) {
      currentStudent.introduce();
      currentStudent.getGoal();
    }
    for(Mentor currentMentor : mentros) {
      currentMentor.introduce();
      currentMentor.getGoal();
    }
    sponsor.introduce();
    sponsor.getGoal();
    elon.introduce();
    elon.getGoal();

    LagopusClass badass = new LagopusClass("BADA55");
    badass.addStudent(student);
    badass.addStudent(john);
    badass.addMentor(mentor);
    badass.addMentor(gandhi);
    badass.info();

  }
}