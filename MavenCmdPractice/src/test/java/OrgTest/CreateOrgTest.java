 package OrgTest;

import org.testng.annotations.Test;

public class CreateOrgTest {

	String URL=System.getProperty("url");
	String BROWSER=System.getProperty("browser","chrome");
	String USERNAME=System.getProperty("username");
	String PASSWORD=System.getProperty("password");
	@Test
	public void createOrgTest() {
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println("Org Created and Executed");
	}

	@Test
	public void createOrgWithPhoneTest() {
		System.out.println("Org Phone Created and Executed");
	}

	@Test
	public void createOrgWithIndTest() {
		System.out.println("Org with Industry Created and Executed");
	}
}
