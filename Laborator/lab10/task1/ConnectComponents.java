package lab10.task1;

import lab10.commands.DrawCommand;
import lab10.diagram.DiagramCanvas;
import lab10.diagram.DiagramComponent;

public class ConnectComponents implements DrawCommand {
    private DiagramCanvas diagramCanvas;
    private DiagramComponent diagramComponent;
    private Integer id;
    private String next;

    public ConnectComponents(DiagramCanvas diagramCanvas, Integer id, String next) {
        this.diagramComponent = diagramCanvas.getComponent(id);
        this.next = next;
    }

    @Override
    public void execute() {diagramComponent.connectTo(next);}

    @Override
    public void undo() {
        diagramComponent.removeConnection(next);
    }

    public DiagramCanvas getDiagramCanvas() {
        return diagramCanvas;
    }

    public void setDiagramCanvas(DiagramCanvas diagramCanvas) {
        this.diagramCanvas = diagramCanvas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public DiagramComponent getDiagramComponent() {
        return diagramComponent;
    }

    public void setDiagramComponent(DiagramComponent diagramComponent) {
        this.diagramComponent = diagramComponent;
    }
}
