package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

import Base.Base;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser extends Base {

	Properties prop = new Properties();

	public Browser() {

	}

	public void InvokeBrowser(String browserName) throws IOException {

		try {
			InputStream input = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\java\\Resources\\data.properties");

			// load a properties file
			prop.load(input);
		} catch (FileNotFoundException e) {
			System.out.println("Properties file not found");
		}
		if (browserName.equalsIgnoreCase(prop.getProperty("Browser"))) {
			chrome();
		}

	}

	public void chrome()

	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public void setURL(String URL) {

		driver.get(URL);
	}

	public void closeBrowser() {
		driver.close();

	}
}
