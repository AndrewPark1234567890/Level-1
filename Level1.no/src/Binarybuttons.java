import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Binarybuttons implements ActionListener {
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JButton button1 = new JButton("16");
	JButton button2 = new JButton("8");
	JButton button3 = new JButton("4");
	JButton button4 = new JButton("2");
	JButton button5 = new JButton("1");
	JButton button6 = new JButton("UP");
	JButton buttonFlip = new JButton("DOWN");
	JLabel done = new JLabel("score");
	int score = 31;

	public static void main(String[] args) {

		Binarybuttons converter = new Binarybuttons();
		converter.createUi();
	}

	void createUi() {

		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(buttonFlip);
		done.setText(score + "       ");
		panel.add(done);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		buttonFlip.addActionListener(this);
		frame.add(panel);
		frame.setSize(500, 500);
		frame.setLocation(750, 500);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonClicked = (JButton) e.getSource();
		if (button1 == buttonClicked) {
			if (button1.getText().equals("_")) {
				button1.setText("16");
				score = score + 16;
			} else {
				button1.setText("_");
				score = score - 16;
			}
		}

		if (button2 == buttonClicked) {
			if (button2.getText().equals("_")) {
				button2.setText("8");
				score = score + 8;
			} else if (button2.getText().equals("8")) {
				button2.setText("_");
				score = score - 8;
			}
		}

		if (button3 == buttonClicked) {
			if (button3.getText().equals("_")) {
				button3.setText("4");
				score = score + 4;
			} else {
				button3.setText("_");
				score = score - 4;
			}
		}
		if (button4 == buttonClicked) {
			if (button4.getText().equals("_")) {
				button4.setText("2");
				score = score + 2;
			} else {
				button4.setText("_");
				score = score - 2;
			}
		}
		if (button5 == buttonClicked) {
			if (button5.getText().equals("_")) {
				button5.setText("1");
				score = score + 1;
			} else {
				button5.setText("_");
				score = score - 1;
			}
		}
		if (button6 == buttonClicked) {
			button1.setText("16");
			button2.setText("8");
			button3.setText("4");
			button4.setText("2");
			button5.setText("1");
			score = 31;
		}
		if (buttonFlip == buttonClicked) {
			button1.setText("_");
			button2.setText("_");
			button3.setText("_");
			button4.setText("_");
			button5.setText("_");
			score = 0;
		}
		done.setText(score + "     ");
	}
}