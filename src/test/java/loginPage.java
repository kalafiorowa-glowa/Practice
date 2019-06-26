import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;

public class loginPage {

    public static void main(String[] args){

        // inicjalizacja chromedriver.exe
        System.setProperty("webdriver.chrome.driver", loginPage.class.getResource("chromedriver.exe").getPath());

        // otwarcie strony w chromie
        WebDriver driver = new ChromeDriver();
        driver.get ("http://automationpractice.com/index.php");

        // pobranie adresu i tytułu strony(do konsoli).
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        //powiększenie okna przeglądarki
        driver.manage().window().maximize();

        // kliknięcie przycisku
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();

        // zalogowanie do strony
        driver.findElement(By.id("email")).sendKeys("m.piasecka7@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("megson12345");
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();

        // ponowne pobranie adresu i tytułu strony
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        // zamknięcie strony
        driver.quit();
    }
}
