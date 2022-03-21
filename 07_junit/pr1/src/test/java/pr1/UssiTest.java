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
} 