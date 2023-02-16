package lab4.people;

import lab4.database.Database;

import java.util.Collections;
import java.util.List;

public class Teacher {
    private String firstName;
    private String lastName;
    private List<String> subjects;

    public Teacher(String firstName, String lastName, List<String> subjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjects = subjects;
    }

    // TODO: copy constructor - DONE
    public Teacher(Teacher teacher){
        this.firstName = teacher.firstName;
        this.lastName = teacher.lastName;
        this.subjects = teacher.subjects;
    }

    @Override
    public String toString() {
        return "Teacher: " + firstName + " " + lastName + "\n"
                + "Subjects: " + subjects + "\n";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public List<Teacher> getAllTeachers() {
        // TODO - DONE
        Database instance = Database.getDatabase();
        List<Teacher> profesori = instance.findAllTeachers();
        return profesori;
    }

    public List<Teacher> getTeachersBySubject(String subject) {
        // TODO - DONE
        Database instance = Database.getDatabase();
        List<Teacher> profesori = instance.findTeachersBySubject(subject);
        return profesori;
    }

    public List<Student> getAllStudents() {
        // TODO - DONE
        Database instance = Database.getDatabase();
        List<Student> studenti = instance.findAllStudents();
        return studenti;
    }

    public List<Student> getStudentsBySubject(String subject) {
        // TODO - DONE
        Database instance = Database.getDatabase();
        List<Student> studenti = instance.getStudentsBySubject(subject);
        return studenti;
    }

    public List<Student> getStudentsByAverageGrade() {
        // TODO - DONE
        Database instance = Database.getDatabase();
        List<Student> studenti = instance.getStudentsByAverageGrade();
        return studenti;
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        // TODO - DONE
        Database instance = Database.getDatabase();
        List<Student> studenti = instance.getStudentsByGradeForSubject(subject);
        return studenti;
    }
}
