import java.time.LocalDate;


public class Magazine extends PaperMedia{
	private LocalDate date;
	
	public Magazine(String ID, String title, int year, int month, int day)
	{
		super(ID, title);
		this.setDate(year, month, day);
		super.setPeriod(5);
		super.setStatus(Status.Available);
	}
	
	public LocalDate getDate() { return date; }
	
	public void setDate(int year, int month, int day) { this.date = LocalDate.of(year, month, day); }
	
	@Override
	public void checkOut()
	{
		Status status = this.getStatus();
		if(status == Status.Available)
		{
			this.setStatus(Status.CheckedOut);
			System.out.println(super.getTitle() + " " + super.getID() + " " + this.getDate() + " has been checked out");
			System.out.println("Return in " + super.getPeriod() + " days");
		}
		else { System.out.println("Magazine is not available"); }
	}
	
	@Override
	public void checkIn()
	{
		this.setStatus(Status.Available);
		System.out.println("Thank you for returning the magazine!");
	}
	
	@Override
	public void checkAvailability()
	{
		if(this.getStatus() == Status.Available)
		{
			System.out.println("Magazine is available");
		}
		else if(this.getStatus() == Status.CheckedOut)
		{
			System.out.println("Magazine is checked out");
		}
	}
}
