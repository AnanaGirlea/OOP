package lab4.people;

import lab4.database.Database;

import java.util.*;
import java.util.stream.Collectors;

public class Student {
    private String firstName;
    private String lastName;
    private Map<String, Integer> subjects;

    public Student(String firstName, String lastName, Map<String, Integer> subjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjects = subjects;
    }

    // TODO: copy constructor - DONE
    public Student(Student student){
        this.firstName = student.firstName;
        this.lastName = student.lastName;
        this.subjects = student.subjects;
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

    public Map<String, Integer> getSubjects() {
        return subjects;
    }

    public void setSubjects(HashMap<String, Integer> subjects) {
        this.subjects = subjects;
    }

    public double averageGrade() {
        // TODO - DONE
        int sum=0,k=0;
        for (Map.Entry<String, Integer> entry: subjects.entrySet()) {
            sum= sum + entry.getValue();
            k++;
        }
        return sum/k;
    }

    public List<Teacher> getAllTeachers() {
        // TODO - DONE
        Database instance = Database.getDatabase();
        List<Teacher> deepCopy = new ArrayList<>();
        for (var teacher: instance.findAllTeachers()) {
            deepCopy.add(new Teacher(teacher));
        }
        List<Teacher> teachers = Collections.unmodifiableList(deepCopy);
        return teachers;
    }

    public int getGradeForSubject(String subject) {
        // TODO - DONE
        return subjects.get(subject);
    }

    @Override
    public String toString() {
        return "Student: " + firstName + " " + lastName + "\n"
                + "Subjects: " + subjects + "\n";
    }

    public List<Teacher> getTeachersBySubject(String subject) {
        // TODO - DONE
        Database instance = Database.getDatabase();
        List<Teacher> deepCopy = new ArrayList<>();
        for (var teacher: instance.findTeachersBySubject(subject)) {
            deepCopy.add(new Teacher(teacher));
        }
        List<Teacher> teachers = Collections.unmodifiableList(deepCopy);
        return teachers;

    }

    public List<Student> getAllStudents() {
        // TODO - DONE
        Database instance = Database.getDatabase();
        List<Student> deepCopy = new ArrayList<>();
        for (var student: instance.findAllStudents()) {
            deepCopy.add(new Student(student));
        }
        List<Student> studenti = Collections.unmodifiableList(deepCopy);
        return studenti;
    }

    public List<Student> getStudentsBySubject(String subject) {
        // TODO - DONE
        Database instance = Database.getDatabase();
        List<Student> deepCopy = new ArrayList<>();
        for (var student: instance.getStudentsBySubject(subject)) {
            deepCopy.add(new Student(student));
        }
        List<Student> studenti = Collections.unmodifiableList(deepCopy);
        return studenti;
    }

    public List<Student> getStudentsByAverageGrade() {
        // TODO - DONE
        Database instance = Database.getDatabase();
        List<Student> deepCopy = new ArrayList<>();
        for (var student: instance.getStudentsByAverageGrade()) {
            deepCopy.add(new Student(student));
        }
        List<Student> studenti = Collections.unmodifiableList(deepCopy);
        return studenti;
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        // TODO - DONE
        Database instance = Database.getDatabase();
        List<Student> deepCopy = new ArrayList<>();
        for (var student: instance.getStudentsByGradeForSubject(subject)) {
            deepCopy.add(new Student(student));
        }
        List<Student> studenti = Collections.unmodifiableList(deepCopy);
        return studenti;
    }
}
