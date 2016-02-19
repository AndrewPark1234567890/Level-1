import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FartMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton b1 = new JButton("F1");
	JButton b2 = new JButton("F2");
	JButton b3 = new JButton("F3");

	public static void main(String[] joe) {
		new FartMachine().createUI();

	}

	private void playSound(String s) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(s));
		sound.play();
	}

	public void createUI() {

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		frame.add(panel);
		frame.setSize(500, 100);
		frame.setLocation(500, 400);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// System.out.println(" " + e);
		JButton buttonClicked = (JButton) e.getSource();
		if (b1 == buttonClicked) {
			playSound("F1.wav");
		}
		if (b2 == buttonClicked) {
			playSound("F2.wav");
		}
		if (b3 == buttonClicked) {
			playSound("F3.wav");
		}
	}
}