

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class ShopizerUserStories {
    static WebDriver driver = new ChromeDriver();
    @BeforeClass
    public static void setup(){
        System.out.println("BeforeClass  --  setup");
        driver.get("http://localhost:8080/");
    }
    @Test
    public void search()
    {
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='searchField']")).click();
        driver.findElement(By.xpath("//input[@id='searchField']")).sendKeys("hand bags");
        driver.findElement(By.xpath("//div[2]/input")).click();
    }
    @Test
    public void register()
    {
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
        driver.findElement(By.xpath("//li[@id='customerAccount']//li[1]//a[1]")).click();
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("MyYellowTeam12");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Sprintteam12");
        driver.findElement(By.xpath("//select[@id='registration_country']")).sendKeys("Australia");
        driver.findElement(By.xpath("//select[@id='customer_zones']")).sendKeys("Western Australia");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys("MyTeamyellow12@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("iths125@");
        driver.findElement(By.xpath("//input[@id='passwordAgain']")).sendKeys("iths125@");
        driver.findElement(By.xpath("//button[@class='btn btn-default login-btn']")).click();
    }

   @AfterClass
    public static void close() {
        System.out.println("AfterClass close");
        driver.close();
    }
}
