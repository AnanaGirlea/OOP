package lab4.database;

import lab4.people.Student;
import lab4.people.Teacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Database {
    private List<Student> students = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();

    // TODO: make it Singleton - DONE
    private static Database instance = null;
    private Database() {
        instanceCount++;
    }
    public static Database getDatabase() {
        if (instance == null)
            instance = new Database();
        return instance;
    }

    private static int instanceCount = 0;
    public static int getNumberOfInstances() {
        // TODO - DONE
        return instanceCount;
    }

    public void addTeachers(List<Teacher> teachers) {
        this.teachers.addAll(teachers);
    }

    public void addStudents(List<Student> students) {
        this.students.addAll(students);
    }

    public List<Teacher> findTeachersBySubject(String subject) {
        // TODO - DONE
        int i;
        List<Teacher> profesori = new ArrayList<>();
        for(i=0; i< teachers.size(); i++){
            for (String entry: teachers.get(i).getSubjects()){
                if(entry ==subject)
                    profesori.add(teachers.get(i));
            }
        }
        return profesori;
    }

    public List<Student> findAllStudents() {
        // TODO - DONE
        return students;
    }

    public List<Teacher> findAllTeachers() {
        // TODO - DONE
        return teachers;
    }

    public List<Student> getStudentsBySubject(String subject) {
        // TODO - DONE
        int i;
        List<Student> cursanti = new ArrayList<>();
        for(i=0; i< students.size(); i++){
            for (Map.Entry<String, Integer> entry: (students.get(i).getSubjects()).entrySet()){
                if(entry.getKey()==subject)
                    cursanti.add(students.get(i));
            }
        }
        return cursanti;
    }

    public List<Student> getStudentsByAverageGrade() {
        // TODO - DONE
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.averageGrade(), o2.averageGrade());
            }
        });
        return students;
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        // TODO - DONE
        List<Student> elevi = new ArrayList<>();
        elevi = getStudentsBySubject(subject);
        elevi.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getGradeForSubject(subject), o2.getGradeForSubject(subject));
            }
        });
        return elevi;
    }


}