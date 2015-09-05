import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cute implements ActionListener {
	JPanel pane = new JPanel();
	JFrame nIBBLER = new JFrame();
	JButton button1 = new JButton("This is Lord Nibbler of the Niblonians");
	JButton button2 = new JButton("PREPARE FOR HYPNOTOAD");
	JButton button3 = new JButton("Darn does katz");

	public static void main(String[] args) {

		// Make a user interface with 3 buttons that will play different videos
		// depending on which button is clicked. Use the methods below to play
		// the cutest videos ever.
		Cute nibbler = new Cute();
		nibbler.createUi();

	}

	void showDucks() {
		playVideo("WSleZn4upl0");
		try {
		    Thread.sleep(17000);                 //1000 milliseconds is one second.
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		playVideo("TJ2UkCkQ1aY");
		try {
		    Thread.sleep(9000);                 //1000 milliseconds is one second.
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		playVideo("xudgIv6LGOw");
	}

	void showFrog() {
		playVideo("q0ZkD_EDpP4");
	}

	void showFluffyUnicorns() {
		playVideo("MJdO0qXKzgI");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI("https://www.youtube.com/v/" + videoID
					+ "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void createUi() {

		pane.add(button1);
		pane.add(button2);
		pane.add(button3);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		nIBBLER.add(pane);
		nIBBLER.pack();
		nIBBLER.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	System.out.println("Button Clicked :D I am great.");
	JButton button4 = (JButton)e.getSource();
	if(button1 == button4){
		showDucks();
	}
	else if(button2 == button4){
		showFrog();
	}
	else if(button3 == button4){
		showFluffyUnicorns();
	}
	}

	// NOTE: Duck video is missing

}
