package structuralpattern.composite;

import structuralpattern.composite.ImageEditor;

import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EditorCanvas extends Canvas {
    private ImageEditor imageEditor;

    private static final int PADDING = 10;

    void createFrame() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel contentPanel = new JPanel();
        Border padding = BorderFactory.createEmptyBorder(PADDING, PADDING, PADDING, PADDING);
        contentPanel.setBorder(padding);
        frame.setContentPane(contentPanel);

        frame.add(this);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
    }

    void refresh() {
        this.setSize(getWidth(), getHeight());
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (frame != null) {
            frame.pack();
        }
    }

    public EditorCanvas(ImageEditor imageEditor) {
        this.imageEditor = imageEditor;
        createFrame();
        refresh();
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                imageEditor.getAllShapes().unSelect();
                imageEditor.getAllShapes().selectChildAt(e.getX(), e.getY());
                e.getComponent().repaint();
            }
        });
    }

    public int getWidth() {
        return imageEditor.getAllShapes().getX() + imageEditor.getAllShapes().getWidth() + PADDING;
    }

    public int getHeight() {
        return imageEditor.getAllShapes().getY() + imageEditor.getAllShapes().getHeight() + PADDING;
    }

    public void paint(Graphics graphics) {
        imageEditor.getAllShapes().paint(graphics);
    }
}
