/**
 * PersonFormV7
 */

package sunthonputtasast.kitsakon.lab8;



import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PersonFormV10 extends PersonFormV9  {

    private static final long serialVersionUID = -3445606034458899067L;

    private static final String defaultFrameTitle = "Person Form V10";

    public PersonFormV10() {
        super(defaultFrameTitle);
    }

    public PersonFormV10(String frameTitle) {
        super(frameTitle);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        super.actionPerformed(event);

        Object obj = event.getSource();
        if (obj == redMenuItem) {
            setColor(Color.red);
        } else if (obj == greenMenuItem) {
            setColor(Color.green);
        } else if (obj == blueMenuItem) {
            setColor(Color.blue);
        }

        if (obj == size16MenuItem) {
            setSize(16);
        } else if (obj == size20MenuItem) {
            setSize(20);
        } else if (obj == size24MenuItem) {
            setSize(24);
        }

    }

    public void setColor(Color color) {
        this.nameTextField.setForeground(color);
        this.heightTextField.setForeground(color);
        this.weightTextField.setForeground(color);
        this.dobTextField.setForeground(color);
        this.noteTextArea.setForeground(color);
    }

    public void setSize(int size) {
        Font font = new Font(Font.SERIF, Font.BOLD, size);
        this.nameTextField.setFont(font);
        this.heightTextField.setFont(font);
        this.weightTextField.setFont(font);
        this.dobTextField.setFont(font);
        this.noteTextArea.setFont(font);
    }

    public void addKeys() {
        
        this.redMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        this.greenMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
        this.blueMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        this.size16MenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.CTRL_MASK));
        this.size20MenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0, ActionEvent.CTRL_MASK));
        this.size24MenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4, ActionEvent.CTRL_MASK));

        this.redMenuItem.setMnemonic(KeyEvent.VK_R);
        this.greenMenuItem.setMnemonic(KeyEvent.VK_G);
        this.blueMenuItem.setMnemonic(KeyEvent.VK_B);
        this.size16MenuItem.setMnemonic(KeyEvent.VK_1);
        this.size20MenuItem.setMnemonic(KeyEvent.VK_0);
        this.size24MenuItem.setMnemonic(KeyEvent.VK_4);
        this.colorMenuItem.setMnemonic(KeyEvent.VK_L);
        this.sizeMenuItem.setMnemonic(KeyEvent.VK_Z);
    }

    @Override
    public void addListeners() {
        super.addListeners();

        redMenuItem.addActionListener(this);
        greenMenuItem.addActionListener(this);
        blueMenuItem.addActionListener(this);
        size16MenuItem.addActionListener(this);
        size20MenuItem.addActionListener(this);
        size24MenuItem.addActionListener(this);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        PersonFormV10 PersonFormV10 = new PersonFormV10("Person Form V10");
        PersonFormV10.addComponents();
        PersonFormV10.addMenus();
        PersonFormV10.addListeners();
        PersonFormV10.addKeys();
        PersonFormV10.setFrameFeatures();
    }

}