package pr1;

import org.junit.*;
import static org.junit.Assert.*;

public class UssiTest{
	ManguTuum tuum;
	@Before public void alustus(){
		tuum=new JaagupiTuum();
	}
	@Test public void testPeaAlgusNullis(){
		int[][] kohad=tuum.ussiKohad();
		assertEquals(0, kohad[0][0]);
		assertEquals(0, kohad[0][1]);
	}
	@Test public void testParemale(){
		tuum.paremale();
		tuum.samm();
		int[][] kohad=tuum.ussiKohad();
		assertEquals(1, kohad[0][0]);
		assertEquals(0, kohad[0][1]);
		//Kohandage oma klassi nõnda, et test läheks läbi
	}
} 