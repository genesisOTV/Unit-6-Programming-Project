
public class RectangularPrism implements Shape{
	private double length;
	private double width;
	private double height;
	
	public RectangularPrism(double length, double width, double height)
	{
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double calculateVolume() {
		double volume = length*width*height;
		return volume;
	}

	@Override
	public double calculateSurfaceArea() {
		double surfaceArea = 2*((width*length)+(height*length)+(width*height));
		return surfaceArea;
	}
}
