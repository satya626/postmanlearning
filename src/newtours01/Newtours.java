package newtours01;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Newtours {
		WebDriver driver;
		
		@FindBy(xpath="//*[@id='clssicon']/img")
		WebElement clickmenu;
		
		@FindBy(linkText="Sign In")
		WebElement clicksignin;
		
		//@FindBy(xpath="//*[@id='sidemenucontent']/div/a[1]")
		//WebElement clicksignin;
		
		@FindBy(name="username")
		WebElement userName;

		@FindBy(name="password")
		WebElement pwd; 
		
		@FindBy(xpath="//*[@id='LoginForm2020']/div[3]/input")
		WebElement signin;

	public Newtours(WebDriver driver){

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}



	public void clickmenu(){

		  clickmenu.click();
	  }
	public void clicksignin(){

		  clicksignin.click();
	}

	//setters

	public void setUserName(String strUserName){

		userName.sendKeys(strUserName);     
	}

	//Set password in password textbox

	public void setPassword(String strPassword){

		pwd.sendKeys(strPassword);

	}
	  public void login(){

	    signin.click();

	  }

	//getters
	public WebElement getclickmenu(){
		  return clickmenu;
	}
	public WebElement getclicksignin(){
		  return  clicksignin;
	}	  
	public WebElement getUserName(){
		  return userName;
	}

	public WebElement getPassword(){
		  return pwd;
	}
	public WebElement getlogin(){
		  return signin;
	}
		// TODO Auto-generated method stub
		
	}	  
