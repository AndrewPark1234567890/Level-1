public class Platypus {
	private String name;

	void sayHi(){
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
	}
	
	public static void main(String[] args) {
		//1. Make an instance of your new pet platypus
		Platypus Purry = new Platypus("Purry");
		//2. Call the sayHi method
		Purry.sayHi();
		
	}
	//3. Create a constructor in the platypus class so that you can give your platypus a name.	
	public Platypus(String name) {
this.name = name;
		// TODO Auto-generated constructor stub
	}
}

