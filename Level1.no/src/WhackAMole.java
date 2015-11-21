import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame Whack = new JFrame("Whack for the glory of your nation!");
	JPanel Wpane = new JPanel();

	public static void main(String[] args) {
		WhackAMole one = new WhackAMole();
		one.createUI();
		one.drawButtons();
	}

	public void drawButtons() {
		int randi = new Random().nextInt(24);

		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			if (i == randi) {
				button.setText("MOLE!");
			}
			button.addActionListener(this);
			Wpane.add(button);
		}
	}

	public void createUI() {
		Whack = new JFrame("Whack for the glory of your nation!");
		Wpane = new JPanel();
		Whack.add(Wpane);
		Whack.setVisible(true);
		Whack.setSize(300, 300);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		Whack.setLocation(dim.width / 2 - Whack.getSize().width / 2, dim.height / 2 - Whack.getSize().height / 2);
		Whack.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		int countHits = 0;
		int countClicks = 0;
		// TODO Auto-generated method stub
		String chosenText = ((JButton) arg0.getSource()).getText();
		if (chosenText == "MOLE!") {
			System.out.println("WHAM");
			try {
				Runtime.getRuntime().exec("say " + "HAH, KILL EM	").waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
			countHits = +1;
			countClicks = +1;
			Whack.dispose();
			createUI();
			drawButtons();
		} else {
			try {
				Runtime.getRuntime().exec("say " + "noob").waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
			countClicks = +1;
		}
		if (countClicks == 1) {
			System.out.println("Your score is " + countHits);
			Whack.dispose();
			JOptionPane.showMessageDialog(null, "Your score is " + countClicks / countHits);
		}
	}
}
