package lab8.task2;

import java.util.*;

import lab8.task1.Comparable;
import lab8.task1.Student;
import lab8.task7.LinkedSet;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Popescu", "Ana", 1, 10));
        students.add(new Student("Stoica", "Elena", 6, 7));
        students.add(new Student("Marcu", "Silviu", 4, 6));
        students.add(new Student("Cornea", "Maria", 5, 8));
        students.add(new Student("Poienaru", "Vlad", 2, 4));
        /*
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) (o2.getAverageGrade() - o1.getAverageGrade());
            }
        });
        */
        Collections.sort(students, ( o1, o2) -> (int) (o2.getAverageGrade() - o1.getAverageGrade()));
        System.out.println("Sort by average grade:");
        for(int i = 0; i < students.size(); i++){
            System.out.println(students.get(i));
        }


        PriorityQueue<Student> queue = new PriorityQueue<>((o1, o2) -> Long.compare(o1.getId(), o2.getId()));
        queue.addAll(students);
        System.out.println("Sort by id:");
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }

        HashMap<Student, LinkedList<String>> listaMatrii = new HashMap<>();
        LinkedList<String> list1 = new LinkedList<String>();
        list1.add("Mate");
        list1.add("Roamana");
        LinkedList<String> list2 = new LinkedList<String>();
        list2.add("Fizica");
        list2.add("Info");
        LinkedList<String> list3 = new LinkedList<String>();
        list3.add("Desen");
        LinkedList<String> list4 = new LinkedList<String>();
        list4.add("Desen");
        list4.add("Info");
        list4.add("Roamana");
        listaMatrii.put(students.get(0), list1);
        listaMatrii.put(students.get(1), list2);
        listaMatrii.put(students.get(2), list4);
        listaMatrii.put(students.get(3), list3);
        listaMatrii.put(students.get(4), list4);
        System.out.println("Liste materii ale fiecarui student:");
        for(Map.Entry<Student, LinkedList<String>> i : listaMatrii.entrySet()){
            System.out.println(i);
        }
    }
}
