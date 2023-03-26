package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

public class Hooks {

    //private static ChromeDriver driver;
    private static WebDriver driver;
    private static int numberOfCase = 0;
    private DriverManager driverManager;

    @Before
    public void setUp(){
        numberOfCase++;
        System.out.println("Se esta ejecutando el escenario Nro: " + numberOfCase);
        //System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver/chromedriver.exe");
        //driver = new ChromeDriver();
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.get("https://www.imalittletester.com/");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        System.out.println("El escenario Nro: " + numberOfCase + "se ejecuto correctamente.");
        driverManager.quitDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }

}
