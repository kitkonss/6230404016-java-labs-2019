/**
 * Create class PersonFormV4 extends PersonFormV3.
 * Author: Kitsakon Sunthonputtasast
 * ID: 623040401-6 Sec: 1 Date: January 19, 2020
 */
package sunthonputtasast.kitsakon.lab6;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

public class PersonFormV4 extends PersonFormV3 {
    // quick fix Java(536871008).
    private static final long serialVersionUID = -1950650463876241399L;

    // set name of the frame.
    private static final String defaultFrameTitle = "Person Form V4";

    // create Components.
    protected ImageIcon imageIcon;

    protected JMenuItem redMenuItem;
    protected JMenuItem greenMenuItem;
    protected JMenuItem blueMenuItem;
    protected JMenuItem size16MenuItem;
    protected JMenuItem size20MenuItem;
    protected JMenuItem size24MenuItem;
    // ------------------------------

    // Create default constructor.
    public PersonFormV4() {
        super(defaultFrameTitle);
    }

    // Create constructor with 1 parameters: frameTitle.
    public PersonFormV4(String frameTitle) {
        super(frameTitle);
    }

    @Override
    protected void createComponents() {
        // call method createComponents from PersonFormV3.
        super.createComponents();

        // change MenuItem to Menu
        this.colorMenuItem = new JMenu("Color");
        this.sizeMenuItem = new JMenu("Size");

        this.redMenuItem = new JMenuItem("Red");
        this.greenMenuItem = new JMenuItem("Green");
        this.blueMenuItem = new JMenuItem("Blue");

        this.size16MenuItem = new JMenuItem("16");
        this.size20MenuItem = new JMenuItem("20");
        this.size24MenuItem = new JMenuItem("24");
    }

    @Override
    protected void addComponents() {
         // call method addComponents from PersonFormV3.
        super.addComponents();
    }

    // method for add image to newMenuItem.
    protected void updateMenuIcon() {
        // choose new.png from file's image.
        this.imageIcon = new ImageIcon(getClass().getResource("image/newpic.png"));
        // set imageIcon to newMenuItem.
        this.newMenuItem.setIcon(this.imageIcon);
    }

    // method for add subMenus to MenuItem.
    protected void addSubMenus() {
        // add each color to colorMenuItem.
        this.colorMenuItem.add(redMenuItem);
        this.colorMenuItem.add(greenMenuItem);
        this.colorMenuItem.add(blueMenuItem);

        // add each size to sizeMenuItem.
        this.sizeMenuItem.add(size16MenuItem);
        this.sizeMenuItem.add(size20MenuItem);
        this.sizeMenuItem.add(size24MenuItem);

    }

    protected void addMenus() {
        super.addMenus();
        updateMenuIcon();
        addSubMenus();
    }

    public static void createAndShowGUI() {
        PersonFormV4 personFormV4 = new PersonFormV4("Person Form V4");
        personFormV4.addComponents();
        personFormV4.addMenus();
        personFormV4.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}