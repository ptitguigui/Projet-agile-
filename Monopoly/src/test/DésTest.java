package test;
im

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DésTest(){


	@Test
	public void dé(){
	Dés dés = new Dés();
	dés.roll();
	}

/*
@Test
public void note_without_info_should_give_NONE() {
	Note note = new Note();
	assertEquals(note.getType(), "NONE" );
}
*/
}