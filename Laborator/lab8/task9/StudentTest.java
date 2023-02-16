package lab8.task9;

import org.junit.jupiter.api.*;
import lab8.task1.Student;

public class StudentTest {
    private Student student;

    @BeforeEach
    public void setUp() {
        this.student = new Student("Paunescu", "Vlad", 1, 8.5);
    }

    @AfterEach
    public void clean() {
        this.student = null;
    }

    @Test
    @DisplayName("Equals Test")
    public void testEquals() {
        Assertions.assertEquals(true, student.equals(student));
        Assertions.assertEquals(false, student.equals(new Student("Paunescu", "Rares", 1, 7)));
    }

    @Test
    @DisplayName("CompareTo Test")
    public void testCompareTo() {
        Assertions.assertEquals(0, student.compareTo(new Student("Paunescu", "Vlad", 1, 8.5)));
        Assertions.assertEquals(1, student.compareTo(new Student("Paunescu", "Rares", 1, 7)));
    }

    @Test
    @DisplayName("toString Test")
    public void testToString() {
        Assertions.assertEquals("Student{name='Paunescu', surname='Vlad', id=1, averageGrade=8.5}", student.toString());
    }
}
