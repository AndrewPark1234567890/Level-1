import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;


public class SPEENEENG {
public static void main(String[] args) {
	Tortoise.setX(800);
	Tortoise.setY(450);
	for (int i = 0; i < 1000; i++) {
		Tortoise.setSpeed(10);
	Tortoise.setPenColor(Colors.Blues.DarkBlue);
		//Tortoise.setPenColor(Colors.getRandomColor());
		Tortoise.move(i + 15);
	Tortoise.turn(70);
	Tortoise.setPenColor(Colors.Oranges.Coral);
	//Tortoise.setPenColor(Colors.getRandomColor());
	Tortoise.move(i + 15);
Tortoise.turn(70);
	}
}
}
