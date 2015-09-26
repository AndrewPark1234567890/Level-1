import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin implements ActionListener {
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JButton b1 = new JButton("Convert");
	JTextField input = new JTextField(20);
	JTextField answer = new JTextField(20);
PigLatinTranslator Plt = new PigLatinTranslator();
	public static void main(String[] args) {

		PigLatin binary = new PigLatin();
		binary.createUi();
	}

	void createUi() {
		JOptionPane.showMessageDialog(null,
				"Put the word you want to convert on the left then click convert."
						+ " The word will appear on the right.  Enjoy. :D");
		panel.add(input);
		panel.add(b1);
		b1.addActionListener(this);
		panel.add(answer);
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(700, 150);
		frame.setLocation(1000, 500);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("Button Clicked :D I am great.");
		Plt.translate(input.getText());
		System.out.println("Input: " + input.getText());
		String word = Plt.translate(input.getText());
		answer.setText(word);
		System.out.println("word: " + word);

	}

}
