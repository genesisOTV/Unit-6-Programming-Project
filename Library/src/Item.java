
public class Item implements Borrowable{
	private String ID;
	private String title;
	private Status status;
	private int period = 25;
	
	public Item(String ID, String title)
	{
		this.setID(ID);
		this.setTitle(title);
	}
	
	public String getID() { return ID; }
	public String getTitle() { return title; }
	public Status getStatus() { return status; }
	public int getPeriod() { return period; }
	
	public void setID(String ID) { this.ID = ID;}
	public void setTitle(String title) { this.title = title; }
	public void setStatus(Status status) { this.status = status; }
	public void setPeriod(int period) { this.period = period; }
	
	@Override
	public void checkOut()
	{
		Status status = this.getStatus();
		if(status == Status.Available)
		{
			this.setStatus(Status.CheckedOut);
			System.out.println(title + " " + ID + " has been checked out");
			System.out.println("Return in " + period + " days");
		}
		else { System.out.println("Item is not available"); }
	}
	
	@Override
	public void checkIn()
	{
		this.setStatus(Status.Available);
		System.out.println("Thank you for returning the item!");
	}
	
	@Override
	public void checkAvailability()
	{
		if(this.getStatus() == Status.Available)
		{
			System.out.println("Item is available");
		}
		else if(this.getStatus() == Status.CheckedOut)
		{
			System.out.println("Item is checked out");
		}
	}
}
