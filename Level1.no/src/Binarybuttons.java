import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
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
		
		frame.setLocation(250, 250);
		frame.pack();
		frame.setSize(1500, 400);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonClicked = (JButton) e.getSource();
		if (button1 == buttonClicked) {
			if (button1.getText().equals("_")) {
				button1.setIcon(createImage("16_card.png"));
				button1.setText("16");
				score = score + 16;
			} else {
				button1.setIcon(createImage("blank_card.png"));
				button1.setText("_");
				score = score - 16;
			}
		}

		if (button2 == buttonClicked) {
			if (button2.getText().equals("_")) {
				button2.setIcon(createImage("8_card.png"));
				button2.setText("8");
				score = score + 8;
			} else if (button2.getText().equals("8")) {
				button2.setIcon(createImage("blank_card.png"));
				button2.setText("_");
				score = score - 8;
			}
		}

		if (button3 == buttonClicked) {
			if (button3.getText().equals("_")) {
				button3.setIcon(createImage("4_card.png"));
				button3.setText("4");
				score = score + 4;
			} else {
				button3.setIcon(createImage("blank_card.png"));
				button3.setText("_");
				score = score - 4;
			}
		}
		if (button4 == buttonClicked) {
			if (button4.getText().equals("_")) {
				button4.setIcon(createImage("2_card.png"));
				button4.setText("2");
				score = score + 2;
			} else {
				button4.setIcon(createImage("blank_card.png"));
				button4.setText("_");
				score = score - 2;
			}
		}
		if (button5 == buttonClicked) {
			if (button5.getText().equals("_")) {
				button5.setIcon(createImage("one_card.png"));
				button5.setText("1");
				score = score + 1;
			} else {
				button5.setIcon(createImage("blank_card.png"));
				button5.setText("_");
				score = score - 1;
			}
		}
		if (button6 == buttonClicked) {
			button1.setIcon(createImage("16_card.png"));
			button1.setText("16");
			button2.setIcon(createImage("8_card.png"));
			button2.setText("8");
			button3.setIcon(createImage("4_card.png"));
			button3.setText("4");
			button4.setIcon(createImage("2_card.png"));
			button4.setText("2");
			button5.setIcon(createImage("one_card.png"));
			button5.setText("1");
			score = 31;
		}
		if (buttonFlip == buttonClicked) {
			button1.setIcon(createImage("blank_card.png"));
			button1.setText("_");
			button2.setIcon(createImage("blank_card.png"));
			button2.setText("_");
			button3.setText("_");
			button3.setIcon(createImage("blank_card.png"));
			button4.setText("_");
			button4.setIcon(createImage("blank_card.png"));
			button5.setText("_");
			button5.setIcon(createImage("blank_card.png"));
			score = 0;
		}
		done.setText(score + "     ");
		if(score == 1){
			System.out.println("A");
		}
		if(score == 2){
			System.out.println("B");
		}
		if(score == 3){
			System.out.println("C");
		}
		if(score == 4){
			System.out.println("D");
		}
		if(score == 5){
			System.out.println("E");
		}
		if(score == 6){
			System.out.println("F");
		}
		if(score == 7){
			System.out.println("G");
		}
		if(score == 8){
			System.out.println("H");
		}
		if(score == 9){
			System.out.println("I");
		}
		if(score == 10){
			System.out.println("J");
		}
		if(score == 11){
			System.out.println("K");
		}
		if(score == 12){
			System.out.println("L");
		}
		if(score == 13){
			System.out.println("M");
		}
		if(score == 14){
			System.out.println("N");
		}
		if(score == 15){
			System.out.println("O");
		}
		if(score == 16){
			System.out.println("P");
		}
		if(score == 17){
			System.out.println("Q");
		}
		if(score == 18){
			System.out.println("R");
		}
		if(score == 19){
			System.out.println("S");
		}
		if(score == 20){
			System.out.println("T");
		}
		if(score == 21){
			System.out.println("U");
		}
		if(score == 22){
			System.out.println("V");
		}
		if(score == 23){
			System.out.println("W");
		}
		if(score == 24){
			System.out.println("X");
		}
		if(score == 25){
			System.out.println("Y");
		}
		if(score == 26){
			System.out.println("Z");
		}
	}
 private Icon createImage(String filename){
	URL imageURL = getClass().getResource(filename);
	 Icon icon = new ImageIcon(imageURL);
	return icon;
}


}