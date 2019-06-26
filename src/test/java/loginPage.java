import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;

public class loginPage {

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", loginPage.class.getResource("chromedriver.exe").getPath());

        WebDriver driver = new ChromeDriver();
        driver.get ("http://automationpractice.com/index.php");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();

        driver.findElement(By.id("email")).sendKeys("m.piasecka7@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("megson12345");
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }
}