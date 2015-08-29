public class intro2writingmethods {
	public static void main(String[] args) {
		intro2writingmethods leedle = new intro2writingmethods();
		leedle.iRock();
		leedle.rocker("Andrew");
		leedle.truth1("Andrews clone");
		leedle.truth2("TJ");
		leedle.echo("Andrew is great");
		leedle.repeat("Andrew is still great.");
		leedle.echo("Did u know that one person saying something is the same to people as three people saying something once?");
		leedle.theBest("Andrew");
		leedle.sum(147230, 3419);

	}

	public void iRock() {
		System.out.println("Andrew is da best of dem all.");
	}

	public void rocker(String name) {
		System.out.println(name + " rocks");
	}

	public void truth1(String namez1) {
		System.out.println(namez1 + " is nearly half as cool as Andrew :D");
	}

	public void truth2(String namez2) {
		System.out.println(namez2 + " is lame :3");
	}

	public void echo(String word) {
		System.out.println(word + " " + word);
	}

	public void repeat(String word2) {
		System.out.println(word2 + word2 + word2 + word2 + word2);
	}

	public void theBest(String theBest) {
		System.out.println("The best programmer is " + theBest);
	}

	public void sum(int one, int two) {
		int answer = one + two;
		System.out.println(one + " Plus " + two + " equals " + answer);
	}
}
