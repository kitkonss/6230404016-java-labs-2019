/**
 * Create class GraphicsMoverV3 extends GraphicsMoverV2
 * Author: Kitsakon Sunthonputtasast
 * ID: 623040401-6 Sec: 1 Date: February 7, 2020
 */

package sunthonputtasast.kitsakon.lab7;

import javax.swing.*;

public class GraphicsMoverV3 extends GraphicsMoverV2 {
    private static final long serialVersionUID = 3636177301644200226L;

    private static final String defaultFrameTitle = "Graphics Mover Version 3";

    // create components.
    protected JMenuBar mainJMenuBar;

    protected JMenu fileJMenu;

    protected JMenuItem openItem;
    protected JMenuItem saveItem;
    protected JMenuItem quitItem;

    protected ImageIcon imageIcon;
    // ----------------------

    public GraphicsMoverV3() {
        super(defaultFrameTitle);
    }

    public GraphicsMoverV3(String frameTitle) {
        super(frameTitle);

    }

    @Override
    protected void createComponents() {
        // call super createComponents.
        super.createComponents();

        // create MenuBar.
        this.mainJMenuBar = new JMenuBar();

        // create Menu.
        this.fileJMenu = new JMenu("File");

        // create MenuItem.
        this.openItem = new JMenuItem("Open");
        this.saveItem = new JMenuItem("Save");
        this.quitItem = new JMenuItem("Quit");

    }

    protected void updateMenuIcon() {
        // choose folderIcon.jpg from file's image.
        this.imageIcon = new ImageIcon(getClass().getResource("images/folderIcon.jpg"));
        // set imageIcon to openItem.
        this.openItem.setIcon(this.imageIcon);
    }

    protected void addMenu() {

        // add each menuItem to fileJMenu.
        this.fileJMenu.add(openItem);
        this.fileJMenu.add(saveItem);
        this.fileJMenu.add(quitItem);

        // add fileJMenu to mainJMenuBar.
        this.mainJMenuBar.add(this.fileJMenu);

        // add MenuBar to frame.
        this.setJMenuBar(this.mainJMenuBar);

        updateMenuIcon();

    }

    @Override
    protected void addComponents() {
        // call super addComponents.
        super.addComponents();
       

    }

    public static void createAndShowGUI() {
        GraphicsMoverV3 graphicsV3 = new GraphicsMoverV3("Graphics Mover Version 3");
        graphicsV3.createComponents();
        graphicsV3.addComponents();
        graphicsV3.setFrameFeatures();
        graphicsV3.addMenu();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}