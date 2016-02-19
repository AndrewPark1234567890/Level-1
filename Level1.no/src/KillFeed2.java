import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class KillFeed2 implements ActionListener{
	JFrame frame = new JFrame("Who wins? YOU DECIDE!");
	JPanel panel = new JPanel();
	JButton b1 = new JButton("Andrew");
	JButton b2 = new JButton("Joe");
	JButton b3 = new JButton("HackerMcHaxxens");
	JButton b4 = new JButton("1337Pro");
	JButton b6 = new JButton("BobTHEDESTRUCTICON");

	public static void main(String[] args) {
	KillFeed2 kf2 = new KillFeed2();
	kf2.createUI();
}
public void createUI(){
	panel.add(b1);
	panel.add(b2);
	panel.add(b3);
	panel.add(b4);
	panel.add(b6);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b6.addActionListener(this);
	frame.add(panel);
	frame.setSize(600, 200);
	frame.setLocation(400, 200);
	frame.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton b5 = (JButton)e.getSource();
	if(b1 == b5){
		System.out.println("Deathmatch, BEGIN!");
		System.out.println("Andrew ︻デ┳═ー 1337Pro");
		System.out.println("HackerMcHaxxens ︻デ┳═ー Joe");
		System.out.println("Andrew ︻デ┳═ー HackerMcHaxxens");
		System.out.println("Andrew ︻デ┳═ー BobTHEDESTRUCTICON");
		System.out.println("Andrew is the last player alive");
		System.out.println("Andrew wins!");
		speak("The winner is Andrew");
	}
	if(b2 == b5){
		System.out.println("Deathmatch, BEGIN!");
		System.out.println("Andrew ︻デ┳═ー HackerMcHaxxens");
		System.out.println("Joe ︻デ┳═ー 1337Pro");
		System.out.println("Andrew ︻デ┳═ー BobTHEDESTRUCTICON");
		System.out.println("Joe timed out...");
		System.out.println("Andrew is the last player alive");
		System.out.println("Andrew wins!");
		speak("The winner is Andrew");
	}
	if(b3 == b5){
		System.out.println("Deathmatch, BEGIN!");
		System.out.println("HackerMrHaxxens ︻デ┳═ー 1337Pro");
		System.out.println("HackerMcHaxxens ︻デ┳═ー Joe");
		System.out.println("HackerMcHaxxens ︻デ┳═ー BobTHEDESTRUCTICON");
		System.out.println("HackerMcHaxxens has been permenently banned for cheating");
		System.out.println("Andrew is the last player alive");
		System.out.println("Andrew wins!");
		speak("The winner is Andrew");
	}
	if(b4 == b5){
		System.out.println("Deathmatch, BEGIN!");
		System.out.println("1337Pro ︻デ┳═ー Joe");
		System.out.println("HackerMcHaxxens ︻デ┳═ー BobTHEDESTUCTICON");
		System.out.println("1337Pro ︻デ┳═ー HackerMcHaxxens");
		System.out.println("1337Pro has been Ddos'd");
		System.out.println("Andrew ︻デ┳═ー 1337Pro");
		System.out.println("Andrew is the last player alive");
		System.out.println("Andrew wins!");
		speak("The winner is Andrew");
	}
	if(b6 == b5){
		System.out.println("Deathmatch, BEGIN!");
		System.out.println("Andrew ︻デ┳═ー Joe");
		System.out.println("BobTHEDESTRUCTICON ︻デ┳═ー 1337Pro");
		System.out.println("BobTHEDESTRUCTICON ︻デ┳═ー HackerMcHaxxens");
		System.out.println("BobTHEDESTRUCTICON ︻デ┳═ー BobTHEDESTRUCTICON");
		System.out.println("Andrew is the last player alive");
		System.out.println("Andrew wins!");
		speak("The winner is Andrew");
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