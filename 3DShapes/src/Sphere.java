

public class Sphere implements Shape{
	private double radius;
	
	public Sphere(double r)
	{
		radius = r;
	}

	@Override
	public double calculateVolume() {
		double volume = (4*radius*radius*radius) / 3;
		return volume;
	}

	@Override
	public double calculateSurfaceArea() {
		double surfaceArea = 4*radius*radius;
		return surfaceArea;
	}

}
