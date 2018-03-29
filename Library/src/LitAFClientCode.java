
public class LitAFClientCode {
	
	public static void main(String[] args)
	{
		Book BuildingJavaPrograms = new Book("07628", "Building Java Programs");
		BuildingJavaPrograms.checkOut();
		BuildingJavaPrograms.checkIn();
		BuildingJavaPrograms.checkAvailability();
		
		System.out.println("");
		CD FireMixtape = new CD("12421", "Fire Mixtape", "Various");
		FireMixtape.checkOut();
		FireMixtape.checkIn();
		FireMixtape.checkAvailability();
		System.out.print("");
		
		System.out.println("");
		Video TheImitationGame = new Video("1882", "The Imitation Game", 114);
		TheImitationGame.checkOut();
	}
}
