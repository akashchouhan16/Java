import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Four extends Applet implements ActionListener {
    TextField input, output;
    Button compute;
    int fact = 0;

    public void init() {
        compute = new Button("Compute");
        Label inp = new Label("Enter any number :", Label.RIGHT);
        Label opt = new Label("Factorial of the given number is : ", Label.RIGHT);
        input = new TextField(5);
        output = new TextField(10);
        input.setBackground(Color.pink);
        output.setBackground(Color.pink);
        add(inp);
        add(input);
        add(opt);
        add(output);
        add(compute);
        output.setText("0");
        output.setEditable(false);
        input.addActionListener(this);
        output.addActionListener(this);
        compute.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str.equals("Compute")) {
            fact = 1;
            int n = Integer.parseInt(input.getText());
            if (n <= 12) {
                for (int i = n; i >= 2; i--)
                    fact = fact * i;
                output.setText("" + fact);
            } else
                fact = -1;

        }
        repaint();

    }

    public void paint(Graphics g) {
        if (fact == -1) {
            output.setText("0");
            g.drawString("Sorry number exceeds greater than 12", 10, 100);
        }
    }
}