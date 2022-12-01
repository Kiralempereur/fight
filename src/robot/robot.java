package robot;

public class robot {
	public static robot R;
	protected String nom1;
	protected int V1;
	
	public robot() {}
	public robot(String nom1,int V1){
		this.nom1=nom1;
		this.V1=V1;
		
	}
	public String getNom1() {
		return nom1;
	}
	public int getV1() {
		return V1;
	}
	
	robot fire(robot r) {
		robot r2 = new robot();
		if(!isDead(r)) {
			r.V1 -=2;
			System.out.println(r.nom1 +"a ete touche par "+this.nom1+" vie:"+r.V1);
		}
		return r;
	}
	private boolean isDead(robot r) {
		// TODO Auto-generated method stub
		if(r.V1==0) {
			System.out.println(r.nom1+ "est mort");
			return true;
	}
		return false;
}
	
	
	} 

	

