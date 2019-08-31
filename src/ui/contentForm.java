package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class contentForm extends JFrame{
    private JPanel rootPanel;
    private JTextField textName;
    private JTextField textFone;
    private JButton buttonCancel;
    private JButton buttonSave;

    public contentForm() {
        setContentPane(rootPanel);
        setSize(500, 250);
        setVisible(true);

        setListener();
    }

    private void setListener() {
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        buttonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new mainForm();
                dispose();
            }
        });
    }
}
