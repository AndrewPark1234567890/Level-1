import org.teachingextensions.logo.Tortoise;

public class PWND3MN00B5 {
	public PWND3MN00B5() {
	}
	public static void main(String[] args) {
		PWND3MN00B5 newbs = new PWND3MN00B5();
		newbs.food("Applez");
		newbs.truth(1);
		newbs.jump(49);
		newbs.jump2("peggeh");
		for (int i = 0; i < 4; i++) {
			newbs.drawLine();
		}
	}

	void food(String fruits) {
		System.out.println("I like pwning " + fruits);
	}

	void truth(int x) {
		if (x > 5)
			System.out.println("Geeks rule");
		else
			System.out.println("Nerds rule");
	}

	void drawLine() {
		Tortoise.move(100);
		Tortoise.turn(90);
	}

	void jump(int height) {
		if (height > 100)
			System.out.println("The mouse jumped over the moon.");
		if (height > 50)
			System.out.println("The mouse jumped over the broom.");
		if (height > 5)
			System.out.println("The mouse jumped over the candlestick.");
	}

	void jump2(String obstacle) {
		System.out.println("The mouse jumped over the " + obstacle);
	}

}