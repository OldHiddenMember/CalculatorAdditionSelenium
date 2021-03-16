package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinitions {


private WebDriver driver;
	
		@Given("I have entered {int} into the calculator")
		public void i_have_entered_into_the_calculator(Integer int1) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jesper\\eclipse\\Drivers\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.get("https://www.marshu.com/articles/calculate-addition-calculator-add-two-numbers.php");
			// Thread.sleep(5000); // Let the user actually see something!
			WebElement numBox1 = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/form/p[1]/input"));
			numBox1.sendKeys("123");
			
		}


		@Given("I have also entered {int} into the calculator")
		public void i_have_also_entered_into_the_calculator(Integer int1) {
			WebElement numBox2 = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/form/p[2]/input"));
			numBox2.sendKeys("234");
		}
		@When("I press add")
		public void i_press_add() {
		  WebElement addBox = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/form/p[4]/input"));
			addBox.click();	  
		}
		@Then("the result should be {int} on the screen")
		public void the_result_should_be_on_the_screen(Integer int1) {
			 WebElement resultBox = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/form/p[6]/input"));
			 
			assertEquals("357",resultBox.getText()); 
			
		}



}
