/**
 * Create class PersonFormV2 extends PersonFormV1.
 * Author: Kitsakon Sunthonputtasast
 * ID: 623040401-6 Sec: 1 Date: January 19, 2020
 */
package sunthonputtasast.kitsakon.lab6;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.plaf.InsetsUIResource;

public class PersonFormV2 extends PersonFormV1 {
    // quick fix Java(536871008).
    private static final long serialVersionUID = -692778035167798071L;

    // set name of the frame.
    private static final String defaultFrameTitle = "Person Form V2";

    // create class's variables
    private static String[] sports = { "Running", "Swimming", "Tennis" };

    // Create components.
    protected JComboBox<String> sportComboBox;
    protected JLabel sportLabel;
    protected JLabel noteLabel;
    protected JTextArea noteTextArea;
    protected JPanel notePanel;
    protected JScrollPane noteScrollPane;
    // ----------------------------------

    // Create default constructor.
    public PersonFormV2() {
        super(defaultFrameTitle);
    }

    // Create constructor with 1 parameters: frameTitle.
    public PersonFormV2(String frameTitle) {
        super(frameTitle);
    }

    @Override
    protected void createComponents() {
        // call method createComponents from PersonFormV1.
        super.createComponents();

        this.sportComboBox = new JComboBox<String>(sports);
        this.sportLabel = new JLabel("Sports:");
        this.noteLabel = new JLabel("Note:");
        this.noteTextArea = new JTextArea(
                "21st Century skills include Critical thinking, Creativity, Collaboration, Communication, etc.", 2, 35);
        this.notePanel = new JPanel(new GridBagLayout());
        this.noteScrollPane = new JScrollPane(this.noteTextArea);

        this.noteTextArea.setLineWrap(true);
        this.noteTextArea.setWrapStyleWord(true);
    }

    @Override
    protected void addComponents() {
        // call method addComponents from PersonFormV1.
        super.addComponents();

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.weighty = 1.0;
        gbc.weightx = 1.0;
        gbc.insets = new InsetsUIResource(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.WEST;
        this.formPanelV1.add(this.sportLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.EAST;
        this.formPanelV1.add(this.sportComboBox, gbc);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        this.notePanel.add(this.noteLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        this.notePanel.add(this.noteScrollPane, gbc);

        this.midPanel.add(this.notePanel);

    }

    public static void createAndShowGUI() {
        PersonFormV2 personForm2 = new PersonFormV2("Person Form V2");
        personForm2.addComponents();
        personForm2.setFrameFeatures();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}