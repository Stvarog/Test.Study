import com.sun.glass.ui.SystemClipboard;
import com.sun.org.apache.xpath.internal.functions.FuncSum;

import javax.swing.*;
import javax.swing.plaf.PanelUI;
import java.awt.*;
import java.util.Set;

import static java.lang.System.console;
import static java.lang.System.out;

public class Program {
    public static void main (String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.Add(3,5));
        System.out.println(calculator.Substract(3,5));
        System.out.println(calculator.Mult(3,5));
        System.out.println(calculator.Div(3,0));
        /*try {
            int a = 2;
            int b = 0;
            System.out.println(a + b);
            System.out.println(a * b);
            System.out.println(b - a);
            System.out.println(a / b);
        } catch (Exception error){JOptionPane.showMessageDialog(null, "Учи математику! Олень!!!");
        }*/
    }
}