
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
		
		System.out.println("");
		Magazine TimeMagazine = new Magazine("6675", "Time Magazine", 2018, 3, 26);
		TimeMagazine.checkOut();
		
		System.out.println("");
		JournalArticle esoteric = new JournalArticle("5235", "United States health care reform: progress to date and next steps", "Medicine");
		esoteric.checkOut();
		
		System.out.println("");
		VideoGame vidya = new VideoGame("4325", "Grand Theft Auto V", "Rated M");
		vidya.checkOut();
	}
}
