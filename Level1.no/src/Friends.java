
public class Friends {
	public static void main(String[] args) {
		new Friends().getGoing();
	}

	private void getGoing() {
		Girl g1 = new Girl("Hannah", 15);
		Girl g2 = new Girl("Sarrah", 16);
		Girl g3 = new Girl("Helen", 17);
		Boy b1 = new Boy("Sam", 15);
		Boy b2 = new Boy("Joe", 15);
		Boy b3 = new Boy("Bob");
		g1.yell();
		g2.yell();
		g3.yell();
		b1.scream();
		b2.scream();
		b3.scream();
		b3.scream("My thoughts are fun.");
		b3.scream("My thoughts are fun.", 0);
		b3.scream(100, "My thoughts are fun.");
	}

	public class Boy {
		String name;
		int age;

		public Boy(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public Boy(String name) {
			this.name = name;
		}

		private void scream() {
			System.out.println("I'm Screaming, I am " + age + " years old, and my name is " + name + ".");
		}

		private void scream(String thoughts) {
			System.out.println("I'm Screaming, I am " + age + " years old, and my name is " + name + ". " + thoughts);
		}
		private void scream(String thoughts, int familyMembers) {
			System.out.println("I'm Screaming, I am " + age + " years old, and my name is " + name + ". " + thoughts + familyMembers);
		}
		private void scream(int familyMembers, String thoughts) {
			System.out.println(familyMembers + "I'm Screaming, I am " + age + " years old, and my name is " + name + ". " + thoughts);
		}
	}

	public class Girl {
		String name;
		int age;

		public Girl(String name, int age) {
			this.name = name;
			this.age = age;
		}

		private void yell() {
			System.out.println("I'm yelling, I am " + age + " years old, and my name is " + name + ".");
		}
	}
}
