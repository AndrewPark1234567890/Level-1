import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.teachingextensions.logo.Paintable;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;

public class HungryTurtles implements KeyEventDispatcher {

	// 1. Set a location for the cookie
	int cookieX = new Random().nextInt(450);
	int cookieY = new Random().nextInt(350);

	// 2. Choose the speed you want the Tortoise to go at
	int speed = 4;

	void setup() {
		// 3. Edit this intro message to your own style
		JOptionPane.showMessageDialog(null,
				"FIND THE FLY QUICK! YOU'RE ABOUT TO STARVE \n *Tip*You'll get warmer the closer you get.\n *Tip*Try going over your string...");

		// 4. For debugging purposes, show the cookie. The user won’t see this.

	}

	private void goUp() {
		Tortoise.move(speed);
	}

	private void goDown() {
		Tortoise.move(-speed);
	}

	private void goLeft() {
		// 5. make the tortoise move left at the specified speed (3 lines of
		// code)
		Tortoise.turn(270);
		Tortoise.move(speed);
		Tortoise.turn(90);
	}

	private void goRight() {
		// 6. use the speed variable to make the tortoise move right
		Tortoise.turn(90);
		Tortoise.move(speed);
		Tortoise.turn(270);
	}

	private void checkForFood() throws Exception {
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();

		// 7. If the Tortoise is within 100 pixels of the food, set the
		// background color to yellow
		int deltax = Math.abs(tortoiseLocationX - cookieX);
		int deltay = Math.abs(tortoiseLocationY - cookieY);
		System.out.println("X: " + deltax + " y: " + deltay);
		// Greater than 100 away
		if (deltax > 100 || deltay > 100) {
			setBackgroundColor(Color.gray);
		}
		// Less than 100 away
		if (deltax < 100 && deltay < 100)
		{
			setBackgroundColor(Color.yellow);
		}
		// 8. If the Tortoise is within 50 pixels of the food, set the
		// background color to orange
		if (deltax < 50 && deltay < 50) {
			setBackgroundColor(Color.orange);
		}
		// 9. If the Tortoise is within 20 pixels of the food, set the
		// background color to red
		if (deltax < 20 && deltay < 20) {
			setBackgroundColor(Color.red);
		}
		// 10. If the Tortoise is within 5 pixels of the cookie, make a pop-up
		// to tell them they found it
		if (deltax < 5 && deltay < 5) {
			setBackgroundColor(Color.green);
			JOptionPane.showMessageDialog(null, "YOU LIVED!");
		}
		// 11. If more than 20 seconds have elapsed, tell them the turtle died
		// of hunger!
		if (getTimeElapsed() == 30) {
			JOptionPane.showMessageDialog(null, "You died...");
		}
		// 12. If the Tortoise crosses it's own path, tell them they failed and
		// move them back to the beginning
		if (wasHereBefore(tortoiseLocationX, tortoiseLocationY) == true) {
			Tortoise.setX((int) getFirstLocation().getX());
			Tortoise.setY((int) getFirstLocation().getY());

		}
	}

	private long getTimeElapsed() {
		Date currentTime = new Date();
		return (currentTime.getTime() - startTime.getTime()) / 1000;
	}

	private void setBackgroundColor(Color color) {
		Tortoise.getBackgroundWindow().setBackground(color);
	}

	private void showCookie() {
		Tortoise.getBackgroundWindow().addPaintable(new Paintable() {
			public void paint(Graphics2D g, JPanel caller) {
				g.drawOval(cookieX, cookieY, 10, 10);
			}
		});
	}

	private boolean wasHereBefore(int xPosition, int yPosition) {
		if (previousLocations.contains(new Point(xPosition, yPosition)))
			return true;
		else
			return false;
	}

	private Point getFirstLocation() {
		return previousLocations.get(0);
	}

	/***********************
	 * don't worry about the stuff under here
	 ******************/

	Date startTime = new Date();

	public static void main(String[] args) {
		Tortoise.setAnimal(Animals.Spider);
		Tortoise.setPenColor(Color.white);
		HungryTurtles feeder = new HungryTurtles();
		feeder.controlTheTortoise();
		feeder.setup();
	}

	private void controlTheTortoise() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		Tortoise.show();
		Tortoise.setPenColor(Color.white);
		Tortoise.getBackgroundWindow().setBackground(PenColors.Grays.SlateGray);
		Tortoise.setSpeed(10);
	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {

			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			if (e.getKeyCode() == KeyEvent.VK_DOWN)
				goDown();

			try {
				checkForFood();
			} catch (Exception e1) {
				e1.printStackTrace();
			}

			savePosition(Tortoise.getX(), Tortoise.getY());
		}
		return false;
	}

	ArrayList<Point> previousLocations = new ArrayList<Point>();

	private void savePosition(int xPosition, int yPosition) {
		previousLocations.add(new Point(xPosition, yPosition));
	}
}
