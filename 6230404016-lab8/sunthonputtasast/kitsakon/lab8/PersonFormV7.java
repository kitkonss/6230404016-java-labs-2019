/**
 * Create class PersonFormV7 extends PersonFormV6.
 * Author: Kitsakon Sunthonputtasast
 * ID: 623040401-6 Sec: 1 Date: February 17, 2020
 */

package sunthonputtasast.kitsakon.lab8;

import java.awt.event.*;
import javax.swing.*;

public class PersonFormV7 extends PersonFormV6  {

    private static final long serialVersionUID = -3445606034458899067L;

    private static final String defaultFrameTitle = "Person Form V7";

    public PersonFormV7() {
        super(defaultFrameTitle);
    }

    public PersonFormV7(String frameTitle) {
        super(frameTitle);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        // call super method.
        super.actionPerformed(event);

        Object obj = event.getSource();
        // if click studentButton show message dialog.
        if (obj == studentButton) {
            JOptionPane.showMessageDialog(this, "Type : student has been selected", "Person Information",
                    JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("image/java.jpg")));
                    // if click teacherButton show message dialog.
        } else if (obj == teacherButton) {
            JOptionPane.showMessageDialog(this, "Type : teacher has been selected", "Person Information",
                    JOptionPane.INFORMATION_MESSAGE, new ImageIcon(getClass().getResource("image/java.jpg")));
        }
    }

    // method for add listener.
    @Override
    public void addListeners() {
        // call super method.
        super.addListeners();

        studentButton.addActionListener(this);
        teacherButton.addActionListener(this);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        PersonFormV7 personFormV7 = new PersonFormV7("Person Form V7");
        personFormV7.addComponents();
        personFormV7.addMenus();
        personFormV7.addListeners();
        personFormV7.setFrameFeatures();
    }
}