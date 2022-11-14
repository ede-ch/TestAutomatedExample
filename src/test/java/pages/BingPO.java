package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BingPO extends BasePO {

    @FindBy(name = "q")
    public WebElement inputPesquisa;

    @FindBy(className = "sb_count")
    public WebElement classResultadoPesquisa;

    /**
     * Construtor para criação da página do Bing.
     * 
     * @param driver - Drive da página do Bing.
     */
    public BingPO(WebDriver driver) {
        super(driver);
    }

    /**
     * Método que irá efetuar uma pesquisa baseada no texto passado como parâmetro.
     * 
     * @param texto - Texto que será pesquisado.
     */
    public void pesquisar(String texto) {
        inputPesquisa.sendKeys(texto + Keys.ENTER);
    }

    /**
     * Método que retorna o resultado aproximado da pesquisa.
     * 
     * @return - Resultado da pesquisa.
     */
    public String obterResultado() {
        return classResultadoPesquisa.getText();
    }
}
