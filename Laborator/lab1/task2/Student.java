package lab1.task2;

public class Student {
    private String name;
    private Integer year;

    @Override
    public String toString() {
        return name ;
    }

    public String getName() {
        return name;
    }

    public Integer getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}

