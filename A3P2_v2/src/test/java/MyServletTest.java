import junit.framework.TestCase;

public class MyServletTest extends TestCase {

	private MyServlet obj;
	
	protected void setUp() throws Exception {
		obj = new MyServlet();
	}

	protected void tearDown() throws Exception {
		obj = null;
	}

	public void testCheckLogin() {
		String testCorrectName = "dave";
		String testCorrectPass = "simpsons";
		
		obj.correctName = testCorrectName;
		obj.correctPass = testCorrectPass;
		
		String testWrongName = "jhon";
		String testWrongPass = "123";
		
		assertFalse(obj.checkLogin(testWrongName, testWrongPass));
		assertTrue(obj.checkLogin(testCorrectName, testCorrectPass));
	}

}
