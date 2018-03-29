
public class Tennis extends Athlete{
	
	public Tennis(String name, int teamNumber, double salary)
	{
		super(name, teamNumber, salary);
	}
	
	public void serve()
	{
		System.out.println("Serves the ball...");
	}
	
	public void backhand()
	{
		System.out.println("Hits a backhand");
	}
	
	public void forehand()
	{
		System.out.println("Hits a forehand");
	}

}
