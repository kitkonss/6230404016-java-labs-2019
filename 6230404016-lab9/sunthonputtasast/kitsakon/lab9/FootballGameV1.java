/**
 * Create class FootballGameV1 extends GraphicsMoverV4
 * Author: Kitsakon Sunthonputtasast
 * ID: 623040401-6 Sec: 1 Date: February 24, 2020
 */
package sunthonputtasast.kitsakon.lab9;

import javax.swing.*;

public class FootballGameV1 extends GraphicsMoverV4 {

    private static final long serialVersionUID = -7321443081178150409L;

    private static final String defaultFrameTitle = "Football Game V1";

    protected CanvasDrawerV3 canvasDrawerV3;

    public FootballGameV1() {
        super(defaultFrameTitle);
    }

    public FootballGameV1(String frameTitle) {
        super(frameTitle);

    }

    @Override
    protected void createComponents() {
        super.createComponents();

        this.canvasDrawerV3 = new CanvasDrawerV3();
    }

    @Override
    protected void addComponents() {
        super.addComponents();

        // remove canvasDrawerV2
        this.midPanel.remove(canvasDrawerV2);

        // add canvasDrawerV3
        this.midPanel.add(canvasDrawerV3);

    }

    public static void createAndShowGUI() {
        FootballGameV1 fg1 = new FootballGameV1("Football Game V1");
        fg1.setColor();
        fg1.setValues();
        fg1.setFonts();
        fg1.addMenu();
        fg1.createComponents();
        fg1.addComponents();
        fg1.setFrameFeatures();

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}