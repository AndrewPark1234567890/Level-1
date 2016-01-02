import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySuprise {
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
		JFrame ff = new JFrame("You Must");
		JPanel pp = new JPanel();
		JButton b1 = new JButton("Pick me");
		JButton b2 = new JButton("Don't be stupid pick me instead");
		pp.add(b1);
		pp.add(b2);
		ff.add(pp);
		ff.setVisible(true);
	}
}
// http://www.lolcats.com/images/u/12/52/allforme.jpg
// https://i.ytimg.com/vi/tSdSemAMzdY/hqdefault.jpg