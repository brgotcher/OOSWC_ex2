package controller;

import model.MyCircle;
import model.MyRect;
import model.MyShape;
import view.MyWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddButtonListener implements ActionListener {

    private MyWindow win;
    private JTextArea display;
    private JRadioButton[] shapesButtons;
    private JTextField xField;
    private JTextField yField;
    private JTextField v1Field;
    private JTextField v2Field;

    public AddButtonListener(MyWindow win) {
        this.win = win;
        display = win.getDisplay();
        shapesButtons = win.getShapeButtons();
        xField = win.getxField();
        yField = win.getyField();
        v1Field = win.getv1Field();
        v2Field = win.getv2Field();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        MyShape shape = null;

        if (shapesButtons[0].isSelected()) { //circle
            String xVal = xField.getText();
            String yVal = yField.getText();
            String rVal = v1Field.getText();
            float x, y;
            double r;

            try {
                x = Float.parseFloat(xVal);
                y = Float.parseFloat(yVal);
                r = Double.parseDouble(rVal);
            } catch (NumberFormatException ex) {
                display.setText("Wrong number format: x, y, r");
                return;
            }

            shape = new MyCircle(x, y, r);
        } else if (shapesButtons[1].isSelected()) { //rectangle
            String xVal = xField.getText();
            String yVal = yField.getText();
            String wVal = v1Field.getText();
            String hVal = v2Field.getText();
            float x, y;
            double w, h;

            try {
                x = Float.parseFloat(xVal);
                y = Float.parseFloat(yVal);
                w = Double.parseDouble(wVal);
                h = Double.parseDouble(hVal);
            } catch (NumberFormatException ex) {
                display.setText("Wrong number format: x, y, w, h");
                return;
            }

            shape = new MyRect(x, y, h, w);
        }

        if (shape != null) {
            Main.shapes.add(shape);

            String m = display.getText();
            String newMessage = String.format("%s\nAdded: %s", m, shape);
            display.setText(newMessage);
        }
    }

}
