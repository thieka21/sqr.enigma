package enigma;

import static org.junit.Assert.*;

import org.junit.Test;

import app.Main;

public class RotorTest {

	@Test
	public void test() {
		Rotor rot = new Rotor();
		int posit = 0;
		int expected = posit;
		int actual = rot.convertForward(posit);
		assertEquals(expected, actual);
		
	}

}
