/**
 * Create class GraphicsMoverV2 extends GraphicsMoverV1
 * Author: Kitsakon Sunthonputtasast
 * ID: 623040401-6 Sec: 1 Date: February 7, 2020
 */

package sunthonputtasast.kitsakon.lab7;

import javax.swing.*;
import java.awt.*;

public class GraphicsMoverV2 extends GraphicsMoverV1 {
    private static final long serialVersionUID = 5380609292619194517L;

    private static final String defaultFrameTitle = "Graphics Mover Version 2";

    private static final int textLength = 1;

    // create components.
    protected JPanel scorePanel;
    protected JLabel khonkaenLabel;
    protected JLabel udonLabel;
    protected JTextField khonkaenTextField;
    protected JTextField udonTextField;
    // ----------------------

    public GraphicsMoverV2() {
        super(defaultFrameTitle);
    }

    public GraphicsMoverV2(String frameTitle) {
        super(frameTitle);

    }

    // method for set color to each Label.
    public void setColor() {
        this.khonkaenLabel.setForeground(Color.BLUE);
        this.udonLabel.setForeground(Color.RED);

    }

    // method for set values in TextField.
    public void setValues() {
        this.khonkaenTextField.setText("3");
        this.udonTextField.setText("1");
    }

    // method for set Fonts.
    public void setFonts() {
        this.khonkaenTextField.setFont(new Font("Serif", Font.BOLD, 20));
        this.udonTextField.setFont(new Font("Serif", Font.BOLD, 20));
    }

    @Override
    protected void createComponents() {

        // crate Label.
        this.khonkaenLabel = new JLabel("Khonkaen");
        this.udonLabel = new JLabel("Udon Thani");

        // create textField.
        this.khonkaenTextField = new JTextField(textLength);
        this.udonTextField = new JTextField(textLength);

        // create panel.
        this.scorePanel = new JPanel();
        // set scorePanel to right of layout.
        this.scorePanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        // call super createComponents.
        super.createComponents();

    }

    @Override
    protected void addComponents() {
        // call super addComponents.
        super.addComponents();

        // add Label and TextField to scorePanel.
        this.scorePanel.add(this.khonkaenLabel);
        this.scorePanel.add(this.khonkaenTextField);
        this.scorePanel.add(this.udonLabel);
        this.scorePanel.add(this.udonTextField);

        // set scorePanel to page_start.
        this.mainPanel.add(this.scorePanel, BorderLayout.PAGE_START);

        setColor();
        setValues();
        setFonts();

    }

    public static void createAndShowGUI() {
        GraphicsMoverV2 graphicsV2 = new GraphicsMoverV2("Graphics Mover Version 2");
        graphicsV2.setColor();
        graphicsV2.setValues();
        graphicsV2.setFonts();
        graphicsV2.createComponents();
        graphicsV2.addComponents();
        graphicsV2.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}