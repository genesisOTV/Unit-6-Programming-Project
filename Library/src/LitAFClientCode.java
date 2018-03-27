
public class LitAFClientCode {
	
	public static void main(String[] args)
	{
		Book BuildingJavaPrograms = new Book("07628", "Building Java Programs");
		BuildingJavaPrograms.checkOut();
		BuildingJavaPrograms.checkIn();
		
		CD FireMixtape = new CD("12421", "Fire Mixtape", "Various");
		FireMixtape.checkOut();
		FireMixtape.checkIn();
	}
}
