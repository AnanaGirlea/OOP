package lab1.task2;

public class Test {
    public static void main(String[] args){
        Course materie= new Course();
        Student nr1 = new Student();
        Student nr2 = new Student();
        Student nr3 = new Student();
        Student nr4 = new Student();

        nr1.setName("Elena");
        nr1.setYear(12);

        nr2.setName("Alexandra");
        nr2.setYear(10);

        nr3.setName("Anana");
        nr3.setYear(12);

        nr4.setName("Maria");
        nr4.setYear(11);

        Student v[] = new Student[4];
        v[0]=nr1;
        v[1]=nr2;
        v[2]=nr3;
        v[3]=nr4;

        materie.setTitle("mate");
        materie.setDescription("ora de matematica");
        materie.setStudents(v);


        System.out.println("The student in 12th grade are: ");
        Student[] c = new Student[4];
        c = materie.filterYear(12);
        for(int i=0;i<materie.getStudents().length;i++) {
            if (c[i] == null) {
                break;
            }
            System.out.println(c[i].toString());
        }


       /** System.out.println("The student in 12th grade are: " + c.toString());*/

        Student nr5 = new Student();
        Student nr6 = new Student();

        nr5.setName("Vlad");
        nr5.setYear(11);

        nr6.setName("Vlad");
        nr6.setYear(11);

        if (nr5.getName().equals(nr6.getName()) && nr5.getYear().equals(nr6.getYear())) {
            System.out.println("true");
        } else System.out.println("false");

    }
}
