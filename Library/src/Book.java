
public class Book extends PaperMedia{

	public Book(String ID, String title) {
		super(ID, title);
		super.setPeriod(30);
		super.setStatus(Status.Available);
	}
	
	@Override
	public void checkOut()
	{
		Status status = this.getStatus();
		System.out.println(status);
		if(status == Status.Available)
		{
			this.setStatus(Status.CheckedOut);
			System.out.println(super.getTitle() + " " + super.getID() + " has been checked out");
			System.out.println("Return in " + super.getPeriod() + " days");
		}
		else { System.out.println("Book is not available"); }
	}
}
