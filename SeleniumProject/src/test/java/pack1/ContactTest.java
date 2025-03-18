package pack1;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createContactTest() {
		String URL= System.getProperty("url");
		String BROWSER= System.getProperty("browser","chrome");
		String USERNAME= System.getProperty("username");
		String PASSWORD= System.getProperty("password");
		
	System.out.println(URL);
	System.out.println(BROWSER);
	System.out.println(USERNAME);
	System.out.println(PASSWORD);
	System.out.println("execute create contact test");
	
	}
 @Test
 public void modifycontactTest() {
	 System.out.println("execute modify contact test");
 }
 @Test
  
 public void print() {
	 System.out.println("on poll scm done");
 }

}
