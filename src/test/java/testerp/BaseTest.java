package testerp;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public abstract class BaseTest {

    /**
     * Driver do navegador.
     */
    protected static WebDriver driver;
    private static final String URL_BASE = "https://pergamum.unipampa.edu.br/biblioteca_s/php/login_usu.php?flag=index.php";
    private static final String CAMINHO_DRIVER = "src/test/java/resource/msedgedriver107.0.1418.42.exe";
    String csv = "teste.csv";

    /**
     * Método para iniciar o driver do navegador.
     */
    @BeforeClass
    public static void inicializar() {
        System.setProperty("webdriver.edge.driver", CAMINHO_DRIVER);
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);

    }

    /**
     * Método para fechar o driver do navegador.
     */
    @AfterClass
    public static void finalizar() {
        driver.quit();
    }

}
