/**
 * Create class  PersonFormV13 extends PersonFormV12
 * Author: Kitsakon Sunthonputtasast
 * ID: 623040401-6 Sec: 1 Date: March 9, 2020
 */
package sunthonputtasast.kitsakon.lab10;

import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class PersonFormV13 extends PersonFormV12 {

    private static final long serialVersionUID = -4712686247129137845L;

    protected static final double MIN_HEIGHT = 100f, MAX_HEIGHT = 250f, MIN_WEIGHT = 40f, MAX_WEIGHT = 150f,
            MIN_DAY = 1f, MAX_DAY = 31f, MIN_MONTH = 1f, MAX_MONTH = 12f, MIN_YEAR = 1900f, MAX_YEAR = 2010f;

    public PersonFormV13(String frameTitle) {
        super(frameTitle);

    }

    // chech if number greater than min and less than max, For use in checkValid
    // method
    protected boolean checkDecimalException(double number, double min, double max) {
        return number >= min && number <= max;
    }

    // method for check if each text field are empty or not
    protected boolean checkValid() {
        String message = "";

        // check name.
        if (nameTxtField.getText().equals("")) {
            message += "Please enter name.\n";
        }

        // check height.
        if (heightTxtField.getText().equals("")) {
            message += "Please enter only numeric input for height.\n";
        } else {
            try {
                double height = Double.parseDouble(heightTxtField.getText());
                if (!checkDecimalException(height, MIN_HEIGHT, MAX_HEIGHT)) {
                    message += String.format("Valid values for height are [%.2f, %.2f]\n", MIN_HEIGHT, MAX_HEIGHT);
                }
            } catch (NumberFormatException e) {
                message += "Please enter only numeric input for height.\n";
            }
        }

        // check weight.
        if (weightTxtField.getText().equals("")) {
            message += "Please enter only numeric input for weight.\n";
        } else {
            try {
                double weight = Double.parseDouble(weightTxtField.getText());
                if (!checkDecimalException(weight, MIN_WEIGHT, MAX_WEIGHT)) {
                    message += String.format("Valid values for weight are [%.2f, %.2f]\n", MIN_WEIGHT, MAX_WEIGHT);
                }
            } catch (NumberFormatException e) {
                message += "Please enter only numeric input for weight.\n";
            }
        }

        // check date of birth.
        if (dobTxtField.getText().equals("")) {
            message += "Please enter date.\n";
        } else {
            String[] split = dobTxtField.getText().split("-");

            try {
                double day = Double.parseDouble(split[0]);
                double month = Double.parseDouble(split[1]);
                double year = Double.parseDouble(split[2]);

                if (!checkDecimalException(day, MIN_DAY, MAX_DAY)) {
                    message += String.format("Valid values for day are [%.2f, %.2f]\n", MIN_DAY, MAX_DAY);
                }
                if (!checkDecimalException(month, MIN_MONTH, MAX_MONTH)) {
                    message += String.format("Valid values for month are [%.2f, %.2f]\n", MIN_MONTH, MAX_MONTH);
                }
                if (!checkDecimalException(year, MIN_YEAR, MAX_YEAR)) {
                    message += String.format("Valid values for year are [%.2f, %.2f]\n", MIN_YEAR, MAX_YEAR);
                }
            } catch (NumberFormatException e) {
                message += "Please enter date.\n";
            }
        }

        if (message.equals(""))
            return true;

        JOptionPane.showMessageDialog(this, message, "Massage", JOptionPane.INFORMATION_MESSAGE,
                new ImageIcon(getClass().getResource("images/java.png")));
        return false;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object src = e.getSource();

        if (src == okButton) {
            if (!checkValid()) {
                return;
            }
        }

        super.actionPerformed(e);

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