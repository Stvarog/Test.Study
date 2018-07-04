import com.sun.javafx.iio.ImageFrame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

/*public class Display {
    public static void main(String [] args) {
        DisplayMode dispCalc = new DisplayMode(100, 100, 10, DisplayMode.REFRESH_RATE_UNKNOWN );

        Image image = ImageIO.
        ImageFrame panelDisp;
        panelDisp = new ImageFrame("Disp");
        panelDisp.getHeight(100);
        panelDisp.getWidth(100);
        panelDisp.setPixelScale(100, 100);

    }
}*/
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Display extends JFrame{
    int k;
    String i;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bPlus,bMinus;
    JTextField t1,t2;
    JLabel l1,l2;
    eHandler handler = new eHandler();

    public Display(String s){
        super(s);
        setLayout(new FlowLayout());
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("10");
        bPlus = new JButton();
        bMinus = new JButton();
        t1 = new JTextField(10);
        add(t1);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b0);
        b1.addActionListener(handler);
        b2.addActionListener(handler);
        b3.addActionListener(handler);
        b4.addActionListener(handler);
        b5.addActionListener(handler);
        b6.addActionListener(handler);
        b7.addActionListener(handler);
        b8.addActionListener(handler);
        b9.addActionListener(handler);
        b0.addActionListener(handler);
    }
    public class eHandler implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            try{
                if(e.getSource() == b1){
                    i = t1.getText();
                    i = i + "1";
                    l1.setText(i);
                }
                if(e.getSource() == b2){
                    i = t1.getText();
                    i = i + "2";
                    l1.setText(i);
                }
                if(e.getSource() == b3){
                    i = t1.getText();
                    i = i + "3";
                    l1.setText(i);
                }
                if(e.getSource() == b4){
                    i = t1.getText();
                    i = i + "4";
                    l1.setText(i);
                }
                if(e.getSource() == b5){
                    i = t1.getText();
                    i = i + "5";
                    l1.setText(i);
                }
                if(e.getSource() == b6){
                    i = t1.getText();
                    i = i + "6";
                    l1.setText(i);
                }
                if(e.getSource() == b7){
                    i = t1.getText();
                    i = i + "7";
                    l1.setText(i);
                }
                if(e.getSource() == b8){
                    i = t1.getText();
                    i = i + "8";
                    l1.setText(i);
                }
                if(e.getSource() == b9){
                    i = t1.getText();
                    i = i + "9";
                    l1.setText(i);
                }
                if(e.getSource() == b0){
                    i = t1.getText();
                    i = i + "0";
                    l1.setText(i);
                }

            } catch(Exception error){JOptionPane.showMessageDialog(null, "Ошибка");}
        }
    }
}