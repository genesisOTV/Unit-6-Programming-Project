
public class JournalArticle extends PaperMedia{
	private String category;
	
	public JournalArticle(String ID, String title, String category)
	{
		super(ID, title);
		this.setCategory(category);
		super.setPeriod(30);
		super.setStatus(Status.Available);
	}
	
	public String getCategory() { return this.category; } 
	
	public void setCategory(String category) { this.category = category; } 
	
	@Override
	public void checkOut()
	{
		Status status = this.getStatus();
		if(status == Status.Available)
		{
			this.setStatus(Status.CheckedOut);
			System.out.println(super.getTitle() + " " + super.getID() + " " + "\""+ category + "\"" + " has been checked out");
			System.out.println("Return in " + super.getPeriod() + " days");
		}
		else { System.out.println("Journal article is not available"); }
	}
	
	@Override
	public void checkIn()
	{
		this.setStatus(Status.Available);
		System.out.println("Thank you for returning the journal article!");
	}
	
	@Override
	public void checkAvailability()
	{
		if(this.getStatus() == Status.Available)
		{
			System.out.println("Journal article is available");
		}
		else if(this.getStatus() == Status.CheckedOut)
		{
			System.out.println("Journal article is checked out");
		}
	}

}
