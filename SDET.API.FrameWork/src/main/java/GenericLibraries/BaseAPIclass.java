package GenericLibraries;

import java.sql.SQLException;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.*;

public class BaseAPIclass {
	JavaLibrary jlib=new JavaLibrary();
	DatabaseLibrary dlib=new DatabaseLibrary();
	RestAssuredLibrary rlib=new RestAssuredLibrary();

	@BeforeSuite
	public void bsConfig() throws SQLException {
		dlib.connectDatabase();
		Reporter.log("====connected to DataBase======");
		
		baseURI=IconstantLibrary.appURL;
		port=IconstantLibrary.appPort;
	}
		
		@AfterSuite
		public void asConfig() throws SQLException {
			
		
		dlib.disconnectDB();
		Reporter.log("========Database Close=========");
		
		
	}
}
