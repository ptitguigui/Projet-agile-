package gameplay;
import java.util.Random;

public class Dés {

	int d1=0;
	int d2=0;
	int cpt;
	
	public void roll(){
		Random r = new Random();
		d1 = r.nextInt(5)+1;
		d2 = r.nextInt(5)+1;
	}
	
	public int getD1(){
		return d1;
	}
	public int getD2(){
		return d2;
	}
	public boolean estDouble(){
		if(d1==d2){
			cpt++;
			return true;
		}else{
			cpt=0;
			return false;
		}
	}
	public boolean tripleDouble(){
		if(cpt == 3){
			cpt=0;
			System.out.println("Vous avez fait 3 double");
			return true;
		}else{
			return false;
		}
	}
 
	
}
