package lab11.task2;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static <T extends Summable> int total(Collection<T> collection) {
        int total = 0;
        for(T summable : collection){
            total += summable.total();
        }
        return total;
    }

    public static void main(final String[] args) {
        // TODO: add implementation testing - DONE

        MyVector3 vec1 = new MyVector3(0, 1, 2);
        System.out.println("vector1 : " + vec1);
        MyVector3 vec2 = new MyVector3(1, 2, 3);
        System.out.println("vector2 : " + vec2);
        MyVector3 vec3 = new MyVector3(2, 3, 4);
        System.out.println("vector3 : " + vec3);

        vec1.addValue(vec2);
        System.out.println("vector1 : " + vec1);
        vec1.addValue(vec3);
        System.out.println("vector1 : " + vec1 + "\n");

        MyMatrix matrix1 = new MyMatrix();
        matrix1.setMatrix(new int[][] {{0, 0, 0, 0}, {1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}});
        System.out.println("matrix1 : \n" + matrix1.toString());
        MyMatrix matrix2 = new MyMatrix(new int[][] {{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}, {4, 4, 4, 4}});
        System.out.println("matrix2 : \n" + matrix2);
        MyMatrix matrix3 = new MyMatrix(new int[][] {{2, 2, 2, 2}, {3, 3, 3, 3}, {4, 4, 4, 4}, {5, 5, 5, 5}});
        System.out.println("matrix3 : \n" + matrix3);

        matrix1.addValue(matrix2);
        System.out.println("matrix1 : \n" + matrix1);
        matrix1.addValue(matrix3);
        System.out.println("matrix1 : \n" + matrix1 + "\n");

        ArrayList<Summable> list = new ArrayList<>();
        list.add(vec1);
        list.add(vec2);
        list.add(vec3);

        int aux = total(list);
        System.out.println("Total vectori : " + aux);

        list.clear();
        list.add(matrix1);
        list.add(matrix2);
        list.add(matrix3);

        System.out.println("Total matrici : " + total(list));

        aux = aux + total(list);
        System.out.println("Total : " + aux);
    }
}
