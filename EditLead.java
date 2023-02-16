package Week2Day2;


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class EditLead {

		public static void main(String[] args) {
			ChromeDriver driver= new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			
			//login the details
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.id("username")).sendKeys("demoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ranjithkumar");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ranjith");
			driver.findElement(By.name("departmentName")).sendKeys("Automation");
			driver.findElement(By.name("description")).sendKeys("joined in TestLeaf as a Automation tester");
			driver.findElement(By.name("primaryEmail")).sendKeys("ranjithramesh7810@gmail.com");
			WebElement element = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			
			// dropdoown using xpath
			
			Select dropdown = new Select(element);
			dropdown.selectByVisibleText("New York");
			driver.findElement(By.className("smallSubmit")).click();
			driver.findElement(By.xpath("((//div[@class='frameSectionExtra'])[2]/a)[3]")).click();
			driver.findElement(By.id("updateLeadForm_description")).clear();
			driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("lead has joined in client company");
			driver.findElement(By.xpath("//input[@value='Update']")).click();
			String title = driver.getTitle();
			System.out.println(title);
		

}
	}
