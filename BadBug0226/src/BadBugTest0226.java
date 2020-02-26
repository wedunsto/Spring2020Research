import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BadBugTest0226 {
	private Main testMain = new Main();
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void SidesTest() {
		boolean result = testMain.EqualSides(5,5,5,5);
		assertEquals(result,true);
	}
	
	@Test
	void AngleTest() {
		boolean result = testMain.EqualAngles(90,90,90,90);
		assertEquals(result,true);
	}
	
	@Test
	void ConnectivityTest() {
		boolean result = testMain.IsConnected(0,5,5,10,10,5,5,0);
		assertEquals(result,true);
	}
}
