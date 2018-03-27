
public class Item implements Borrowable{
	private String ID;
	private String title;
	private Status status;
	
	public Item(String ID, String title)
	{
		this.setID(ID);
		this.setTitle(title);
	}
	
	public String getID() { return ID; }
	public String getTitle() { return title; }
	public Status getStatus() { return status; }
	public void setID(String ID) { this.ID = ID;}
	public void setTitle(String title) { this.title = title; }
	public void setStatus(Status status) { this.status = status; }
	
	public void checkOut()
	{
		Status status = this.getStatus();
		if(status == Status.Available)
		{
			this.setStatus(Status.CheckedOut);
		}
		else { System.out.println("Item is not available"); }
	}
}
