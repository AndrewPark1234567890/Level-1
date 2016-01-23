import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DeepThoughtCalculator implements ActionListener {
	JTextField input1 = new JTextField("Input 1", 22);
	JTextField input2 = new JTextField("Input 2", 22);
	JButton b1 = new JButton("Add");
	JButton b2 = new JButton("Subtract");
	JButton b3 = new JButton("Multiply");
	JButton b4 = new JButton("Divide");
	JFrame frame = new JFrame("Calculator");
	JPanel panel = new JPanel();
	JLabel answer = new JLabel("Answer");
	JButton equals = new JButton("=");
	JTextField tj = new JTextField("Thank TJ for the exellent color choice. :)",50);

	public static void main(String[] args) {
		DeepThoughtCalculator calc = new DeepThoughtCalculator();
		calc.createUI();

	}

	public void createUI() {
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		panel.add(input1);
		panel.add(input2);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(answer);
		panel.add(tj);
		panel.setBackground(Color.YELLOW);
		frame.add(panel);
		frame.setSize(600, 180);
		frame.setLocation(500, 200);
		frame.setBackground(Color.YELLOW);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String textOne = input1.getText();
		double doubleOne = Double.parseDouble(textOne);
		String textTwo = input2.getText();
		double doubleTwo = Double.parseDouble(textTwo);
		JButton button4 = (JButton) e.getSource();
		if (b1 == button4) {
			answer.setText(add(doubleOne, doubleTwo) + "");
		}
		if (b2 == button4) {
			double ans = subtract(doubleOne, doubleTwo);
			answer.setText(ans + "");
		}
		if (b3 == button4) {
			double ans = multiply(doubleOne, doubleTwo);
			answer.setText(ans + "");
		}
		if (b4 == button4) {
			double ans = divide(doubleOne, doubleTwo);
			answer.setText(ans + "");
		}
	}

	public double divide(double doubleOne, double doubleTwo) {
		double ans = doubleOne / doubleTwo;
		return ans;
	}

	public double multiply(double doubleOne, double doubleTwo) {
		double ans = doubleOne * doubleTwo;
		return ans;
	}

	public double subtract(double doubleOne, double doubleTwo) {
		double ans = doubleOne - doubleTwo;
		return ans;
	}

	public double add(double doubleOne, double doubleTwo) {
		return doubleOne + doubleTwo;
	}

}
