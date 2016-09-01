package test;
import gameplay.Dés;

import static org.junit.Assert.*;

import org.junit.Test;

public class DésTest{

	@Test
	public void dé_valable(){
	Dés dés = new Dés();
	dés.roll();
	assertTrue(dés.getD1()>= 1 && dés.getD1()<=6);
	assertTrue(dés.getD2()>= 1 && dés.getD2()<=6);
	}

	
	@Test
	public void dé_double(){
		Dés dés = new Dés();
		dés.setD1(5);
		dés.setD2(5);
		assertTrue(dés.estDouble());
	}
	
	@Test
	public void dé_non_double(){
		Dés dés = new Dés();
		dés.setD1(5);
		dés.setD2(2);
		assertFalse(dés.estDouble());
	}
	@Test
	public void triple_double(){
		Dés dés = new Dés();
		for(int i=0; i<3; i++){
			dés.setD1(5);
			dés.setD2(5);
			dés.estDouble();
		}
		assertTrue(dés.tripleDouble());
	}
	
}