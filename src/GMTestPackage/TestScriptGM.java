package GMTestPackage;

import Practise.ChromeDriver;
import Practise.WebDriver;

public class TestScriptGM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String Key="webdriver.chrome.driver";
//		String Value="./chromedriver.exe";
		System.setProperty(Key, Value);
		String Key="webdriver.chrome.driver";
		String Value="./chromedriver.exe";
		
		WebDriver driver=new ChromeDriver();
	  
	  
	  driver.get("https://gurumavin.in/");
	  driver.get("https://gurumavin.in/student-account");
	   //Thread.sleep(10000);

	}

}
