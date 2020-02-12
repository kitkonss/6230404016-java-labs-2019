/**
 * GraphicsMoverV3
 */

package sunthonputtasast.kitsakon.lab7;

import javax.swing.*;

public class GraphicsMoverV3 extends GraphicsMoverV2 {
    private static final long serialVersionUID = 3636177301644200226L;

    private static final String defaultFrameTitle = "Graphics Mover Version 3";

    protected JMenuBar mainJMenuBar;

    protected JMenu fileJMenu;

    protected JMenuItem openItem;
    protected JMenuItem saveItem;
    protected JMenuItem quitItem;

    protected ImageIcon imageIcon;

    public GraphicsMoverV3() {
        super(defaultFrameTitle);
    }

    public GraphicsMoverV3(String frameTitle) {
        super(frameTitle);

    }

    @Override
    protected void createComponents() {
        super.createComponents();

        this.mainJMenuBar = new JMenuBar();

        this.fileJMenu = new JMenu("File");

        this.openItem = new JMenuItem("Open");
        this.saveItem = new JMenuItem("Save");
        this.quitItem = new JMenuItem("Quit");

    }

    protected void updateMenuIcon() {
        // choose folderIcon.jpg from file's image.
        this.imageIcon = new ImageIcon(getClass().getResource("images/folderIcon.jpg"));

        this.openItem.setIcon(this.imageIcon);
    }

    protected void addMenu() {
        this.fileJMenu.add(openItem);
        this.fileJMenu.add(saveItem);
        this.fileJMenu.add(quitItem);

        this.mainJMenuBar.add(this.fileJMenu);

        this.setJMenuBar(this.mainJMenuBar);

    }

    @Override
    protected void addComponents() {
        super.addComponents();
        this.addMenu();
        this.updateMenuIcon();

    }

    public static void createAndShowGUI() {
        GraphicsMoverV3 graphicsV3 = new GraphicsMoverV3("Graphics Mover Version 3");
        graphicsV3.addComponents();
        graphicsV3.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}