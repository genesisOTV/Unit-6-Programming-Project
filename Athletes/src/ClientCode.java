
public class ClientCode {
	
	public static void main(String[] args)
	{
		Basketball mj = new Basketball("Micheal Jordan", 23, 30000000);
		Soccer pelle = new Soccer("Edson Arantes do Nascimento", 10, 1500000);
		Soccer pelle2 = new Soccer("Pelle Clone", 10, 1500000);
		Tennis venusWilliams = new Tennis("Venus Williams", 0, 75000000);
		Golf tW = new Golf("Tiger Woods", 0, 750000000);
		
		System.out.println("*Basketball game starts*");
		mj.dunk();
		mj.jumpShot();
		mj.threePoint();
		System.out.println("*Basketball game ends*");
		
		System.out.println("*Soccer game starts*");
		pelle.pass(pelle2);
		pelle.shoot();
		System.out.println("*Soccer game ends*");
		
		System.out.println("*Tennis game starts*");
		venusWilliams.serve();
		venusWilliams.forehand();
		venusWilliams.backhand();
		System.out.println("*Tennis game ends*");
		
		System.out.println("*Golf game starts*");
		pelle.makeFunOfGolf();
		mj.makeFunOfGolf();
		tW.drive();
		System.out.println("*Golf game ends*");
	}
}
