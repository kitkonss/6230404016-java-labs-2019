package sunthonputtasast.kitsakon.lab9;

/**
 * FootballGameV2
 */
import java.awt.*;
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
        if (key == KeyEvent.VK_W) {
            canvasDrawerV4.keeperLeft.moveUp();
        } else if (key == KeyEvent.VK_S) {
            canvasDrawerV4.keeperLeft.moveDown();
        } else if (key == KeyEvent.VK_A) {
            canvasDrawerV4.keeperRight.moveUp();
        } else if (key == KeyEvent.VK_D) {
            canvasDrawerV4.keeperRight.moveDown();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public void addListenter() {

        moveUpButton.addActionListener(this);
        moveDownButton.addActionListener(this);
        moveLeftButton.addActionListener(this);
        moveRightButton.addActionListener(this);

        this.addKeyListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (obj == moveUpButton) {
            canvasDrawerV4.keeperLeft.moveUp();
        } else if (obj == moveDownButton) {
            canvasDrawerV4.keeperLeft.moveDown();
        } else if (obj == moveLeftButton) {
            canvasDrawerV4.keeperRight.moveUp();
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
        fg2.addComponents();
        fg2.addListenter();
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