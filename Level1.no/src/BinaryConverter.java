import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JButton b1 = new JButton("Convert");
	JTextField input = new JTextField(20);
	JTextField answer = new JTextField(20);

	public static void main(String[] args) {

		BinaryConverter binary = new BinaryConverter();
		binary.createUi();
	}

	void createUi() {
		JOptionPane.showMessageDialog(null,
				"Put the binary of the letter you want to convert on the left then click convert."
						+ " The letter will appear on the right.  Enjoy. :D");
		panel.add(input);
		panel.add(b1);
		b1.addActionListener(this);
		panel.add(answer);
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(700, 150);
		frame.setLocation(1000, 500);
	}

	String convert(String binary) {
		int ascii = Integer.parseInt(binary, 2);
		char theLetter = (char) ascii;
		return "" + theLetter;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("Button Clicked :D I am great.");
		System.out.println("Input: " + input.getText());
		String letter = convert(input.getText());
		answer.setText(letter);
		System.out.println("letter: " + letter);

	}

}
