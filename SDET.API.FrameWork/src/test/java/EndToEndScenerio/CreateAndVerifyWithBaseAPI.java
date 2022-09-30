package EndToEndScenerio;

import org.testng.annotations.Test;

import GenericLibraries.BaseAPIclass;
import GenericLibraries.EndPointLibrary;
import GenericLibraries.JavaLibrary;
import POJO_Libraries.ProjectLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateAndVerifyWithBaseAPI extends BaseAPIclass  {
	@Test
	public void createProject() {
		JavaLibrary ran=new JavaLibrary();
		//Create Pre Requisite
		ProjectLibrary plib=new ProjectLibrary("APIframework", "API"+ran.Random(), "created", 1);
		
		//send the req
		given()
		.body(plib)
		.contentType(ContentType.JSON)
		.when()
		.post(EndPointLibrary.createProject)
		.then()
		.log().all();
		
		
		
		
		
	
	}

}
