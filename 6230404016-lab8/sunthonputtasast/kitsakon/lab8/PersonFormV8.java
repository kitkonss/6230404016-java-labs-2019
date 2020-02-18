/**
 * PersonFormV7
 */

package sunthonputtasast.kitsakon.lab8;

import java.awt.event.*;
import javax.swing.*;

public class PersonFormV8 extends PersonFormV7  {

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
        super.actionPerformed(event);

        String sportName = "Your sport is now change to " + sportComboBox.getSelectedItem();

        Object obj = event.getSource();
        if (obj == sportComboBox) {
            JOptionPane.showMessageDialog(this, sportName, "Person Information", JOptionPane.INFORMATION_MESSAGE,
                    new ImageIcon(getClass().getResource("image/java.jpg")));
        } 
    }

    @Override
    public void addListeners() {
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