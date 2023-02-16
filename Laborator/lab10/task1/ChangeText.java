package lab10.task1;

import lab10.commands.DrawCommand;
import lab10.diagram.DiagramCanvas;
import lab10.diagram.DiagramComponent;

public class ChangeText implements DrawCommand {
    private DiagramCanvas diagramCanvas;
    private DiagramComponent diagramComponent;
    private Integer id;
    private String text;
    private String prev;

    public ChangeText(DiagramCanvas diagramCanvas, String text, Integer id) {
        this.diagramComponent = diagramCanvas.getComponent(id);
        this.text = text;
    }

    @Override
    public void execute() {
        prev = diagramComponent.getText();
        diagramComponent.setText(text);
    }

    @Override
    public void undo() {
        String aux;
        aux = diagramComponent.getText();
        diagramComponent.setText(prev);
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public DiagramComponent getDiagramComponent() {
        return diagramComponent;
    }

    public void setDiagramComponent(DiagramComponent diagramComponent) {
        this.diagramComponent = diagramComponent;
    }
}
