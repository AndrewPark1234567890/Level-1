import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SirSpamalot implements ActionListener {
	static final String FAKE_USERNAME = "level1.spam.530@gmail.com";
	static final String FAKE_PASSWORD = "password530";
	JFrame menu = new JFrame();
	JButton good = new JButton("Good");
	JButton bad = new JButton("Bad");
	JTextField email = new JTextField("Enter Sender Info Here");
	JTextField message = new JTextField("Enter Message Here");
	JTextField amount = new JTextField("Enter Amount Of Messages To Send");
	JTextField subject = new JTextField("Enter Subject");
	JPanel pane = new JPanel();

	public static void main(String[] args) {
		new SirSpamalot().createUI();
	}

	private void createUI() {
		// TODO Auto-generated method stub
		good.addActionListener(this);
		bad.addActionListener(this);
		pane.add(good);
		pane.add(bad);
		pane.add(email);
		pane.add(message);
		pane.add(amount);
		pane.add(subject);
		menu.add(pane);
		menu.setSize(200, 200);
		menu.setVisible(true);
		menu.pack();
		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int amount1 = Integer.parseInt(amount.getText());

		if (e.getSource() == good) {
			System.out.println("Good " + email.getText());
			for (int i = 0; i < amount1; i++) {
				sendSpam(email.getText(), subject.getText(), message.getText());
			}
		}
		if (e.getSource() == bad) {
			System.out.println("Bad " + email.getText());
			for (int i = 0; i < amount1; i++) {
				sendSpam(email.getText(),subject.getText(), message.getText());
			}
		}

	}

	private boolean sendSpam(String recipient, String subject, String content) {

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
					protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
						return new javax.mail.PasswordAuthentication(
								FAKE_USERNAME, FAKE_PASSWORD);
					}
				});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(FAKE_USERNAME));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(recipient));
			message.setSubject(subject);
			message.setText(content);
			Transport.send(message);
			return true;

		} catch (MessagingException e) {
			e.printStackTrace();
			return false;
		}
	}

}
