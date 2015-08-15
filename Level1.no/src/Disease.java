public class Disease {
	boolean pandemic;
	String symptoms;
	boolean canSurvive;
	int survivalPercentage;
	boolean contageos;

	Disease(boolean pandemic, String symptoms, boolean canSurvive,
			int survivalPercentage, boolean contageos) {
		this.pandemic = pandemic;
		this.symptoms = symptoms;
		this.canSurvive = canSurvive;
		this.survivalPercentage = survivalPercentage;
		this.contageos = contageos;
	}
	
public static void main(String[] args) {
	

	Disease andrewsCreationOfEpicness = new Disease(true,
			"Slow horrible expansion of lungs until they explode.", true, 2, false);

}
}