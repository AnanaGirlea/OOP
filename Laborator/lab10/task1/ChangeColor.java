package lab10.task1;

import lab10.commands.DrawCommand;
import lab10.diagram.DiagramCanvas;
import lab10.diagram.DiagramComponent;

public class ChangeColor implements DrawCommand {
    private DiagramCanvas diagramCanvas;
    private DiagramComponent diagramComponent;
    private Integer id;
    private String color;
    private String prev;

    public ChangeColor(DiagramCanvas diagramCanvas, String color, Integer id) {
        this.diagramComponent = diagramCanvas.getComponent(id);
        this.color = color;
    }

    @Override
    public void execute() {
        prev = diagramComponent.getColor();
        diagramComponent.setColor(color);
    }

    @Override
    public void undo() {
        String aux;
        aux = diagramComponent.getColor();
        diagramComponent.setColor(prev);
        prev = aux;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public DiagramComponent getDiagramComponent() {
        return diagramComponent;
    }

    public void setDiagramComponent(DiagramComponent diagramComponent) {
        this.diagramComponent = diagramComponent;
    }
}
