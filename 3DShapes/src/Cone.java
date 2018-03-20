import static java.lang.Math.sqrt;

public class Cone implements Shape{
	private double radius;
	private double height;
	
	public Cone(double r, double h)
	{
		radius = r;
		height = h;
	}

	@Override
	public double calculateVolume() {
		double volume = (3*radius*radius) / 3;
		return volume;
	}

	@Override
	public double calculateSurfaceArea() {
		double surfaceArea = radius*(radius + sqrt((radius*radius) + (height*height)));
		return surfaceArea;
	}
	
	//test for github
}
