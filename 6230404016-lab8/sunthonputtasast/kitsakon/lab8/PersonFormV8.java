/**
 * Create class PersonFormV8 extends PersonFormV7.
 * Author: Kitsakon Sunthonputtasast
 * ID: 623040401-6 Sec: 1 Date: February 17, 2020
 */

package sunthonputtasast.kitsakon.lab8;

import java.awt.event.*;
import javax.swing.*;

public class PersonFormV8 extends PersonFormV7 {

    private static final long serialVersionUID = -3445606034458899067L;

    private static final String defaultFrameTitle = "Person Form V8";

    public PersonFormV8() {
        super(defaultFrameTitle);
    }

    public PersonFormV8(String frameTitle) {
        super(frameTitle);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        // call super methd.
        super.actionPerformed(event);

        // message 'Your sport is now change to' + item in sportComboBox which
        // you selected.
        String sportName = "Your sport is now change to " + sportComboBox.getSelectedItem();

        Object obj = event.getSource();
        if (obj == sportComboBox) {
            JOptionPane.showMessageDialog(this, sportName, "Person Information", JOptionPane.INFORMATION_MESSAGE,
                    new ImageIcon(getClass().getResource("image/java.jpg")));
        }
    }

    // method for add listener.
    @Override
    public void addListeners() {
        // call super method.
        super.addListeners();

        sportComboBox.addActionListener(this);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        PersonFormV8 PersonFormV8 = new PersonFormV8("Person Form V8");
        PersonFormV8.addComponents();
        PersonFormV8.addMenus();
        PersonFormV8.addListeners();
        PersonFormV8.setFrameFeatures();
    }
}