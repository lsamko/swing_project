package Swing;

import javax.swing.*;
import java.awt.*;

public class project {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500, 500);
        JTextField textField = new JTextField("Que 1 :");
        JRadioButton intButton = new JRadioButton("int");
        JRadioButton floatButton = new JRadioButton("Float");
        JRadioButton booleanButton = new JRadioButton("boolean");
        JRadioButton charButton = new JRadioButton("char");
        jFrame.getContentPane().add(BorderLayout.PAGE_START,textField);
        jFrame.getContentPane().add(BorderLayout.LINE_START, intButton);
        jFrame.getContentPane().add(BorderLayout.BEFORE_FIRST_LINE, floatButton);
        jFrame.getContentPane().add(BorderLayout.BEFORE_LINE_BEGINS,booleanButton);
        jFrame.getContentPane().add(BorderLayout.LINE_END,charButton);


        JButton button = new JButton("Next");
        jFrame.getContentPane().add(BorderLayout.PAGE_END, button);
        jFrame.setVisible(true);

        JTextArea ta = new JTextArea();

    }
}
