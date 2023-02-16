package lab10.main;

import lab10.commands.*;
import lab10.diagram.DiagramCanvas;
import lab10.task1.*;

/**
 * Receives commands in clear text from the user and transforms them in DrawCommand objects. It uses the Invoker to
 * execute the given commands.
 */
public class Client {

    private Invoker invoker;
    private DiagramCanvas diagramCanvas;

    Client() {
        invoker = new Invoker();
        diagramCanvas = new DiagramCanvas();
    }

    public void showDiagram() {
        // TODO - DONE
        this.diagramCanvas.show();
    }

    public void newDiagram() {
        // TODO - DONE
        this.diagramCanvas = new DiagramCanvas();
        this.invoker.restart();
    }

    public void executeAction(String commandName, String ...args) {
        // TODO - uncomment: - DONE
        DrawCommand command;
        try {
            CommandType commandType = CommandType.fromString(commandName);
            command = getCommand(commandType, args);
            if (command == null) {
                throw new IllegalArgumentException();
            }

        } catch(IllegalArgumentException ex) {
            System.out.println("Invalid command: " + commandName);
            System.out.println("Available commands:");
            for (CommandType type : CommandType.values()) {
                System.out.println("\t- " + type.text);
            }
            return;
        }

        // TODO - Execute the action - DONE
        this.invoker.execute(command);
    }

    private DrawCommand getCommand(CommandType type, String ...args) throws IllegalArgumentException {
        // TODO factory method to create DrawCommand subclasses.
        // If there is an exception when parsing the string arguments (NumberFormatException) catch it and
        // throw an IllegalArgumentException
            return switch (type) {
                case CONNECT -> new ConnectComponents(
                        this.diagramCanvas,
                        Integer.parseInt(args[0]),
                        args[1]
                );
                case DRAW_RECTANGLE -> new DrawRectangle(
                        this.diagramCanvas
                );
                case CHANGE_COLOR -> new ChangeColor(
                        this.diagramCanvas,
                        args[1],
                        Integer.parseInt(args[0])
                );
                case RESIZE -> new Resize(
                        this.diagramCanvas,
                        Integer.parseInt(args[0]),
                        Integer.parseInt(args[1])
                );
                case CHANGE_TEXT -> new ChangeText(
                        this.diagramCanvas,
                        args[1],
                        Integer.parseInt(args[0])
                );
            };
    }

    public void undo(){
        // TODO - DONE
        this.invoker.undo();
    }

    public void redo() {
        // TODO - DONE
        this.invoker.redo();
    }
}
