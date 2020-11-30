package newtours01;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.PageFactory;

	import cucumber.api.PendingException;
	import cucumber.api.java.Before;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;
	import newtours01 .Newtours;

	public class NT_cucumber {
		
		WebDriver driver;
		Newtours universalclass;
		@Before
	    public void openBrowsser() {
	    //driver = new FirefoxDriver();
	        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	         driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    universalclass = new Newtours(driver);
	   universalclass = PageFactory.initElements(driver,Newtours.class );
	    
		}
		@Given("^User is on Home Page$")
		public void user_is_on_Home_Page()  {
		    
			driver.get("https://www.universalclass.com/");
		    
		}

		@When("^User Navigate to login Page$")
		public void user_Navigate_to_login_Page()  {
		
			universalclass.clickmenu();
		  
		    
		}
		@When("^User Navigate to signin Page$")
		public void user_Navigate_to_signin_Page()  {
			universalclass.clicksignin();
		}
		    
			
		  
			
		    

		// Scenerio 2
		@When("^User enters Invalid UserName and Password$")
		public void user_enters_Invalid_UserName_and_Password() throws Throwable {
			universalclass.setUserName("konathalasaranya1998@gmail.com");
			Thread.sleep(3000);
			universalclass.setPassword("123456789");
			Thread.sleep(3000);
			universalclass.login();
		 
			
			
			                                         
		}

		

		
		

		


	}
