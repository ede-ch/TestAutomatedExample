package testerp;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public abstract class BaseTest {

    protected static WebDriver driver;
    private static final String URL_BASE = "https://www.bing.com/";
    private static final String CAMINHO_DRIVER = "src/test/java/resource/msedgedriver107.0.1418.42.exe";

    @BeforeClass
    public static void inicializar() {
        System.setProperty("webdriver.edge.driver", CAMINHO_DRIVER);
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);

    }

    @AfterClass
    public static void finalizar() {
        driver.quit();
    }

}
