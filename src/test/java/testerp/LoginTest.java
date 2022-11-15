package testerp;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import pages.LoginPO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginTest extends BaseTest {
    // WebDriverWait wait = new WebDriverWait(driver, 10);

    private static LoginPO loginPage;

    /**
     * Método para ser incializado antes de todos os testes.
     */
    @BeforeClass
    public static void prepararTestes() {
        loginPage = new LoginPO(driver);
    }

    /**
     * Testes baseados nos elementos da página.
     */
    @Test
    public void TC001_CamposEmBranco() {
        loginPage.ExecutarAcaoDeLogar("", "");
        String alerta = loginPage.getAlertaTexto();
        assertEquals(alerta, "Para prosseguir complete os campos destacados!");

    }

    @Test
    public void TC002_LogarComEmailIncorretoESenhaEmBranco() {
        loginPage.ExecutarAcaoDeLogar("1234567890", "");
        String alerta = loginPage.getAlertaTexto();
        assertEquals(alerta, "Para prosseguir complete o campo destacado!");

    }

    @Test
    public void TC003_LogarComEmailEmBrancoESenhaIncorreta() {
        loginPage.ExecutarAcaoDeLogar("", "RpMarco2");
        String alerta = loginPage.getAlertaTexto();
        assertEquals(alerta, "Para prosseguir complete o campo destacado!");

    }

    @Test
    public void TC004_LogarComEmailESenhaIncorretos() {
        loginPage.ExecutarAcaoDeLogar("1234567890", "RpMarco2");
        String alerta = loginPage.getAlertaTexto();
        assertEquals(alerta, "Matrícula inválida!");

    }

    @Test
    public void TC005_LogarComEmailCorretoESenhaInválida() {
        loginPage.ExecutarAcaoDeLogar("2210100404", "RpMarco2");
        String alerta = loginPage.getAlertaTexto();
        assertEquals(alerta, "Invalid credentials");

    }

}
