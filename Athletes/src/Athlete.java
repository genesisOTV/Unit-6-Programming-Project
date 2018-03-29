
public class Athlete {
	private String name;
	private int teamNumber;
	private double salary;
	
	public Athlete(String name, int teamNumber, double salary)
	{
		this.setName(name);
		this.setTeamNumber(teamNumber);
		this.setSalary(salary);
	}

	public String getName() { return name; }
	public int getTeamNumber() { return teamNumber; }
	public double getSalary() { return salary; }
	
	public void setName(String name) { this.name = name; }
	public void setTeamNumber(int teamNumber) { this.teamNumber = teamNumber; }
	public void setSalary(double salary) { this.salary = salary; }
	
	public void makeFunOfGolf()
	{
		System.out.println("Golf is not a sport");
	}
}
