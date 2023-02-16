package lab10.task1;

import lab10.commands.DrawCommand;
import lab10.diagram.DiagramCanvas;
import lab10.diagram.DiagramComponent;

public class DrawRectangle implements DrawCommand {
    private DiagramComponent diagramComponent;
    private DiagramCanvas diagramCanvas ;

    public DrawRectangle(DiagramCanvas diagramCanvas) {
        this.diagramComponent = new DiagramComponent();
        this.diagramCanvas = diagramCanvas;
    }

    @Override
    public void execute() {
        diagramCanvas.addComponent(diagramComponent);
    }

    @Override
    public void undo() {
        diagramCanvas.removeComponent(diagramComponent);
    }

    public DiagramComponent getDiagramComponent() {
        return diagramComponent;
    }

    public void setDiagramComponent(DiagramComponent diagramComponent) {
        this.diagramComponent = diagramComponent;
    }
}
