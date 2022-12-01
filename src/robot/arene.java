package robot;

public class arene  extends robot {
		robot r1,r2;
		arene(){}
		public arene(robot a,robot b){
			this.r1=a;
			this.r2=b;
		}
		  public boolean isDead(robot r) {
	    	  if(r.V1==0) {
	    		  System.out.println(r.nom1+" est mort");
	    		  return true;
	    	  }
	    	  return false;
	      }
	      
		public arene fight( robot r1,robot r2) {
			while(r2.V1!=0) {
				r1.fire(r2);
				if(r2.V1!=0) {
					r2.fire(r1);
				}else {
					isDead(r2);
					System.out.println("combat terminer "+r1.nom1+" est vainqueur");
					
				}
			}
	        return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         robot r1= new robot("D2R2",10);
         robot r2= new robot("Data",10);
         arene A= new arene(r1,r2);
         A.fight(r1, r2);
	}

}
