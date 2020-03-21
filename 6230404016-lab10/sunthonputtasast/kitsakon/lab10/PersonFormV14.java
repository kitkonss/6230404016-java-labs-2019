/**
 * Create class  PersonFormV13 extends PersonFormV12
 * Author: Kitsakon Sunthonputtasast
 * ID: 623040401-6 Sec: 1 Date: March 9, 2020
 */
package sunthonputtasast.kitsakon.lab10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class PersonFormV14 extends PersonFormV13 {

    private static final long serialVersionUID = 1L;

    public PersonFormV14(String frameTitle) {
        super(frameTitle);

    }

    @Override
    protected void openFileDialog() {
        super.openFileDialog();

        File file = fileChooser.getSelectedFile();
        try {
            Scanner fileReader = new Scanner(file);
            String data = "";

            // Read file.
            while (fileReader.hasNextLine()) {
                data += fileReader.nextLine() + "\n";
            }
            fileReader.close();

            // Show data.
            JOptionPane.showMessageDialog(this, data, "Message", JOptionPane.INFORMATION_MESSAGE,
                    new ImageIcon(getClass().getResource("images/java.png")));

                    //show message 'file not found'
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "File not found.", "Message", JOptionPane.INFORMATION_MESSAGE,
                    new ImageIcon(getClass().getResource("images/java.png")));
        }
    }

    @Override
    protected void saveFileDialog() {
        super.saveFileDialog();

        File file = fileChooser.getSelectedFile();
        try {
            FileWriter fw = new FileWriter(file);

            // write string from personList in data.
            for (String person : personList) {
                fw.write(person.toString() + "");
            }

            fw.close();
        } catch (IOException e) {
            System.out.println("An error occured");
        }

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        PersonFormV14 personV14 = new PersonFormV14("Person Form V13");
        personV14.addComponents();
        personV14.addMenus();
        personV14.addListeners();
        personV14.addKeys();
        personV14.setFrameFeatures();
    }
}