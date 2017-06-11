package kirikotk;

import org.junit.*;
import static org.junit.Assert.*;

public class EsimeneTest{
	@Test
	public void isikuTest(){
		Rakendus r=new Rakendus();
		assertEquals("Tere, Kirill Kotkas, Teie telefoninumber on 5073922", r.isik("Kirill", "Kotkas", "5073922"));
	}

	@Test
	public void koodiTest(){
		Rakendus r=new Rakendus();

		assertEquals(7, r.kood("5073922").length());
	}

}