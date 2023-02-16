package lab13.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static void readAndPrintLine() {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // TODO: Read a line from stdin and print it to stdout - DONE
        // TODO: Don't forget to close the reader (Hint: try-with-resources, try-finally) - DONE

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String linieText = reader.readLine();
            System.out.println(linieText);
        } catch (IOException e) {
            System.out.println("exception found");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readAndPrintLine();
    }
}
