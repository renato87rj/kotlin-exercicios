package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {
    private JPanel rootPanel;
    private JButton buttonNewContacts;
    private JButton buttonRemove;
    private JTable tableContacts;

    public MainForm() {
        setContentPane(rootPanel);
        setSize(500, 250);
        setVisible(true);

        setListener();
    }

    private void setListener() {
        buttonNewContacts.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new ContentForm();
                dispose();
            }
        });
    }
}
