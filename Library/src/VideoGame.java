
public class VideoGame extends DigitalMedia{
	private String rating;
	
	public VideoGame(String ID, String title, String rating)
	{
		super(ID, title);
		this.setRating(rating);
		super.setPeriod(5);
		super.setStatus(Status.Available);
	}
	
	public String getRating() { return rating; }

	public void setRating(String rating) { this.rating = rating; }

	@Override
	public void checkOut()
	{
		Status status = this.getStatus();
		if(status == Status.Available)
		{
			this.setStatus(Status.CheckedOut);
			System.out.println(super.getTitle() + " " + super.getID() +  " " + "\""+ rating + "\"" + " has been checked out");
			System.out.println("Return in " + super.getPeriod() + " days");
		}
		else { System.out.println("Video game is not available"); }
	}
	
	@Override
	public void checkIn()
	{
		this.setStatus(Status.Available);
		System.out.println("Thank you for returning the video game!");
	}
	
	@Override
	public void checkAvailability()
	{
		if(this.getStatus() == Status.Available)
		{
			System.out.println("Video game is available");
		}
		else if(this.getStatus() == Status.CheckedOut)
		{
			System.out.println("Video game is checked out");
		}
	}
}
