package robot;
import java.util.Random;
public class fight extends robot {
	fight f1;
	fight f2;
	String nom;
	int vie;
	boolean seed;
	
	fight(){}
	fight(fight f,fight k){
		this.f1=f;
		this.f2=k;
	}
	fight(String s,int e){
		this.nom=s;
		this.vie=e;
	}
	fight fire (fight r) {
		if(nextBoolean()==true){
			r.V1=r.V1;
			System.out.println(r.nom+" a ete rate par "+this.nom+" .vie "+r.V1);
			}else if(nextBoolean()==false){
				r.V1 -= 2;
				System.out.println(r.nom +" a ete rate par "+this.nom+" .vie "+r.V1);
			}
			return r;
	}
		private boolean nextBoolean() {
			Random rand= new Random();
			seed=rand.nextBoolean();
			return seed;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            fight f1=new fight("satori",11);
            fight f2=new fight("john",11);
            f1.fire(f2);
            f2.fire(f1);
            
	}

}
