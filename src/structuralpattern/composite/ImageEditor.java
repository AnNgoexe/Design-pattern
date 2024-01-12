package structuralpattern.composite;

import structuralpattern.composite.leaf_composite.CompoundShape;
import structuralpattern.composite.leaf_composite.Shape;

public class ImageEditor {
    private EditorCanvas canvas;

    private CompoundShape allShapes = new CompoundShape();

    public ImageEditor() {
        this.canvas = new EditorCanvas(this);
    }

    public void loadShapes(Shape... shapes) {
        this.allShapes.clear();
        this.allShapes.add(shapes);
        this.canvas.refresh();
    }

    public CompoundShape getAllShapes() {
        return this.allShapes;
    }

    public EditorCanvas getCanvas() {
        return this.canvas;
    }
}
