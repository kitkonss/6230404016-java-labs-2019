/**
 * Create class FootballGameV2 extends FootballGameV1 implements ActionListener, KeyListener
 * Author: Kitsakon Sunthonputtasast
 * ID: 623040401-6 Sec: 1 Date: February 24, 2020
 */
package sunthonputtasast.kitsakon.lab9;

import javax.swing.*;
import java.awt.event.*;

public class FootballGameV2 extends FootballGameV1 implements ActionListener, KeyListener {

    private static final long serialVersionUID = 2053029963006046231L;

    protected CanvasDrawerV4 canvasDrawerV4;

    public FootballGameV2(String framTitle) {
        super(framTitle);

        setFocusable(true);
        requestFocus();

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        // check if pressed w keeperLeft will move up.
        if (key == KeyEvent.VK_W) {
            canvasDrawerV4.keeperLeft.moveUp();
            // check if pressed s keeperLeft will move down.
        } else if (key == KeyEvent.VK_S) {
            canvasDrawerV4.keeperLeft.moveDown();
            // check if pressed arrow_up keeperRight will move up.
        } else if (key == KeyEvent.VK_UP) {
            canvasDrawerV4.keeperRight.moveUp();
            // check if pressed arrow_down keeperRight will move down.
        } else if (key == KeyEvent.VK_DOWN) {
            canvasDrawerV4.keeperRight.moveDown();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public void addListenter() {

        // add action listerner of each button.
        moveUpButton.addActionListener(this);
        moveDownButton.addActionListener(this);
        moveLeftButton.addActionListener(this);
        moveRightButton.addActionListener(this);

        // add key listener.
        this.addKeyListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        // check if clicked moveUpButton keeperLeft will move up.
        if (obj == moveUpButton) {
            canvasDrawerV4.keeperLeft.moveUp();
            // check if clicked moveDownButton keeperLeft will move down.
        } else if (obj == moveDownButton) {
            canvasDrawerV4.keeperLeft.moveDown();
            // check if clicked moveLeftButton keeperRight will move up.
        } else if (obj == moveLeftButton) {
            canvasDrawerV4.keeperRight.moveUp();
            // check if clicked moveRightButton keeperRight will move down.
        } else if (obj == moveRightButton) {
            canvasDrawerV4.keeperRight.moveDown();
        }

    }

    @Override
    protected void addComponents() {
        super.addComponents();

        this.midPanel.remove(canvasDrawerV3);

        this.canvasDrawerV4 = new CanvasDrawerV4();
        this.midPanel.add(canvasDrawerV4);

    }

    public static void createAndShowGUI() {
        FootballGameV2 fg2 = new FootballGameV2("Football Game V2");
        fg2.setColor();
        fg2.setValues();
        fg2.setFonts();
        fg2.addMenu();
        fg2.createComponents();
        fg2.addListenter();
        fg2.addComponents();
        fg2.setFrameFeatures();

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}