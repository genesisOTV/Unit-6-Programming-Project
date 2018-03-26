
public class Cylinder implements Shape{

	private double radius;
	private double height;
	
	public Cylinder(double r, double h)
	{
		radius = r;
		height = h;
	}
	
	@Override
	public double calculateVolume() {
		double volume = radius*radius*height;
		return volume;
	}

	@Override
	public double calculateSurfaceArea() {
		double surfaceArea = 2*(radius*height+radius*radius);
		return surfaceArea;
	}
	
}
