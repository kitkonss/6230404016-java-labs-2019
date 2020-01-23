/**
 * MySimpleWindow
 */
package sunthonputtasast.kitsakon.lab6;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import javax.swing.SwingUtilities;

public class MySimpleWindow extends JFrame {
    private static final long serialVersionUID = -7714389855370776112L;
    private static final String defaultFrameTitle = "MySimpleWindow";
    private static final String cancelButtonString = "Cancel";
    private static final String okButtonString = "Ok";

    protected JPanel mainPanel;
    protected JButton cancelButton;
    protected JButton okButton;

    public MySimpleWindow() {
        this.setTitle(defaultFrameTitle);
        createComponents();
    }

    public MySimpleWindow(String frameTitle) {
        this.setTitle(frameTitle);
        createComponents();
    }

    private void createComponents() {

        this.mainPanel = new JPanel();

        this.cancelButton = new JButton(cancelButtonString);
        this.okButton = new JButton(okButtonString);
    }

    protected void addComponents() {

        this.mainPanel.add(this.cancelButton);
        this.mainPanel.add(this.okButton);

        this.add(this.mainPanel);
    }

    protected void setFrameFeatures() {

        this.pack();

        this.setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
