package Comprehensive.Comprehensive_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Two_makemytrip {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "C:\\Intel\\edgedriver_win64\\msedgedriver.exe");
		// ChromeOptions options = new ChromeOptions();

		// options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

//				WebDriverManager.chromedriver().setup();

//				WebDriver driver = new ChromeDriver();

		driver.get("https://www.makemytrip.com");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/span")).click();

		driver.findElement(By.id("fromCity")).click();

		driver.findElement(

				By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"))

				.sendKeys("HYD");

		Thread.sleep(500);

		driver.findElement(

				By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"))

				.sendKeys(Keys.ARROW_DOWN);

		Thread.sleep(500);

		driver.findElement(

				By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"))

				.sendKeys(Keys.ENTER);

		driver.findElement(By.id("toCity")).click();

		driver.findElement(

				By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/input"))

				.sendKeys("MAA");

		Thread.sleep(500);

		driver.findElement(

				By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/input"))

				.sendKeys(Keys.ARROW_DOWN);

		Thread.sleep(500);

		driver.findElement(

				By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/input"))

				.sendKeys(Keys.ENTER);

		try {

			driver.findElement(By.id("departure")).click();

		} catch (Exception e) {

		}

		Thread.sleep(100);

		driver.findElement(By.cssSelector("div[aria-label=\"Thu Oct 26 2023\"]")).click();

		Thread.sleep(500);

		try {

			driver.findElement(By.cssSelector("div[data-cy=\"returnArea\"]")).click();

		} catch (Exception e) {

		}

		Thread.sleep(100);

		driver.findElement(By.cssSelector("div[aria-label=\"Sat Nov 04 2023\"]")).click();

		Thread.sleep(100);

		driver.findElement(By.cssSelector("p[data-cy=\"submit\"]")).click();

		Thread.sleep(15000);

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/span")).click();

		Thread.sleep(500);

		if (driver.findElement(By.xpath("//*[@id=\"listing-id\"]/div/div[1]/p/b")).getText()

				.equals("Hyderabad → Chennai"))

			System.out.println("Page successfully loaded");

		else

			System.out.println("Page not loaded");

		driver.quit();

	}

}