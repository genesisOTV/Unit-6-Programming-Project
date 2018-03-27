
public class CD extends DigitalMedia{
	private String genre;
	
	public CD(String ID, String title, String genre)
	{
		super(ID, title);
		this.genre = genre;
		super.setPeriod(15);
		super.setStatus(Status.Available);
	}

	@Override
	public void checkOut()
	{
		Status status = this.getStatus();
		if(status == Status.Available)
		{
			this.setStatus(Status.CheckedOut);
			System.out.println(super.getTitle() + " " + super.getID() + " has been checked out");
			System.out.println("Return in " + super.getPeriod() + " days");
		}
		else { System.out.println("CD is not available"); }
	}
	@Override
	public void checkIn()
	{
		this.setStatus(Status.Available);
		System.out.println("Thank you for returning the CD!");
	}
}
