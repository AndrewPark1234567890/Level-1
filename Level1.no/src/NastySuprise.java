import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySuprise implements ActionListener {
	String imageUrl;
	JFrame ff = new JFrame("You Must Choose");
	JPanel pp = new JPanel();
	JButton b1 = new JButton("Pick me");
	JButton b2 = new JButton("Don't be stupid pick me instead");

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		NastySuprise one = new NastySuprise();
		one.createUI();

	}

	public void createUI() {
		b1.addActionListener(this);
		b2.addActionListener(this);
		pp.add(b1);
		pp.add(b2);
		ff.add(pp);
		ff.setSize(600, 200);
		ff.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button4 = (JButton) e.getSource();
		if (b1 == button4) {
			System.out.println("TREAT");
			imageUrl = "http://www.lolcats.com/images/u/12/52/allforme.jpg";
		} else if (b2 == button4) {
			System.out.println("TRICK");
			imageUrl = "https://i.ytimg.com/vi/tSdSemAMzdY/hqdefault.jpg";
		}
		showPictureFromTheInternet(imageUrl);
	}
}
// http://www.lolcats.com/images/u/12/52/allforme.jpg
// https://i.ytimg.com/vi/tSdSemAMzdY/hqdefault.jpg