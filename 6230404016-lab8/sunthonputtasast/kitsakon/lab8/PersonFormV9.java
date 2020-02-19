/**
 * Create class PersonFormV9 extends PersonFormV8 and implements ListSelectionListener.
 * Author: Kitsakon Sunthonputtasast
 * ID: 623040401-6 Sec: 1 Date: February 17, 2020
 */

package sunthonputtasast.kitsakon.lab8;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class PersonFormV9 extends PersonFormV8 implements ListSelectionListener {

    private static final long serialVersionUID = -3445606034458899067L;

    private static final String defaultFrameTitle = "Person Form V9";

    public PersonFormV9() {
        super(defaultFrameTitle);
    }

    public PersonFormV9(String frameTitle) {
        super(frameTitle);
    }

    @Override
    public void valueChanged(ListSelectionEvent event) {

        String message = "Selected Hobbies : ";
        int[] hobbiesIndices = hobbieList.getSelectedIndices();

        // message + hobbie item that you selected.
        for (int index : hobbiesIndices)
            message += hobbie[index] + " ";
        JOptionPane.showMessageDialog(this, message, "Person Information", JOptionPane.INFORMATION_MESSAGE,
                new ImageIcon(getClass().getResource("image/java.jpg")));

    }

    // method for add listener.
    @Override
    public void addListeners() {
        super.addListeners();

        hobbieList.addListSelectionListener(this);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        PersonFormV9 PersonFormV9 = new PersonFormV9("Person Form V9");
        PersonFormV9.addComponents();
        PersonFormV9.addMenus();
        PersonFormV9.addListeners();
        PersonFormV9.setFrameFeatures();
    }

}