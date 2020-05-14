

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdminLogin {
    static WebDriver driver = new ChromeDriver();
    @BeforeClass
    public static void setup(){
        System.out.println("BeforeClass  --  setup");
        driver.get("http://localhost:8080/admin/logon.html");
    }
    @Test
    public void login()
    {
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//form[@id='logonForm']//input[@id='username']")).sendKeys("admin@shopizer.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        driver.findElement(By.xpath("//a[@id='formSubmitButton']")).click();
    }
    @AfterClass
    public static void close() {
        System.out.println("AfterClass close");
        driver.close();
    }
}
