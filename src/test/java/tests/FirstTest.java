package tests;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

  WebDriver driver;

  @Test
  public void someChecks() {
    System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");

    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.get("https://github.com/login");

    WebElement loginField = driver.findElement(By.id("login_field"));
    WebElement passwordField = driver.findElement(By.id("password"));

    loginField.sendKeys("skrmnyi");
    passwordField.sendKeys("920625Skrmnyi!");

    WebElement signInButton = driver.findElement(By.xpath("//input[@value='Sign in']"));
    signInButton.click();

    WebElement repo = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div/aside/div/loading-context/div/div[1]/div/ul/li[2]/div/div/a"));
    repo.click();


    WebElement codeTab = driver.findElement(By.id("code-tab"));
    WebElement branchesTab = driver.findElement(By.partialLinkText("branch"));
    WebElement tagsTab = driver.findElement(By.partialLinkText("tags"));
    WebElement editRepositoryDetailsButton = driver.findElement(By.className("float-right"));
    WebElement watchersButton = driver.findElement(By.partialLinkText("watching"));
    WebElement branchDropDownButton = driver.findElement(By.className("dropdown-caret"));
    WebElement goToFileButton = driver.findElement(By.partialLinkText("to file"));
    WebElement addFileDropDownButton = driver.findElement(By.partialLinkText("Add"));
    WebElement codeDropDownButton = driver.findElement(By.tagName("summary"));
    WebElement addReadmeButton = driver.findElement(By.partialLinkText("README"));

    driver.quit();
  }
}



/// Action tab - Xpath's
