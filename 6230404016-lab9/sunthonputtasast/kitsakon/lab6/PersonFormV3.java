/**
 * Create class PersonFormV3 extends PersonFormV2.
 * Author: Kitsakon Sunthonputtasast
 * ID: 623040401-6 Sec: 1 Date: January 19, 2020
 */
package sunthonputtasast.kitsakon.lab6;

import java.awt.GridBagConstraints;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;
import javax.swing.plaf.InsetsUIResource;

public class PersonFormV3 extends PersonFormV2 {
    // quick fix Java(536871008).
    private static final long serialVersionUID = -7227641288319644300L;

    // set name of the frame.
    private static final String defaultFrameTitle = "Person Form V3";

    // create class's variables
    private static String[] hobbie = { "Reading", "Traveling", "Cooking", "Photography" };

    // create Components.
    protected JList<String> hobbieList;
    protected JLabel hobbieLabel;
    protected JMenuBar mainMenuBar;
    protected JMenu fileMenu, ConfigMenu;
    protected JMenuItem newMenuItem, openMenuItem, saveMenuItem, exitMenuItem, colorMenuItem, sizeMenuItem;
    // ----------------------

    // Create default constructor.
    public PersonFormV3() {
        super(defaultFrameTitle);
    }

    // Create constructor with 1 parameters: frameTitle.
    public PersonFormV3(String frameTitle) {
        super(frameTitle);
    }

    @Override
    protected void createComponents() {
        // call method createComponents from PersonFormV2.
        super.createComponents();

        this.hobbieList = new JList<String>(hobbie);
        this.hobbieLabel = new JLabel("Hobbies:");
        this.mainMenuBar = new JMenuBar();
        this.fileMenu = new JMenu("file");
        this.ConfigMenu = new JMenu("Config");
        this.newMenuItem = new JMenuItem("New");
        this.openMenuItem = new JMenuItem("Open");
        this.saveMenuItem = new JMenuItem("Save");
        this.exitMenuItem = new JMenuItem("Exit");
        this.colorMenuItem = new JMenuItem("Color");
        this.sizeMenuItem = new JMenuItem("Size");

    }

    @Override
    protected void addComponents() {
        // call method addComponents from PersonFormV2.
        super.addComponents();

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.weighty = 1.0;
        gbc.weightx = 1.0;
        gbc.insets = new InsetsUIResource(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.WEST;
        this.formPanelV1.add(this.hobbieLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.EAST;
        this.formPanelV1.add(this.hobbieList, gbc);

        this.addMenus();

    }

    // method for add menu to frame.
    protected void addMenus() {
        // add MenuItem to fileMenu.
        this.fileMenu.add(newMenuItem);
        this.fileMenu.add(openMenuItem);
        this.fileMenu.add(saveMenuItem);
        this.fileMenu.add(exitMenuItem);
        // add MenuItem to ConfigMenu.
        this.ConfigMenu.add(colorMenuItem);
        this.ConfigMenu.add(sizeMenuItem);

        // add Menu to Menubar.
        this.mainMenuBar.add(this.fileMenu);
        this.mainMenuBar.add(this.ConfigMenu);

        // add Menubar to frame.
        this.setJMenuBar(this.mainMenuBar);
    }

    public static void createAndShowGUI() {
        PersonFormV3 personFormV3 = new PersonFormV3("Person Form V3");
        personFormV3.addComponents();
        personFormV3.addMenus();
        personFormV3.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}