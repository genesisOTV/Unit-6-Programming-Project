
public class Basketball extends Athlete{
	
	public Basketball(String name, int teamNumber, double salary)
	{
		super(name, teamNumber, salary);
	}
	
	public void dunk()
	{
		System.out.println("Slam dunk!!");
		System.out.println("2 points!");
	}
	
	public void jumpShot()
	{
		System.out.println("Goes of the jumper...");
		System.out.println("2 points!");
	}
	
	public void threePoint()
	{
		System.out.println("Goes for the 3...");
		System.out.println("3 points!");
	}
}
