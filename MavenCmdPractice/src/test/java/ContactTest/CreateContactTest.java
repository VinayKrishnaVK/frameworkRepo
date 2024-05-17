package ContactTest;

import org.testng.annotations.Test;

public class CreateContactTest {

	String URL=System.getProperty("url");
	String BROWSER=System.getProperty("browser","chrome");
	String USERNAME=System.getProperty("username");
	String PASSWORD=System.getProperty("password");
	
	
	@Test
	public void createContactTest() {
		//create contact test
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println("Contact Created and Executed");
	}

	@Test
	public void createContactWithDateTest() {
		System.out.println("Contact Date Created and Executed");
	}

	@Test
	public void DeleteContactTest() {
		System.out.println("Contact Deleted");
	}
	@Test
	public void createContactWithOrgTest() {
		System.out.println("Contact with Org Created and Executed");
	}
}
