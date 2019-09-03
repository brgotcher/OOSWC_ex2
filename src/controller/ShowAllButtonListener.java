package controller;

import view.MyWindow;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowAllButtonListener implements ActionListener {

    private MyWindow win;

    public ShowAllButtonListener(MyWindow win) {
        this.win = win;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
