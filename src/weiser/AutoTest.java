package weiser;


import java.awt.Color;
import org.junit.*;

public class AutoTest {
	
	@Test (expected=IllegalArgumentException.class)
	public void Objekterstellen () {
		Auto a = new Auto("Hund",Color.black,0);
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void SetText () {
		Auto a = new Auto();
		a.setType("test");
	}


}
