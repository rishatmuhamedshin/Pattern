package ru.muhamedshin.RealBook.OBSERVER;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    private void go() {
        frame = new JFrame();

        JButton jButton = new JButton("Should I do it?");
        jButton.addActionListener(e -> System.out.println("Don't do it, you might regret it!"));
        jButton.addActionListener(e -> System.out.println("Come on, do it!"));

        frame.add(jButton);

        frame.setSize(500, 500);
        frame.setVisible(true);
    }

}
