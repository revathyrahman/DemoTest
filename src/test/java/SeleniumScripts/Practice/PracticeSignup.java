package SeleniumScripts.Practice;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Base;
import Pages.SignUp;

import Utility.Browser;

public class PracticeSignup extends Base {

	@BeforeClass
	public void setup() throws IOException {
		new Browser().InvokeBrowser("chrome");

	}

	@BeforeMethod
	public void setURL() {
		new Browser().setURL("https://courses.letskodeit.com/register");
	}

	@Test
	public void Signup() throws Exception {

		new SignUp().createAccount();
		new Browser().closeBrowser();
	}

}
