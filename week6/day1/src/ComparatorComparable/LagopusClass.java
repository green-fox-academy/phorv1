package ComparatorComparable;

import java.util.ArrayList;
import java.util.List;

public class LagopusClass {
  String className;
  List<Student> students;
  List<Mentor> mentors;

  public void addStudent(Student student) {
    students.add(student);
  }

  public void addMentor(Mentor mentor) {
    mentors.add(mentor);
  }

  public void info() {
    System.out.println("Lagopus " + className + " class has " + students.size() + " students and " + mentors.size()
            + " mentors. ");
  }
  public LagopusClass (String className) {
    this.className = className;
    this.students = new ArrayList<>();
    this.mentors = new ArrayList<>();
  }
}

