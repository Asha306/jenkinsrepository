package pack1;

import org.testng.annotations.Test;

public class CreateLeadTest {
@Test
public void createLeadTest() {
	System.out.println("createLeadTest executed");
	String URL = System.getProperty("url");
	String BROWSER = System.getProperty("browser");
	String USERNAME = System.getProperty("username");
	String PASSWORD = System.getProperty("password");
	System.out.println(URL);
	System.out.println(BROWSER);
	System.out.println(USERNAME);
	System.out.println(PASSWORD);
}
@Test
public void modifyLeadTest() {
System.out.println("modifyLeadTest executed");	
	
	
	
}


}

