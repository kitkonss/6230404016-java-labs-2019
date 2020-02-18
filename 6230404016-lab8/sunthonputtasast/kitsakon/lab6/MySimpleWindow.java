/**
 * Create class MySimpleWindow
 * Author: Kitsakon Sunthonputtasast
 * ID: 623040401-6 Sec: 1 Date: January 19, 2020
 */
package sunthonputtasast.kitsakon.lab6;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

public class MySimpleWindow extends JFrame {
    // quick fix Java(536871008).
    private static final long serialVersionUID = -7714389855370776112L;

    // set name of the frame.
    private static final String defaultFrameTitle = "MySimpleWindow";
    // create variables.
    private static final String cancelButtonString = "Cancel";
    private static final String okButtonString = "Ok";

    // create components.
    protected JPanel mainPanel;
    protected JPanel topPanel;
    protected JPanel midPanel;
    protected JPanel botPanel;

    protected JPanel buttonPanel;

    protected JButton cancelButton;
    protected JButton okButton;
    // -------------------------

    // Create default constructor.
    public MySimpleWindow() {
        super(defaultFrameTitle);
        createComponents();
    }

    // Create constructor with 1 parameters: frameTitle.
    public MySimpleWindow(String frameTitle) {
        super(frameTitle);
        createComponents();
    }

    // method for initiallizing for components.
    protected void createComponents() {

        this.mainPanel = new JPanel(new BorderLayout());
        this.buttonPanel = new JPanel();

        this.cancelButton = new JButton(cancelButtonString);
        this.okButton = new JButton(okButtonString);

        this.topPanel = new JPanel();
        this.topPanel.setLayout(new BoxLayout(this.topPanel, BoxLayout.Y_AXIS));
        this.midPanel = new JPanel();
        this.midPanel.setLayout(new BoxLayout(this.midPanel, BoxLayout.Y_AXIS));
        this.botPanel = new JPanel();
        this.botPanel.setLayout(new BoxLayout(this.botPanel, BoxLayout.Y_AXIS));
    }

    protected void addComponents() {
        // add button to buttonPanel.
        buttonPanel.add(this.cancelButton);
        buttonPanel.add(this.okButton);

        // add buttonPanel to botPanel.
        this.botPanel.add(this.buttonPanel);

        // add position of each panel.
        this.mainPanel.add(this.topPanel, BorderLayout.PAGE_START);
        this.mainPanel.add(this.midPanel, BorderLayout.CENTER);
        this.mainPanel.add(this.botPanel, BorderLayout.PAGE_END);

        // add mainPanel to the frame.
        this.add(this.mainPanel);

    }

    // Set frame
    protected void setFrameFeatures() {

        // set frame size automatically.
        this.pack();

        // show the frame on display.
        this.setVisible(true);

        // close the display
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set frame location to center of display.
        this.setLocationRelativeTo(null);
    }

    public static void createAndShowGUI() {
        MySimpleWindow msw = new MySimpleWindow("My Simple Window");
        msw.createComponents();
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
