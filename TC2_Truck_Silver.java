package ProjectTricentis;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2_Truck_Silver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Salenium\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://sampleapp.tricentis.com/101/");
		driver.findElement(By.linkText("Truck")).click();
		driver.findElement(By.id("make")).click();
		driver.findElement(By.xpath("//option[@value='Mazda']")).click();
		WebElement kw=driver.findElement(By.id("engineperformance"));
		kw.sendKeys("1800");
		kw.click();
		WebElement D=driver.findElement(By.id("dateofmanufacture"));
		D.sendKeys("09/01/2022");
		D.click();
		driver.findElement(By.id("numberofseats"));
		driver.findElement(By.xpath("//option[@value='2']")).click();
		driver.findElement(By.id("fuel"));
		driver.findElement(By.xpath("//option[@value='Gas']")).click();
		driver.findElement(By.id("payload")).sendKeys("1000");
		driver.findElement(By.id("totalweight")).sendKeys("5000");
		
		WebElement list=driver.findElement(By.id("listprice"));
		list.sendKeys("100000");
		list.click();
		WebElement license=driver.findElement(By.id("licenseplatenumber"));
		license.sendKeys("MH40BG4488");
		license.click();
		WebElement Annual=driver.findElement(By.id("annualmileage"));
		Annual.sendKeys("5000");
		Annual.click();
		driver.findElement(By.xpath("//button[@id='nextenterinsurantdata']")).click();
		
		
		
		//INSURANT DATA////
		
		WebElement First=driver.findElement(By.id("firstname"));
		First.sendKeys("Prashant");
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
	    
	    //WebElement picture = driver.findElement(By.xpath("//button[@class='ideal-file-upload']"));
	    //picture.sendKeys("D:\\download.jpeg");
	     //driver.findElement(By.id("open")).click();
	    driver.findElement(By.xpath("//button[@id='nextenterproductdata']")).click();
	    
	    
	    
	    WebElement Start=driver.findElement(By.id("startdate"));
	    Start.sendKeys("09/20/2023");
	    Start.click();
	    driver.findElement(By.id("insurancesum"));
	    driver.findElement(By.xpath("//option[@value='7000000']")).click();
	    driver.findElement(By.id("damageinsurance")).click();
	    driver.findElement(By.xpath("//option[@value='No Coverage']")).click();
	    driver.findElement(By.xpath("html/body/div/div/div/div/div/form/div/section[3]/div[4]/p/label/span")).click();
	    driver.findElement(By.xpath("//button[@id='nextselectpriceoption']")).click();
	    
	    
	    String expectedPrice="281.00",actualPrice,expectedClaim="No",actualClaim,expectedDisscount="No",actualDisscount,expecteddWorldwideCover="No",actualWorldwideCover;
	    actualPrice = driver.findElement(By.xpath("//span[@id='selectsilver_price']")).getText();
        actualClaim = driver.findElement(By.xpath("//table[@id='priceTable']/tbody/tr[2]/td[2]")).getText();
        actualDisscount = driver.findElement(By.xpath("//table[@id='priceTable']/tbody/tr[3]/td[2]")).getText();
        actualWorldwideCover = driver.findElement(By.xpath("//table[@id='priceTable']/tbody/tr[4]/td[2]")).getText();
        
        if(expectedPrice.equals(actualPrice) && expectedClaim.equals(actualClaim) && expectedDisscount.equals(actualDisscount) && expecteddWorldwideCover.equals(actualWorldwideCover)) {
        	System.out.println("Test Case Pass");
        
        	driver.findElement(By.xpath("//table[@id='priceTable']/tfoot/tr/th[2]/label[1]/span")).click();
        }	
        else
        {
        	System.out.println("Sorry we can't process");
        }
        driver.findElement(By.xpath("//button[@id='nextsendquote']")).click();
        
      
        
        // Send Quote
        
        
        driver.findElement(By.id("email")).sendKeys("prshntdb396@gmail.com");
        driver.findElement(By.id("phone")).sendKeys("7038125265");
        driver.findElement(By.id("username")).sendKeys("prshntdb385");
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
