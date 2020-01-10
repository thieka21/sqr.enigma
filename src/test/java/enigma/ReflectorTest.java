package enigma;

import static org.junit.Assert.*;

import org.junit.Test;

import app.Main;

public class ReflectorTest {
			
		@Test
		public void test() {
			Reflector ref = new Reflector();
			int position = 0;
			int expected = position;
			int actual = ref.convertForward(position);
			assertEquals(expected, actual);
		
		}
}

