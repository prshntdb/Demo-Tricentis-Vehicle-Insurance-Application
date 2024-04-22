package ProjectTricentis;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2_Truck_Gold {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Salenium\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://sampleapp.tricentis.com/101/");
		driver.findElement(By.linkText("Truck")).click();
		driver.findElement(By.id("make")).click();
		driver.findElement(By.xpath("//option[@value='Mercedes Benz']")).click();
		WebElement kw=driver.findElement(By.id("engineperformance"));
		kw.sendKeys("2000");
		kw.click();
		WebElement D=driver.findElement(By.id("dateofmanufacture"));
		D.sendKeys("08/10/2022");
		D.click();
		driver.findElement(By.id("numberofseats"));
		driver.findElement(By.xpath("//option[@value='3']")).click();
		driver.findElement(By.id("fuel"));
		driver.findElement(By.xpath("//option[@value='Diesel']")).click();
		driver.findElement(By.id("payload")).sendKeys("1000");
		driver.findElement(By.id("totalweight")).sendKeys("50000");
		
		WebElement list=driver.findElement(By.id("listprice"));
		list.sendKeys("70000");
		list.click();
		WebElement license=driver.findElement(By.id("licenseplatenumber"));
		license.sendKeys("MH40BG4400");
		license.click();
		WebElement Annual=driver.findElement(By.id("annualmileage"));
		Annual.sendKeys("52222");
		Annual.click();
		driver.findElement(By.xpath("//button[@id='nextenterinsurantdata']")).click();
		
		
		
		//INSURANT DATA////
		
		WebElement First=driver.findElement(By.id("firstname"));
		First.sendKeys("Vaibhavi");
		First.click();
		WebElement Last=driver.findElement(By.id("lastname"));
		Last.sendKeys("Darge");
		Last.click();
		WebElement birth=driver.findElement(By.id("birthdate"));
		birth.sendKeys("02/21/1989");
		birth.click();
		driver.findElement(By.xpath("html/body/div/div/div/div/div/form/div/section[2]/div[4]/p/label[2]/span")).click();
		WebElement street=driver.findElement(By.id("streetaddress"));
		street.sendKeys("KarveRoad");
		street.click();
		driver.findElement(By.id("country")).click();
		driver.findElement(By.xpath("//option[@value='India']")).click();
		driver.findElement(By.id("zipcode")).sendKeys("411052");
		driver.findElement(By.id("city")).sendKeys("Pune");
		driver.findElement(By.id("occupation")).click();
		driver.findElement(By.xpath("//option[@value='Employee']")).click();
		driver.findElement(By.xpath("html/body/div/div/div/div/div/form/div/section[2]/div[10]/p/label[4]/span")).click();
	    driver.findElement(By.id("website")).sendKeys("https://www.google.com/");
	    driver.findElement(By.xpath("//button[@id='nextenterproductdata']")).click();
	
	    
	    
	    
	    
	    WebElement Start=driver.findElement(By.id("startdate"));
	    Start.sendKeys("09/21/2023");
	    Start.click();
	    driver.findElement(By.id("insurancesum"));
	    driver.findElement(By.xpath("//option[@value='30000000']")).click();
	    driver.findElement(By.id("damageinsurance")).click();
	    driver.findElement(By.xpath("//option[@value='Full Coverage']")).click();
	    driver.findElement(By.xpath("html/body/div/div/div/div/div/form/div/section[3]/div[4]/p/label[2]/span")).click();
	    driver.findElement(By.xpath("//button[@id='nextselectpriceoption']")).click();
	    
	    
	    String expectedPrice="1,830.00",actualPrice,expectedClaim="Submit",actualClaim,expectedDisscount="2",actualDisscount,expecteddWorldwideCover="Limited",actualWorldwideCover;
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
        	System.out.println("Sorry we can't process");
        }
        driver.findElement(By.xpath("//button[@id='nextsendquote']")).click();
        
        
        
        
        // Send Quote
        
        
        driver.findElement(By.id("email")).sendKeys("prathamesh96@gmail.com");
       driver.findElement(By.id("phone")).sendKeys("7039654878");
        driver.findElement(By.id("username")).sendKeys("prathamesh45");
        driver.findElement(By.id("password")).sendKeys("B1aYou47@");
        driver.findElement(By.id("confirmpassword")).sendKeys("B1aYou47@");
        driver.findElement(By.id("Comments")).sendKeys("No Comments");
       driver.findElement(By.xpath("//button[@id='sendemail']")).click();
       Thread.sleep(15000);
       WebElement Msg=driver.findElement(By.xpath("//button[@class='confirm']"));
       System.out.println(Msg.getText());
		System.out.println("Sending e-mail successfully!");
		Msg.click();
       
       driver.findElement(By.id("nav_home")).click();
        
       
	}
	}

