import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Chuklez implements ActionListener {
	// Make a ChuckleClicker class, a main method and a makeButtons method.
	// Put a pop-up in the makeButtons method and get it working.
	// You will need to instantiate your class and call method an instance of
	// it.
	public static void main(String[] args) {
		Chuklez c1 = new Chuklez();
		c1.makeButtons();
	}

	// Make a JFrame in makeButtons() method and get it to show.

	// Add a JPanel and two JButtons and get them to show up like this:

	// *[Optional] Customize your GUI with setText, setSize, etc.

	// Make a pop-up that says “hi” when either of the buttons are pressed.
	// You will need to add listeners to the buttons for this to work.

	// Check if the ActionEvent came from the joke button or the punchline
	// button.
	// if(arg0.getSource() == jokeButton)
	// You might need to move the declaration of your buttons above the the
	// makeButtons() method.

	// Use JOptionPane to print the joke or the punchline depending on which
	// button was clicked.
	public void makeButtons() {
		JFrame j1 = new JFrame();
		j1.setSize(200, 100);
		j1.setVisible(true);
		JPanel p1 = new JPanel();
		JButton b1 = new JButton("Riddlez");
		JButton b2 = new JButton("Answerz");
		p1.add(b1);
		p1.add(b2);
		j1.add(p1);
b1.addActionListener(this);
b2.addActionListener(this);
		j1.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
