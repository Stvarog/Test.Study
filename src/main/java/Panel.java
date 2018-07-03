import com.sun.tracing.dtrace.FunctionName;

import javax.swing.*;
        import java.awt.*;
//https://math.sgu.ru/sites/chairs/prinf/materials/java/lesson8.htm
public class Panel {
    public static void main(String[] args) {
        //добавление панели
        JFrame panelCalc = new JFrame("Калькулятор");
        panelCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelCalc.setVisible(true);
        JPanel panel = new JPanel();
        //табличное размещение кнопок
        panel.setLayout(new GridLayout(3,5,5, 5));
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("0"));
        panel.add(new JButton("+"));
        panel.add(new JButton("-"));
        panel.add(new JButton("/"));
        panel.add(new JButton("*"));
        panel.add(new JButton("="));
        panelCalc.setContentPane(panel);
        panelCalc.setSize(300, 300);

    }
}
