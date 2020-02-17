import static io.restassured.RestAssured.*; 
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class APITesting {

	@Test
	public void getUserById() {
		
	String uriBase = "https://jsonplaceholder.typicode.com/todos";
		
	// ignorar o uso do HTTPS e acessar a URI
	given().
	 		relaxedHTTPSValidation().
			param("1");
			
	when().
			get(uriBase + "/1").
			
	then().
	 		body("title",  equalTo("delectus aut autem"));
	System.out.println("User validated.");				
				
	
	}
}
