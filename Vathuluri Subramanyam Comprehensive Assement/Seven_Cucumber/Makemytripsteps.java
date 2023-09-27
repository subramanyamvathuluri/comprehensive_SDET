package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Makemytripsteps {

    WebDriver driver;

    @Given("I launch edge browser")
    public void i_launch_edge_browser() {
        System.setProperty("webdriver.edge.driver", "C:\\Intel\\edgedriver_win64\\msedgedriver.exe");
        // ChromeOptions options = new ChromeOptions();

        // options.addArguments("--remote-allow-origins=*");

        driver = new EdgeDriver();

        driver.manage().window().maximize();
    }

    @When("I open the homepage")
    public void i_open_the_homepage() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        driver.get("https://www.makemytrip.com");
        Thread.sleep(1000);
    }

    @Then("I choose Destinations")
    public void i_choose_destinations() throws InterruptedException {
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

    }

    @Then("I choose the dates")
    public void i_choose_the_dates() throws InterruptedException {
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

    }

    @Then("I press on search")
    public void i_press_on_search() throws InterruptedException {
        driver.findElement(By.cssSelector("p[data-cy=\"submit\"]")).click();

        Thread.sleep(15000);
    }

    @Then("I verify the page loading")
    public void i_verify_the_page_loading() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/span")).click();

        Thread.sleep(500);

        if (driver.findElement(By.xpath("//*[@id=\"listing-id\"]/div/div[1]/p/b")).getText()

                .equals("Hyderabad → Chennai"))

            System.out.println("Page successfully loaded");

        else

            System.out.println("Page not loaded");
        Thread.sleep(10000);
    }

    @And("I close the browser")
    public void i_close_the_browser() {
        driver.quit();
    }

}
