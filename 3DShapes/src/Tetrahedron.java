import static java.lang.Math.sqrt;

public class Tetrahedron implements Shape{
	private double edge; 
	
	public Tetrahedron(double edge)
	{
		this.edge = edge;
	}
	
	@Override
	public double calculateVolume() {
		double volume = (edge*edge*edge) / 6*sqrt(2);
		return volume;
	}

	@Override
	public double calculateSurfaceArea() {
		double surfaceArea = sqrt(3)*(edge*edge);
		return surfaceArea;
	}

}
