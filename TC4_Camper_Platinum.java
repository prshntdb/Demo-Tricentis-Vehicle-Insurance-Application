package ProjectTricentis;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4_Camper_Platinum {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Salenium\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://sampleapp.tricentis.com/101/");
		driver.findElement(By.linkText("Camper")).click();
		driver.findElement(By.id("make")).click();
		driver.findElement(By.xpath("//option[@value='Honda']")).click();
		WebElement KW=driver.findElement(By.id("engineperformance"));
		KW.sendKeys("1200");
		KW.click();
		WebElement Date=driver.findElement(By.id("dateofmanufacture"));
		Date.sendKeys("09/01/2022");
		Date.click();
		driver.findElement(By.id("numberofseats"));
		driver.findElement(By.xpath("//option[@value='5']")).click();
		driver.findElement(By.xpath("html/body/div/div/div/div/div/form/div[1]/section/div[5]/p/label[2]/span")).click();
		driver.findElement(By.id("fuel"));
		driver.findElement(By.xpath("//option[@value='Diesel']")).click();
		driver.findElement(By.id("payload")).sendKeys("900");
		driver.findElement(By.id("totalweight")).sendKeys("30000");
		WebElement list=driver.findElement(By.id("listprice"));
		list.sendKeys("70000");
		list.click();
		WebElement license=driver.findElement(By.id("licenseplatenumber"));
		license.sendKeys("MH40BG0007");
		license.click();
		WebElement Annual=driver.findElement(By.id("annualmileage"));
		Annual.sendKeys("66222");
		Annual.click();
		driver.findElement(By.id("nextenterinsurantdata")).click();
		
		//INSURANT DATA//
		
		WebElement First=driver.findElement(By.id("firstname"));
		First.sendKeys("Rahul");
		First.click();
		WebElement Last=driver.findElement(By.id("lastname"));
		Last.sendKeys("Sunka");
		Last.click();
		WebElement birth=driver.findElement(By.id("birthdate"));
		birth.sendKeys("02/21/1991");
		birth.click();
		driver.findElement(By.xpath("html/body/div/div/div/div/div/form/div/section[2]/div[4]/p/label[1]/span")).click();
		WebElement street=driver.findElement(By.id("streetaddress"));
		street.sendKeys("NandedCity");
		street.click();
		driver.findElement(By.id("country")).click();
		driver.findElement(By.xpath("//option[@value='India']")).click();
		driver.findElement(By.id("zipcode")).sendKeys("411052");
		driver.findElement(By.id("city")).sendKeys("Pune");
		driver.findElement(By.id("occupation")).click();
		driver.findElement(By.xpath("//option[@value='Employee']")).click();
		driver.findElement(By.xpath("html/body/div/div/div/div/div/form/div/section[2]/div[10]/p/label[3]/span")).click();
	    driver.findElement(By.id("website")).sendKeys("https://www.google.com/");
	    driver.findElement(By.xpath("//button[@id='nextenterproductdata']")).click();
	    
	    //PRODUCT DATA//
	    
	    
	    WebElement Start=driver.findElement(By.id("startdate"));
	    Start.sendKeys("09/21/2023");
	    Start.click();
	    driver.findElement(By.id("insurancesum"));
	    driver.findElement(By.xpath("//option[@value='25000000']")).click();
	    driver.findElement(By.id("damageinsurance")).click();
	    driver.findElement(By.xpath("//option[@value='No Coverage']")).click();
	    driver.findElement(By.xpath("html/body/div/div/div/div/div/form/div/section[3]/div[4]/p/label[2]/span")).click();
	    driver.findElement(By.xpath("//button[@id='nextselectpriceoption']")).click();
	    
	    
	    //SELECT PRICE OPTION//
	    
	    
	    String expectedPrice="1,950.00",actualPrice,expectedClaim="Submit",actualClaim,expectedDisscount="5",actualDisscount,expecteddWorldwideCover="Limited",actualWorldwideCover;
	    actualPrice = driver.findElement(By.xpath("//span[@id='selectplatinum_price']")).getText();
        actualClaim = driver.findElement(By.xpath("//table[@id='priceTable']/tbody/tr[2]/td[4]")).getText();
        actualDisscount = driver.findElement(By.xpath("//table[@id='priceTable']/tbody/tr[3]/td[4]")).getText();
        actualWorldwideCover = driver.findElement(By.xpath("//table[@id='priceTable']/tbody/tr[4]/td[4]")).getText();
        
        if(expectedPrice.equals(actualPrice) && expectedClaim.equals(actualClaim) && expectedDisscount.equals(actualDisscount) && expecteddWorldwideCover.equals(actualWorldwideCover)) {
        	System.out.println("Test Case Pass");
        
        	driver.findElement(By.xpath("//table[@id='priceTable']/tfoot/tr/th[2]/label[3]/span")).click();
        }	
        else
        {
        	System.out.println("Test Case Fail");
        }
        driver.findElement(By.xpath("//button[@id='nextsendquote']")).click();
        
        
        //Send Quote//
        
        
        driver.findElement(By.id("email")).sendKeys("RahulSunka@gmail.com");
        driver.findElement(By.id("phone")).sendKeys("7038169265");
        driver.findElement(By.id("username")).sendKeys("Rahul385");
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
        
       
	    
		
	}

}
