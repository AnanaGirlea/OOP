package lab10.task1;

import lab10.commands.DrawCommand;
import lab10.diagram.DiagramCanvas;
import lab10.diagram.DiagramComponent;

public class Resize implements DrawCommand {
    private DiagramCanvas diagramCanvas;
    private DiagramComponent diagramComponent;
    private Integer percent;
    private Integer id;

    public Resize(DiagramCanvas diagramCanvas, Integer id, Integer percent) {
        this.diagramComponent = diagramCanvas.getComponent(id);
        this.percent = percent;
    }

    @Override
    public void execute() {
        diagramComponent.setHeight(diagramComponent.getHeight() * percent / 100);
        diagramComponent.setWeight(diagramComponent.getWeight() * percent / 100);
    }

    @Override
    public void undo() {
        diagramComponent.setHeight(diagramComponent.getHeight() * 100 / percent);
        diagramComponent.setWeight(diagramComponent.getWeight() * 100 / percent);
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

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    public DiagramComponent getDiagramComponent() {
        return diagramComponent;
    }

    public void setDiagramComponent(DiagramComponent diagramComponent) {
        this.diagramComponent = diagramComponent;
    }
}
