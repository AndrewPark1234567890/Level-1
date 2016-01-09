import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DeepThoughtCalculator implements ActionListener {
	JTextField input1 = new JTextField("Input 1");
	JTextField input2 = new JTextField("Input 2");
	JButton b1 = new JButton("Add");
	JButton b2 = new JButton("Subtract");
	JButton b3 = new JButton("Multiply");
	JButton b4 = new JButton("Divide");
	JFrame frame = new JFrame("Calculator");
	JPanel panel = new JPanel();
	JLabel answer = new JLabel("Answer");

public void createUI(){
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	panel.add(b1);
	panel.add(b2);
	panel.add(b3);
	panel.add(b4);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}


}
