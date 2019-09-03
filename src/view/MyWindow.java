package view;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {

    private JTextArea display = new JTextArea("Welcome to MyShapes");
    private JRadioButton[] shapeButtons = new JRadioButton[2];
    private JTextField xField = new JTextField(7);
    private JTextField yField = new JTextField(7);
    private JTextField v1Field = new JTextField(7);
    private JTextField v2Field = new JTextField(7);
    private JButton addButton = new JButton("Add a shape");
    private JButton showAllButton = new JButton("Show all shapes");

    public void init() {
        setSize(700, 300);
        setLocation(200, 100);
        setTitle("MyShapes demo");

        Container cp = getContentPane();
        JScrollPane scrollPane = new JScrollPane(
                display,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        cp.add(BorderLayout.CENTER, scrollPane);

        JPanel bottomPane = new JPanel();
        cp.add(BorderLayout.SOUTH, bottomPane);
        bottomPane.setLayout(new GridLayout(3,1));

        shapeButtons[0] = new JRadioButton("MyCircle");
        shapeButtons[1] = new JRadioButton("MyRect");
        JPanel radioPanel = new JPanel();
        ButtonGroup radioGroup = new ButtonGroup();
        for (int i = 0; i < shapeButtons.length; i++) {
            radioPanel.add(shapeButtons[i]);
            radioGroup.add(shapeButtons[i]);
        }
        bottomPane.add(radioPanel);

        JPanel valuePane = new JPanel();
        valuePane.add(new JLabel("x:"));
        valuePane.add(xField);
        valuePane.add(new JLabel("y:"));
        valuePane.add(yField);
        valuePane.add(new JLabel("w(r):"));
        valuePane.add(v1Field);
        valuePane.add(new JLabel("h"));
        valuePane.add(v2Field);
        bottomPane.add(valuePane);

        JPanel buttonPane = new JPanel();
        buttonPane.add(addButton);
        buttonPane.add(showAllButton);
        bottomPane.add(buttonPane);



        }

}

