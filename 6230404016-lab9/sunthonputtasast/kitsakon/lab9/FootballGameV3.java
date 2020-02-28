/**
 * Create class FootballGameV3 extends FootballGameV2 
 * Author: Kitsakon Sunthonputtasast
 * ID: 623040401-6 Sec: 1 Date: February 24, 2020
 */
package sunthonputtasast.kitsakon.lab9;

import javax.swing.*;
import java.awt.event.*;

public class FootballGameV3 extends FootballGameV2 {

    private static final long serialVersionUID = 6647960752584269324L;

    public FootballGameV3(String framTitle) {
        super(framTitle);

        setFocusable(true);
        requestFocus();

    }

    @Override
    public void keyTyped(KeyEvent e) {
        super.keyTyped(e);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        super.keyPressed(e);

    }

    @Override
    public void keyReleased(KeyEvent e) {
        super.keyReleased(e);
    }

    @Override
    public void addListenter() {
        super.addListenter();

        // add action listener of resetButton.
        resetButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);

        Object obj = e.getSource();

        // check if clicked resetButton khonkaenTextField and udonTextField will set
        // text to 0 and resetBall.
        if (obj == resetButton) {
            khonkaenTextField.setText("0");
            udonTextField.setText("0");

            this.canvasDrawerV4.resetBall();
        }

    }

    @Override
    protected void addComponents() {
        super.addComponents();

        this.midPanel.remove(canvasDrawerV4);

        canvasDrawerV4 = new CanvasDrawerV5();
        this.midPanel.add(canvasDrawerV4);

    }

    public static void createAndShowGUI() {
        FootballGameV3 fg3 = new FootballGameV3("Football Game V3");
        fg3.setColor();
        fg3.setValues();
        fg3.setFonts();
        fg3.addMenu();
        fg3.createComponents();
        fg3.addListenter();
        fg3.addComponents();
        fg3.setFrameFeatures();

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}