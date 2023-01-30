import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame{
    public Frame() {
        JFrame f = new JFrame();
        f.setTitle("Add Image");
        f.setLayout(null); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        f.setSize(509,339);
        f.setUndecorated(true);
        Container c = f.getContentPane(); 
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon("/Users/school/Downloads/planets.jpeg"));
        Dimension size = label.getPreferredSize(); 
        label.setBounds(0, 0, size.width, size.height); 
        JTextField gField = new JTextField("Gravitational Constant");
        JTextField mOneField = new JTextField("Mass of planet (in kilograms)");
        JTextField mTwoField = new JTextField("Mass of item (in kilograms)");
        JTextField rField = new JTextField("Planets radius (in meteres)");
        JTextField temp = new JTextField("The gravitational force (do not edit)");
        JButton calculate = new JButton("Calculate");
        mOneField.setBounds(40, 80, 200, 38);
        mTwoField.setBounds(40, 120, 200, 38);
        rField.setBounds(40, 160, 200, 38);
        gField.setBounds(40, 40, 200, 38);
        calculate.setBounds(40,200,100,38);
        temp.setBounds(40,240,300,38);
        f.add(gField);
        f.add(mOneField);
        f.add(mTwoField);
        f.add(rField);
        f.add(calculate);
        f.add(temp);
        calculate.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent arg0) {
                String gValue = gField.getText();
                String mOneValue = mOneField.getText();
                String mTwoValue = mTwoField.getText();
                String rFieldValue = rField.getText();
                int gInt = Integer.parseInt(gValue);
                int mOneInt = Integer.parseInt(mOneValue);
                int mTwoInt = Integer.parseInt(mTwoValue);
                int rInt = Integer.parseInt(rFieldValue);
                int rSquared = (rInt * rInt);
                int multiply = (gInt * mOneInt * mTwoInt);
                int divide = (multiply / rSquared);
                JTextField total = new JTextField("The gravitational force is: " + divide);
                total.setBounds(40,240,300,38);
                f.remove(temp);
                f.remove(label);
                f.add(total);
                f.add(label);
            }
        });
        //last things
        c.add(label); 
        f.setVisible(true);
    }
    }
