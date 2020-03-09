package sunthonputtasast.kitsakon.lab10;

import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class PersonFormV12 extends PersonFormV11 {

    private static final long serialVersionUID = -7890266576520375763L;

    protected JMenu dataMenu;
    protected JMenuItem displayMenuItem, sortMenuItem, searchMenuItem, removeMenuItem;
    protected List<String> personList;
    protected Map<String, String> personMap;

    public PersonFormV12(String frameTitle) {
        super(frameTitle);

    }

    protected void handleOkButton() {
        String info = getInfoFromForm();
        String person = addPerson();
        personList.add(person);
        personMap.put(nameTxtField.getText(), person);
        
        JOptionPane.showMessageDialog(this, info + "\n\nAdding this person onto the list:" + person,
                "Person Information", JOptionPane.INFORMATION_MESSAGE);

    }

    protected String addPerson() {
        double weight = Double.parseDouble(weightTxtField.getText());
        double height = Double.parseDouble(heightTxtField.getText());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dob = LocalDate.parse(dobTxtField.getText(), formatter);
        Person person = new Person(nameTxtField.getText(), weight, height, dob);
        return person.toString();

    }

    protected void handleDisplayMI() {
        JOptionPane.showMessageDialog(this, personList, "Message", JOptionPane.INFORMATION_MESSAGE);
    }

    protected void handleSortMI() {
        Collections.sort(personList);
        JOptionPane.showMessageDialog(this, personList, "Message", JOptionPane.INFORMATION_MESSAGE);
    }

    protected void handleSearchMI() {
        String name = JOptionPane.showInputDialog("Please enter a person name to search:");
        if (personMap.containsKey(name)) {
            JOptionPane.showMessageDialog(this, personMap.get(name), "Message", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, name + " is not found", "Message", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    protected void handleRemoveMI() {
        String name = JOptionPane.showInputDialog("Please enter a person name to remove:");
        if (personMap.containsKey(name)) {
            String person = personMap.get(name);
            JOptionPane.showMessageDialog(this, personMap.get(name), "is romoved.", JOptionPane.INFORMATION_MESSAGE);
            personList.remove(person);
            personMap.remove(name);
        } else {
            JOptionPane.showMessageDialog(this, name + " is not found", "Message", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);

        Object src = e.getSource();

        if (src == displayMenuItem) {
            handleDisplayMI();
        } else if (src == sortMenuItem) {
            handleSortMI();
        } else if (src == searchMenuItem) {
            handleSearchMI();
        } else if (src == removeMenuItem) {
            handleRemoveMI();
        }
    }

    @Override
    public void addListeners() {
        super.addListeners();

        dataMenu.addActionListener(this);
        displayMenuItem.addActionListener(this);
        sortMenuItem.addActionListener(this);
        searchMenuItem.addActionListener(this);
        removeMenuItem.addActionListener(this);
    }

    @Override
    protected void addMenus() {
        super.addMenus();

        dataMenu = new JMenu("Data");
        displayMenuItem = new JMenuItem("Display");
        sortMenuItem = new JMenuItem("Sort");
        searchMenuItem = new JMenuItem("Search");
        removeMenuItem = new JMenuItem("Remove");

        dataMenu.add(displayMenuItem);
        dataMenu.add(sortMenuItem);
        dataMenu.add(searchMenuItem);
        dataMenu.add(removeMenuItem);
        menuBar.add(dataMenu);
    }

    @Override
    protected void addComponents() {

        super.addComponents();

        this.personList = new ArrayList<String>();
        this.personMap = new HashMap<String, String>();

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        PersonFormV12 personV12 = new PersonFormV12("Person Form V12");
        personV12.addComponents();
        personV12.addMenus();
        personV12.addListeners();
        personV12.addKeys();
        personV12.setFrameFeatures();
    }

}