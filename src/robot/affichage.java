package robot;

public class affichage {
	public static void main(String[] args) {
		System.out.println("******Robot Bobo * VS *Robot gojo*******");
		
		robot R1=new robot("Bobo ", 10 );
		robot R2=new robot("gojo: ", 10 );
		System.out.println("Robot" +" "+R1.getNom1() +" " +R1.getV1() +"points de vie " );
		
		robot r=new robot("gojo: ", 10 );
		System.out.println("Robot" +" "+R2.getNom1() +" " +R1.getV1() +"points de vie" );
		
		System.out.println("le robot bobo lance une attaque  sur le robot gojo");
		
		R1.fire(R2);
		
		
		System.out.println("le robot gojo lance une attaque  sur le robot bobo");
		
		R2.fire(R1);
		
	System.out.println("le robot bobo lance une attaque  sur le robot gojo");
		
		R1.fire(R2);
System.out.println("le robot gojo lance une attaque  sur le robot bobo");
		
		R2.fire(R1);
		
		
		System.out.println("le robot bobo lance une attaque  sur le robot gojo");
			
			R1.fire(R2);
	System.out.println("le robot gojo lance une attaque  sur le robot bobo");
			
			R2.fire(R1);	
			System.out.println("le robot bobo lance une attaque  sur le robot gojo");
			
			R1.fire(R2);
	System.out.println("le robot gojo lance une attaque  sur le robot bobo");
			
			R2.fire(R1);	
			System.out.println("le robot bobo lance une attaque  sur le robot gojo " );
			
			R1.fire(R2);
			
			System.out.println("********le robot gojo a perdu . victoire du robot bobo********");

			System.out.println("******debut du combat * humain satori VS *humain john ******");
		
		
	}
	
	
}
