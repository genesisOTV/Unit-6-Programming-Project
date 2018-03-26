
public class LitAFClientCode {
	public static void main(String[] args) {
		RectangularPrism fooPrism = new RectangularPrism(3, 4, 5);
		System.out.println("Volume of rect prism : " + fooPrism.calculateVolume());
		System.out.println("Surface area of rect prism : " + fooPrism.calculateSurfaceArea());
		
		Cube tesseract = new Cube(3);
		System.out.println("Volume of cube : " + tesseract.calculateVolume());
		System.out.println("Surface area of cube : " + tesseract.calculateSurfaceArea());
		
		Sphere ball = new Sphere(4);
		System.out.println("Volume of sphere : " + ball.calculateVolume() + "pi");
		System.out.println("Surface area of sphere : " + ball.calculateSurfaceArea() +"pi");
		
		Cone trafficCone = new Cone(4, 8);
		System.out.println("Volume of cone : " + trafficCone.calculateVolume() + "pi");
		System.out.println("Surface area of cone : " + trafficCone.calculateSurfaceArea() +"pi");
		
		Cylinder cokeCan = new Cylinder(4, 8);
		System.out.println("Volume of cylinder : " + cokeCan.calculateVolume() + "pi");
		System.out.println("Surface area of cylinder : " + cokeCan.calculateSurfaceArea() +"pi");
		
		Tetrahedron myShape = new Tetrahedron(6);
		System.out.println("Volume of tetrahedron : " + myShape.calculateVolume());
		System.out.println("Surface area of tetrahedron : " + myShape.calculateSurfaceArea());
	}
}
