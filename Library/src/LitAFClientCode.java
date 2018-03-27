
public class LitAFClientCode {
	
	public static void main(String[] args)
	{
		Book BuildingJavaPrograms = new Book("07628", "Building Java Programs");
		BuildingJavaPrograms.checkOut();
		BuildingJavaPrograms.checkIn();
	}
}
