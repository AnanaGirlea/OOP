package lab10.main;

import lab10.commands.*;
import lab10.diagram.DiagramCanvas;

import java.util.LinkedList;

/**
 * The layer between the client and the commands that need to be executed on the receivers (DiagramCanvas and DiagramComponent).
 * <br>
 * It is independent of the subtypes of commands, it just receives a command, runs it and implements a redo/undo mechanism.
 */
public class Invoker {
    private LinkedList<DrawCommand> previousDo = new LinkedList<>();
    private LinkedList<DrawCommand>  previousUndo = new LinkedList<>();
    /**
     * Clear up all the used resources, start fresh :D
     */
    public void restart() {
      // TODO - DONE
        previousDo.clear();
        previousUndo.clear();
    }

    /**
     * Executes a given command
     * @param command
     */
    public void execute(DrawCommand command) {
        previousDo.push(command);
        command.execute();
    }

    /**
     * Undo the latest command
     */
    public void undo() {
        // TODO - DONE
        // Hint: use data structures to keep track of commands
        // Do not use the java.util.Stack, its implementation is based on vector which is inefficient and deprecated.
        // Use a class that implements the Deque interface, e.g. LinkedList https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Deque.html
        if(previousDo.isEmpty()){
            return;
        }
        DrawCommand command = previousDo.pop();
        if (command != null){
            command.undo();
        }
        previousUndo.push(command);
    }

    /**
     * Redo command previously undone. Cannot perform a redo after an execute, only after at least one undo.
     */
    public void redo() {
        // TODO - DONE
        DrawCommand command = previousUndo.pop();
        if (command != null){
            command.undo();
        }
        previousDo.push(command);
    }
}
