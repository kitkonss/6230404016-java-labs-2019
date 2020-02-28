/**
 * Create class GraphicsMoverV4 extends GraphicsMoverV3 
 * Author: Kitsakon Sunthonputtasast
 * ID: 623040401-6 Sec: 1 Date: February 24, 2020
 */
package sunthonputtasast.kitsakon.lab9;

import javax.swing.*;
import sunthonputtasast.kitsakon.lab7.*;

public class GraphicsMoverV4 extends GraphicsMoverV3 {
    private static final long serialVersionUID = 3636177301644200226L;

    private static final String defaultFrameTitle = "Graphics Mover Version 4";

    protected CanvasDrawerV2 canvasDrawerV2;

    public GraphicsMoverV4() {
        super(defaultFrameTitle);
    }

    public GraphicsMoverV4(String frameTitle) {
        super(frameTitle);

    }

    @Override
    protected void createComponents() {
        // call method createComponents.
        super.createComponents();

        // create canvasDrawerV2.
        this.canvasDrawerV2 = new CanvasDrawerV2();

        // set text of each button.
        moveUpButton.setText("Move Left Up");
        moveDownButton.setText("Move Left Down");
        moveLeftButton.setText("Move Right Up");
        moveRightButton.setText("Move Right Down");

    }

    @Override
    protected void addComponents() {
        // call method addComponents.
        super.addComponents();

        // remove canvasDrawerV1 to midPanel.
        this.midPanel.remove(this.canvasDrawerV1);

        // add canvasDrawerV2 to midPanel.
        this.midPanel.add(this.canvasDrawerV2);

    }

    public static void createAndShowGUI() {
        GraphicsMoverV4 graphicsV4 = new GraphicsMoverV4("Graphics Mover Version 4");
        graphicsV4.setColor();
        graphicsV4.setValues();
        graphicsV4.setFonts();
        graphicsV4.addMenu();
        graphicsV4.createComponents();
        graphicsV4.addComponents();
        graphicsV4.setFrameFeatures();

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}