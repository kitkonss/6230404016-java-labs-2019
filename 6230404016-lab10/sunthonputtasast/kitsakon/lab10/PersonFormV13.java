package sunthonputtasast.kitsakon.lab10;

import javax.swing.SwingUtilities;

/**
 * PersonFormV13
 */
public class PersonFormV13 extends PersonFormV12 {

    private static final long serialVersionUID = -4712686247129137845L;

    public PersonFormV13(String frameTitle) {
        super(frameTitle);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        PersonFormV13 personV13 = new PersonFormV13("Person Form V13");
        personV13.addComponents();
        personV13.addMenus();
        personV13.addListeners();
        personV13.addKeys();
        personV13.setFrameFeatures();
    }

}