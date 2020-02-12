/**
 * Create class GraphicsMoverV1 extends MySimpleWindow
 * Author: Kitsakon Sunthonputtasast
 * ID: 623040401-6 Sec: 1 Date: February 7, 2020
 */
package sunthonputtasast.kitsakon.lab7;

import javax.swing.*;
import java.awt.*;
import sunthonputtasast.kitsakon.lab6.*;

class GraphicsMoverV1 extends MySimpleWindow {
    private static final long serialVersionUID = 1883906064287351681L;

    private static final String defaultFrameTitle = "Graphics Mover Version 1";

    protected CanvasDrawerV1 canvasDrawerV1;

    // create components.
    protected JButton moveUpButton;
    protected JButton moveDownButton;
    protected JButton moveLeftButton;
    protected JButton moveRightButton;
    protected JButton resetButton;
    // ----------------------

    public GraphicsMoverV1() {
        super(defaultFrameTitle);
    }

    public GraphicsMoverV1(String frameTitle) {
        super(frameTitle);
    }

    @Override
    protected void createComponents() {
        // call method createComponents.
        super.createComponents();

        // create CanvasDrawerV1.
        this.canvasDrawerV1 = new CanvasDrawerV1();

        // create Button.
        this.moveUpButton = new JButton("Move Up");
        this.moveDownButton = new JButton("Move Down");
        this.moveLeftButton = new JButton("Move Left");
        this.moveRightButton = new JButton("Move Right");
        this.resetButton = new JButton("Reset");

    }

    @Override
    protected void addComponents() {

        // add each button to buttonpanel.
        buttonPanel.add(moveUpButton);
        buttonPanel.add(moveDownButton);
        buttonPanel.add(moveLeftButton);
        buttonPanel.add(moveRightButton);
        buttonPanel.add(resetButton);

        // add canvasDrawerV1 to midPanel.
        super.midPanel.add(this.canvasDrawerV1);
        // add buttonPanel to botPanel.
        super.botPanel.add(this.buttonPanel);

        // set locaation of each Panel.
        super.mainPanel.add(super.midPanel, BorderLayout.CENTER);
        super.mainPanel.add(super.botPanel, BorderLayout.PAGE_END);

        // add mainpanel to frame.
        this.add(super.mainPanel);

    }

    public static void createAndShowGUI() {
        GraphicsMoverV1 graphicsV1 = new GraphicsMoverV1("Graphics Mover Version 1");
        graphicsV1.addComponents();
        graphicsV1.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}