package lab12.kotlin;

import java.util.List;

public class Classroom {
    private final Long classroomId;
    private final List<Student> students;

    public Classroom(Long classroomId, List<Student> students) {
        this.classroomId = classroomId;
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Long getClassroomId() {
        return classroomId;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "classroomId=" + classroomId +
                ", students=" + students +
                '}';
    }
}
