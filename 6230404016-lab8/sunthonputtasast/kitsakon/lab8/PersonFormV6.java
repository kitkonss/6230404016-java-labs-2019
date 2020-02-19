/**
 * Create class PersonFormV6 extends PersonFormV5 and implements ActionListener.
 * Author: Kitsakon Sunthonputtasast
 * ID: 623040401-6 Sec: 1 Date: February 17, 2020
 */
package sunthonputtasast.kitsakon.lab8;

import java.awt.event.*;
import javax.swing.*;
import sunthonputtasast.kitsakon.lab6.*;

public class PersonFormV6 extends PersonFormV5 implements ActionListener {
    private static final long serialVersionUID = 6897450996441212808L;

    private static final String defaultFrameTitle = "Person Form V6";

    public PersonFormV6() {
        super(defaultFrameTitle);
    }

    public PersonFormV6(String frameTitle) {
        super(frameTitle);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String text = "";
        String name = "Name : " + this.nameTextField.getText();
        String height = "\nHeight : " + this.heightTextField.getText();
        String weight = "\nWeight : " + this.weightTextField.getText();
        String dob = "\nDate of Birth : " + this.dobTextField.getText();

        String type = "\nType : ";
        if (this.studentButton.isSelected())
            type += "Student";
        else if (this.teacherButton.isSelected())
            type += "Teacher";

            // selected item from sportComboBox.
        String sport = "\nSport : " + this.sportComboBox.getSelectedItem();

        String hobbies = "\nHobbies :";
        for (String string : hobbieList.getSelectedValuesList()) {
            hobbies += string + " ";
        }

        String note = "\nNote : " + this.noteTextArea.getText();

        text += name + height + weight + dob + type + sport + hobbies + note;

        Object obj = event.getSource();
        // if click cancelButton clear all TextField.
        if (obj == cancelButton) {
            this.nameTextField.setText("");
            this.heightTextField.setText("");
            this.weightTextField.setText("");
            this.dobTextField.setText("");
            this.noteTextArea.setText("");
            // else if click okButton show message dialog.
        } else if (obj == okButton) {
            JOptionPane.showMessageDialog(this, text, "Person Information", JOptionPane.INFORMATION_MESSAGE,
                    new ImageIcon(getClass().getResource("image/java.jpg")));
        }

    }

    // method for add listener.
    public void addListeners() {

        okButton.addActionListener(this);
        cancelButton.addActionListener(this);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        PersonFormV6 personFormV6 = new PersonFormV6("Person Form V6");
        personFormV6.createComponents();
        personFormV6.addComponents();
        personFormV6.addMenus();
        personFormV6.addListeners();
        personFormV6.setFrameFeatures();
    }

}