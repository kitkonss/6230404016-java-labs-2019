package sunthonputtasast.kitsakon.lab10;

import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
import java.io.File;

import sunthonputtasast.kitsakon.lab8.*;

public class PersonFormV11 extends PersonFormV10 {

    private static final long serialVersionUID = -1470648978794920508L;

    protected JMenuItem customItem;
    protected JColorChooser colorChooser;
    protected JFileChooser fileChooser;
    protected JDialog chooserDialog;
    protected ActionListener okListener, cancelListener;

    public PersonFormV11(String frameTitle) {
        super(frameTitle);

    }

    @Override
    protected void addSubMenus() {
        super.addSubMenus();

        colorMenu.add(customItem);

    }

    @Override
    public void addListeners() {
        super.addListeners();

        customItem.addActionListener(this);
        fileChooser.addActionListener(this);
        openMI.addActionListener(this);
        saveMI.addActionListener(this);
        exitMI.addActionListener(this);

    }

    protected void openFileDialog() {
        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {

            File file = fileChooser.getSelectedFile();
            String fileName = file.getName();
            JOptionPane.showMessageDialog(this, String.format("Opening file %s", fileName));
        } else if (result == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(this, "Open command cencelled by user.");
        }
    }

    protected void saveFileDialog() {
        int result = fileChooser.showSaveDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {

            File file = fileChooser.getSelectedFile();
            String fileName = file.getName();
            JOptionPane.showMessageDialog(this, String.format("Saving file %s", fileName));
        } else if (result == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(this, "Save command cencelled by user.");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);

        Object obj = e.getActionCommand();

        if (obj == customItem.getActionCommand()) {
            Color defaultColor = nameTxtField.getForeground();
            Color colorChooser = JColorChooser.showDialog(this, "Choose Color", defaultColor);
            if (colorChooser != null) {
                nameTxtField.setForeground(colorChooser);
                heightTxtField.setForeground(colorChooser);
                weightTxtField.setForeground(colorChooser);
                dobTxtField.setForeground(colorChooser);
                reviewTxtArea.setForeground(colorChooser);
            }
        }

        Object source = e.getSource();
        if (source == openMI) {
            openFileDialog();
        } else if (source == saveMI) {
            saveFileDialog();
        } else if (source == exitMI) {
            System.exit(0);
        }
    }

    @Override
    protected void addComponents() {

        super.addComponents();

        customItem = new JMenuItem("Custom");

        fileChooser = new JFileChooser();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        PersonFormV11 PersonFormV11 = new PersonFormV11("Person Form V11");

        PersonFormV11.addComponents();
        PersonFormV11.addMenus();
        PersonFormV11.addKeys();
        PersonFormV11.addListeners();
        PersonFormV11.setFrameFeatures();
    }

}
