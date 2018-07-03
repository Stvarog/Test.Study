import javax.swing.*;
        import java.awt.*;

public class Panel {
    public static void main(String[] args) {
        JFrame panelCalc = new JFrame("Калькулятор");
        panelCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panelCalc.setContentPane(panel);
        panelCalc.setSize(500, 500);


    }
}
