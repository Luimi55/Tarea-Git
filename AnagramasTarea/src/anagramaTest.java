import static org.junit.Assert.*;

import org.junit.Test;

public class anagramaTest {

	@Test
	public void test() {
		Anagrama anagrama = new Anagrama();
		boolean resultado = anagrama.anagramas("raton", "antro");
		assertEquals(true, resultado);
	}

}
