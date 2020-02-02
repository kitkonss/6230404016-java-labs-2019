/**
 * Create class PersonFormV1 extends mySimpleWindow.
 * Author: Kitsakon Sunthonputtasast
 * ID: 623040401-6 Sec: 1 Date: January 19, 2020
 */
package sunthonputtasast.kitsakon.lab6;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.plaf.InsetsUIResource;

public class PersonFormV1 extends MySimpleWindow {
    // quick fix Java(536871008).
    private static final long serialVersionUID = 5693280855341974702L;

    // set name of the frame.
    private static final String defaultFrameTitle = "Person Form V1";
    // create variable.
    private static final int textLength = 10;

    // create components.
    protected JLabel nameLabel;
    protected JLabel heightLabel;
    protected JLabel weightLabel;
    protected JLabel dobLabel;
    protected JLabel typeLabel;

    protected JTextField nameTextField;
    protected JTextField heightTextField;
    protected JTextField weightTextField;
    protected JTextField dobTextField;
    protected JTextField typeTextField;

    protected JRadioButton studentButton;
    protected JRadioButton teacherButton;

    protected JPanel radioButtonPanel;
    protected JPanel formPanelV1;
    // ----------------------------

    // Create default constructor.
    public PersonFormV1() {
        super(defaultFrameTitle);

    }

    // Create constructor with 1 parameters: frameTitle.
    public PersonFormV1(String frameTitle) {
        super(frameTitle);
    }

    @Override
    protected void createComponents() {
        // call method createComponents from mySimpleWindow.
        super.createComponents();

        // Create Label.
        this.nameLabel = new JLabel("Name:");
        this.heightLabel = new JLabel("Height (cm.):");
        this.weightLabel = new JLabel("Weight (kg.):");
        this.dobLabel = new JLabel("Date of birth (eg.,31-01-1990):");
        this.typeLabel = new JLabel("Type:");

        // Create TextField.
        this.nameTextField = new JTextField(textLength);
        this.heightTextField = new JTextField(textLength);
        this.weightTextField = new JTextField(textLength);
        this.dobTextField = new JTextField(textLength);
        this.typeTextField = new JTextField(textLength);

        // Create Button.
        this.studentButton = new JRadioButton("student");
        this.teacherButton = new JRadioButton("teacher");

        // Create panels
        this.radioButtonPanel = new JPanel();
        this.formPanelV1 = new JPanel(new GridBagLayout());

    }

    @Override
    protected void addComponents() {

        // Add two radio buttons to the button panel.
        this.radioButtonPanel.add(this.studentButton);
        this.radioButtonPanel.add(this.teacherButton);

        // Set Layout for the form panel.
        this.formPanelV1.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.weighty = 1.0;
        gbc.weightx = 1.0;
        gbc.insets = new InsetsUIResource(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Add the components to the formPanelV1.
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        this.formPanelV1.add(this.nameLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        this.formPanelV1.add(this.nameTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        this.formPanelV1.add(this.heightLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        this.formPanelV1.add(this.heightTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        this.formPanelV1.add(this.weightLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        this.formPanelV1.add(this.weightTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        this.formPanelV1.add(this.dobLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        this.formPanelV1.add(this.dobTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        this.formPanelV1.add(this.typeLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.EAST;
        this.formPanelV1.add(this.radioButtonPanel, gbc);

        // Add from panel to mid panel.
        this.midPanel.add(this.formPanelV1);

        // call method addComponents from mySimpleWindow.
        super.addComponents();

    }

    public static void createAndShowGUI() {
        PersonFormV1 personFormV1 = new PersonFormV1("Person Form V1");
        personFormV1.addComponents();
        personFormV1.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}