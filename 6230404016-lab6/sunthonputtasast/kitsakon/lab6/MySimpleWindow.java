/**
 * MySimpleWindow
 */
package sunthonputtasast.kitsakon.lab6;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import javax.swing.SwingUtilities;

public class MySimpleWindow extends JFrame {
    // Quick fix warning: Java(536871008)
    private static final long serialVersionUID = -7714389855370776112L;

    // Constant variables.
    private static final String defaultFrameTitle = "MySimpleWindow";
    private static final String cancelButtonString = "Cancel";
    private static final String okButtonString = "Ok";

    protected JPanel mainPanel;
    protected JButton cancelButton;
    protected JButton okButton;

    // A default constructor
    public MySimpleWindow() {
        // Set a default frame's title of this object.
        this.setTitle(defaultFrameTitle);
        // Initialize components
        createComponents();
    }

    // A constructor with one parameter: frame's title.
    public MySimpleWindow(String frameTitle) {
        // Set a frame's title of this object.
        this.setTitle(frameTitle);
        // Initialize components
        createComponents();
    }

    // A method for initializing components
    private void createComponents() {
        // Create a JPanel for this object.
        this.mainPanel = new JPanel();
        // Create a JButtons for this object.
        this.cancelButton = new JButton(cancelButtonString);
        this.okButton = new JButton(okButtonString);
    }

    // A method for adding components to the main frame.
    protected void addComponents() {
        // Add the buttons to the main panel.
        this.mainPanel.add(this.cancelButton);
        this.mainPanel.add(this.okButton);

        // Add the main panel to the main frame.
        this.add(this.mainPanel);
    }

    // A method for setting frame's features.
    protected void setFrameFeatures() {
        // Set the JFrame's sizes automatically by using pack().
        this.pack();
        // Make the JFrame visible.
        this.setVisible(true);
        // The program exit when the user clicks to close a frame.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set the window location at the center of the screen.
        this.setLocationRelativeTo(null);
    }

    public static void createAndShowGUI() {
        MySimpleWindow msw = new MySimpleWindow("My Simple Window");
        msw.addComponents();
        msw.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
