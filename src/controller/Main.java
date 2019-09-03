package controller;

import model.MyCircle;
import model.MyRect;
import model.MyShape;
import view.MyWindow;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        test();

        MyWindow win = new MyWindow();
        win.init();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);

    }

    static void test() {

        MyShape[] shapes = new MyShape[10];

        for (int i = 0; i < 5; i++) {
            shapes[i] = new MyRect(i,i,i,i);
        }

        for (int i = 5; i < 10; i++) {
            shapes[i] = new MyCircle(i,i,i);
        }

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]); // "" + s.toString()
        }
    }
}
