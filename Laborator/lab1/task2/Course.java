package lab1.task2;

public class Course {

    private String title;
    private String description;
    private Student[] students = new Student[4];

    public  Student[] filterYear(int y) {
        Student[] aprobati = new Student[4];
        int nr;
        nr=0;
        for(int i = 0;i<students.length;i++){
            if(students[i].getYear() == y){
                aprobati[nr] = students[i];
                nr++;
            }
        }
        return aprobati;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
