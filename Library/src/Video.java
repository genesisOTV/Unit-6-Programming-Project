
public class Video extends DigitalMedia{
	
	private int runtimeInMinutes;
	
	public Video(String ID, String title, int runtimeInMinutes)
	{
		super(ID, title);
		this.setRuntimeInMinutes(runtimeInMinutes);
		super.setPeriod(15);
		super.setStatus(Status.Available);
	}
	
	public String getRuntimeInMinutes() {
		String category= "Undefined : ";
		
		if(runtimeInMinutes >= 90)
		{
			category = "Movie";
			return category;
		}
		else if(runtimeInMinutes < 90 && runtimeInMinutes >= 30)
		{
			category = "Short Film";
			return category;
		}
		
		return category + runtimeInMinutes;
	}

	public void setRuntimeInMinutes(int runtimeInMinutes) { this.runtimeInMinutes = runtimeInMinutes; }
	
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
		else { System.out.println("Video is not available"); }
	}
	
	@Override
	public void checkIn()
	{
		this.setStatus(Status.Available);
		System.out.println("Thank you for returning the video!");
	}
	
	@Override
	public void checkAvailability()
	{
		if(this.getStatus() == Status.Available)
		{
			System.out.println("Video is available");
		}
		else if(this.getStatus() == Status.CheckedOut)
		{
			System.out.println("Video is checked out");
		}
	}
}
