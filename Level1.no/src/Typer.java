import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Typer implements KeyListener {
	JFrame frame = new JFrame("Aint no one gonna type faster than my 4 wpm");
	char currentLetter = generateRandomLetter();
	JLabel label = new JLabel("Letter");

	public static void main(String[] args) {
		Typer types = new Typer();
		types.createui();
	}

	void createui() {
		// TODO Auto-generated method stub
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setText(currentLetter + "");
		frame.add(label);
		frame.addKeyListener(this);
		frame.pack();
		frame.setLocation(500, 250);
		frame.setSize(500, 500);
		frame.setVisible(true);

	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You typed: " + e.getKeyChar());
		if (e.getKeyChar() == currentLetter) {
			System.out.println("Correct :D");
			frame.getContentPane().setBackground(Color.GREEN);
		}
		if (e.getKeyChar() != currentLetter) {
			System.out.println("WRONG!");
			frame.getContentPane().setBackground(Color.RED);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText(currentLetter + "");
	}
}
// private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
// Date timeAtEnd = new Date(1);
// long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
// long gameInSeconds = (gameDuration / 1000) % 60;
// double charactersPerSecond = ((double) numberOfCorrectCharactersTyped /
// (double) gameInSeconds);
// int charactersPerMinute = (int) (charactersPerSecond * 60);
// JOptionPane.showMessageDialog(null, "Your typing speed is " +
// charactersPerMinute + " characters per minute.");
// }
// Date timeAtStart = new Date(1);
//
// }
