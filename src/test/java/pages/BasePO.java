package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Classe base para criação das novas PageObjects.
 * Todas as pages devem ser herdadas desta classe.
 */
public abstract class BasePO {

    /** Driver base que será usado nas pages. */
    protected WebDriver driver;

    /**
     * Construtor base para criaçao da fábrica de elementos (PageFactory).
     * 
     * @param driver - Driver da página atual.
     */
    public BasePO(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
