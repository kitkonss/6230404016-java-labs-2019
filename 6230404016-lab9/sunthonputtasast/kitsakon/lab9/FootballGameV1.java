package sunthonputtasast.kitsakon.lab9;

/**
 * FootballGameV1
 */
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

        this.midPanel.remove(canvasDrawerV2);

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