/**
 * Create class PersonFormV5 extends PersonFormV4.
 * Author: Kitsakon Sunthonputtasast
 * ID: 623040401-6 Sec: 1 Date: January 19, 2020
 */
package sunthonputtasast.kitsakon.lab6;

import java.awt.Color;
import java.awt.Font;

import javax.swing.SwingUtilities;

public class PersonFormV5 extends PersonFormV4 {
    // quick fix Java(536871008).
    private static final long serialVersionUID = 6360880152042661108L;

    // set name of the frame.
    private static final String defaultFrameTitle = "Person Form V4";

    // Create default constructor.
    public PersonFormV5() {
        super(defaultFrameTitle);
    }

    // Create constructor with 1 parameters: frameTitle.
    public PersonFormV5(String frameTitle) {
        super(frameTitle);
    }

    public void setFonts() {
        // set Label to font plain.
        this.nameLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        this.heightLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        this.weightLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        this.dobLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        this.typeLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        this.sportLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        this.hobbieLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        this.noteLabel.setFont(new Font("Serif", Font.PLAIN, 14));

        // set TextField to font Bold.
        this.nameTextField.setFont(new Font("Serif", Font.BOLD, 14));
        this.heightTextField.setFont(new Font("Serif", Font.BOLD, 14));
        this.weightTextField.setFont(new Font("Serif", Font.BOLD, 14));
        this.dobTextField.setFont(new Font("Serif", Font.BOLD, 14));
        this.typeTextField.setFont(new Font("Serif", Font.BOLD, 14));
        this.sportComboBox.setFont(new Font("Serif", Font.BOLD, 14));
        this.noteTextArea.setFont(new Font("Serif", Font.BOLD, 14));

    }

    // method for set color to button.
    public void setColor() {
        this.cancelButton.setForeground(Color.RED);
        this.okButton.setForeground(Color.BLUE);

    }

    // method for set values in textField.
    public void setValues() {
        this.nameTextField.setText("Manee");
        this.heightTextField.setText("160");
        this.weightTextField.setText("55");
        this.dobTextField.setText("02-02-2000");

        this.studentButton.setSelected(true);

        this.sportComboBox.setSelectedIndex(1);

        this.hobbieList.setSelectedIndices(new int[] { 0, 3 });
    }

    @Override
    protected void createComponents() {
        super.createComponents();
        setFonts();
        setColor();
        setValues();
    }

    @Override
    protected void addComponents() {
        // call method addComponents from PersonFormV4.
        super.addComponents();

    }

    public static void createAndShowGUI() {
        PersonFormV5 personFormV5 = new PersonFormV5("Person Form V5");
        personFormV5.createComponents();
        personFormV5.addComponents();
        personFormV5.addMenus();
        personFormV5.setFrameFeatures();

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}