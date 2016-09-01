import java.util.Random;

public class Dés {

	int d=0;
	
	
	public void roll(){
		Random r = new Random();
		d = r.nextInt(5)+1;
	}
	
}
