import javax.swing.*;

public class Calculator {
    public int Add(int a, int b) {
        return a + b;
    };
    public int Substract(int a, int b) {
        return a - b;
    };
    public int Mult(int a, int b) {
        return a * b;
    };
    public int Div(int a, int b) {
        //return a / b;
        try {
            return a / b;
        } catch (Exception ArithmeticException) {
            System.out.println("Оленина");
            //JOptionPane.showMessageDialog(null, "Jo");
        } return b;

    }
}



