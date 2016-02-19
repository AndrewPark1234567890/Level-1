import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Colors.Blues;
import org.teachingextensions.logo.Colors.Greens;
import org.teachingextensions.logo.Colors.Yellows;

public class TeachingColor implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();

	public static void main(String[] args) {
		TeachingColor tCol = new TeachingColor();
		tCol.createUI();
	}

	public void createUI() {
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		b1.setBackground(Color.yellow);
		b1.setOpaque(true);
		b2.setBackground(Color.red);
		b2.setOpaque(true);
		b3.setBackground(Color.blue);
		b3.setOpaque(true);
		b4.setBackground(Color.green);
		b4.setOpaque(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		frame.add(panel);
		frame.setSize(600, 200);
		frame.setLocation(400, 500);
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
JButton b5 = (JButton)e.getSource();
if(b1 == b5){
	speak("Yellow");
}
if(b2 == b5){
	speak("Red");
}
if(b3 == b5){
	speak("Blue");
}
if(b4 == b5){
	speak("Green");
}
}

	public void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
