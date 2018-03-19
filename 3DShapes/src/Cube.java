
public class Cube extends RectangularPrism {
	private double measurement;
	
	public Cube(double m)
	{
		super(m, m , m);
		measurement = m;
	}
	
	@Override
	public double calculateVolume()
	{
		double volume = measurement*measurement*measurement;
		return volume;
	}
	
	@Override
	public double calculateSurfaceArea()
	{
		double surfaceArea = 6*(measurement*measurement);
		return surfaceArea;
	}
}
