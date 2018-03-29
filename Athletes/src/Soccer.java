
public class Soccer extends Athlete{
	
	public Soccer(String name, int teamNumber, double salary)
	{
		super(name, teamNumber, salary);
	}
	
	public void pass(Soccer other)
	{
		System.out.println("Passes the ball to " + other.getName());
	}
	
	public void shoot()
	{
		System.out.println("Shoot...");
		System.out.println("Goal!!");
	}

}
