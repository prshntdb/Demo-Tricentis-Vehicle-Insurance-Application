package ProjectTricentis;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_MotorCycle_Gold {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Salenium\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://sampleapp.tricentis.com/101/");
		driver.findElement(By.linkText("Motorcycle")).click();
		driver.findElement(By.id("make")).click();
		driver.findElement(By.xpath("//option[@value='Porsche']")).click();
		driver.findElement(By.id("model")).click();
		driver.findElement(By.xpath("//option[@value='Motorcycle']")).click();
		WebElement cylinder =driver.findElement(By.id("cylindercapacity"));
		cylinder.sendKeys("900");
		cylinder.click();
		WebElement engineer =driver.findElement(By.id("engineperformance"));
		engineer.sendKeys("1000");
		engineer.click();
		WebElement Date=driver.findElement(By.id("dateofmanufacture"));
		Date.sendKeys("09/01/2022");
		Date.click();
		driver.findElement(By.id("numberofseatsmotorcycle"));
		driver.findElement(By.xpath("//option[@value='2']")).click();
		WebElement list=driver.findElement(By.id("listprice"));
		list.sendKeys("80000");
		list.click();
		WebElement Annual=driver.findElement(By.id("annualmileage"));
		Annual.sendKeys("850");
		Annual.click();
		driver.findElement(By.xpath("//button[@id='nextenterinsurantdata']")).click();
		
		//INSUANT DATA//
		
		WebElement First=driver.findElement(By.id("firstname"));
		First.sendKeys("MONU");
		First.click();
		WebElement Last=driver.findElement(By.id("lastname"));
		Last.sendKeys("Dubey");
		Last.click();
		WebElement birth=driver.findElement(By.id("birthdate"));
		birth.sendKeys("02/21/1980");
		birth.click();
		driver.findElement(By.xpath("html/body/div/div/div/div/div/form/div/section[2]/div[4]/p/label/span")).click();
		WebElement street=driver.findElement(By.id("streetaddress"));
		street.sendKeys("Baner");
		street.click();
		driver.findElement(By.id("country")).click();
		driver.findElement(By.xpath("//option[@value='India']")).click();
		driver.findElement(By.id("zipcode")).sendKeys("411045");
		driver.findElement(By.id("city")).sendKeys("Pune");
		driver.findElement(By.id("occupation")).click();
		driver.findElement(By.xpath("//option[@value='Employee']")).click();
		driver.findElement(By.xpath("html/body/div/div/div/div/div/form/div/section[2]/div[10]/p/label/span")).click();
		driver.findElement(By.id("website")).sendKeys("https://www.google.com/");
		driver.findElement(By.xpath("//button[@id='nextenterproductdata']")).click();
		
		
		
		//Product Data//
		
		WebElement Start=driver.findElement(By.id("startdate"));
	    Start.sendKeys("09/20/2023");
	    Start.click();
	    driver.findElement(By.id("insurancesum"));
	    driver.findElement(By.xpath("//option[@value='7000000']")).click();
	    driver.findElement(By.id("damageinsurance")).click();
	    driver.findElement(By.xpath("//option[@value='No Coverage']")).click();
	    driver.findElement(By.xpath("html/body/div/div/div/div/div/form/div/section[3]/div[4]/p/label/span")).click();
	    driver.findElement(By.xpath("//button[@id='nextselectpriceoption']")).click();

	    
	    //Select Price Operation//
	    
	    
	    String expectedPrice="729.00",actualPrice,expectedClaim="Submit",actualClaim,expectedDisscount="2",actualDisscount,expecteddWorldwideCover="Limited",actualWorldwideCover;
	    actualPrice = driver.findElement(By.xpath("//span[@id='selectgold_price']")).getText();
        actualClaim = driver.findElement(By.xpath("//table[@id='priceTable']/tbody/tr[2]/td[3]")).getText();
        actualDisscount = driver.findElement(By.xpath("//table[@id='priceTable']/tbody/tr[3]/td[3]")).getText();
        actualWorldwideCover = driver.findElement(By.xpath("//table[@id='priceTable']/tbody/tr[4]/td[3]")).getText();
        
        if(expectedPrice.equals(actualPrice) && expectedClaim.equals(actualClaim) && expectedDisscount.equals(actualDisscount) && expecteddWorldwideCover.equals(actualWorldwideCover)) {
        	System.out.println("Test Case Pass");
        
        	driver.findElement(By.xpath("//table[@id='priceTable']/tfoot/tr/th[2]/label[2]/span")).click();
        }	
        else
        {
        	System.out.println("Test Case Fail");
        }
        driver.findElement(By.xpath("//button[@id='nextsendquote']")).click();
        
        
        //Send Quote//
        
        
        driver.findElement(By.id("email")).sendKeys("prshntdb396@gmail.com");
        driver.findElement(By.id("phone")).sendKeys("7038125265");
        driver.findElement(By.id("username")).sendKeys("prshntdb385");
        driver.findElement(By.id("password")).sendKeys("B1aYou47@");
        driver.findElement(By.id("confirmpassword")).sendKeys("B1aYou47@");
        driver.findElement(By.id("Comments")).sendKeys("No Comments");
        driver.findElement(By.xpath("//button[@id='sendemail']")).click();
        Thread.sleep(10000);
        WebElement Msg=driver.findElement(By.xpath("//button[@class='confirm']"));
        System.out.println(Msg.getText());
		System.out.println("Sending e-mail successfully!");
		Msg.click();
        
        driver.findElement(By.id("nav_home")).click();
        
        
        
        //For Gold //*/
	}

}
