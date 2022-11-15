package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPO extends BasePO {

    /**
     * Construtor da classe.
     * 
     * @param driver - Driver do navegador.
     */
    public LoginPO(WebDriver driver) {
        super(driver);

    }

    /**
     * Elementos da página.
     */
    @FindBy(id = "id_login")
    public WebElement inputLogin;

    @FindBy(id = "id_senhaLogin")
    public WebElement inputPassword;

    @FindBy(id = "button")
    public WebElement buttonLogin;

    @FindBy(id = "alert_login")
    public WebElement alertDanger;

    /**
     * Método para escrever nos campos de login e senha.
     * 
     * @param input - Campo a ser preenchido.
     * @param texto - Texto a ser escrito.
     */
    public void escrever(WebElement input, String texto) {
        input.clear();
        input.sendKeys(texto + Keys.TAB);
    }

    /**
     * Método para o alerta de erro.
     * 
     * @return - Retorna o texto do alerta.
     */
    public String getAlertaTexto() {
        return this.alertDanger.getText();
    }

    /**
     * Método para executar a ação de logar.
     * @param login - Login do usuário.
     * @param password - Senha do usuário.
     */
    public void ExecutarAcaoDeLogar(String login, String senha) {
        escrever(inputLogin, login);
        escrever(inputPassword, senha);
        buttonLogin.click();
    }

}
