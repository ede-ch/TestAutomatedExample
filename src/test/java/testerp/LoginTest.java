package testerp;

import static org.junit.Assert.assertEquals;

import java.io.FileReader;
import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.opencsv.CSVReader;

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
     * 
     * @throws IOException
     */
    @Test
    public void TC001_CamposEmBranco() throws IOException {
        CSVReader reader = new CSVReader(new FileReader(csv));
        String[] tableline = null;

        while ((tableline = reader.readNext()) != null) {
            for (int i = 0; i < 1; i++) {
                String alertaEsperado = tableline[0];

                loginPage.ExecutarAcaoDeLogar("", "");
                String alerta = loginPage.getAlertaTexto();
                assertEquals(alertaEsperado, alerta);
            }
        }
    }

    @Test
    public void TC002_LogarComEmailIncorretoESenhaEmBranco() throws IOException {
        CSVReader reader = new CSVReader(new FileReader(csv));
        String[] tableline = null;

        while ((tableline = reader.readNext()) != null) {
            for (int i = 0; i < 1; i++) {
                String alertaEsperado = tableline[1];

                loginPage.ExecutarAcaoDeLogar("1234567890", "");
                String alerta = loginPage.getAlertaTexto();
                assertEquals(alertaEsperado, alerta);
            }
        }
    }

    @Test
    public void TC003_LogarComEmailEmBrancoESenhaIncorreta() throws IOException {
        CSVReader reader = new CSVReader(new FileReader(csv));
        String[] tableline = null;

        while ((tableline = reader.readNext()) != null) {
            for (int i = 0; i < 1; i++) {
                String alertaEsperado = tableline[1];

                loginPage.ExecutarAcaoDeLogar("", "RpMarco2");
                String alerta = loginPage.getAlertaTexto();
                assertEquals(alertaEsperado, alerta);
            }
        }

    }

    @Test
    public void TC004_LogarComEmailESenhaIncorretos() throws IOException {
        CSVReader reader = new CSVReader(new FileReader(csv));
        String[] tableline = null;

        while ((tableline = reader.readNext()) != null) {
            for (int i = 0; i < 1; i++) {
                String alertaEsperado = tableline[2];

                loginPage.ExecutarAcaoDeLogar("1234567890", "RpMarco2");
                String alerta = loginPage.getAlertaTexto();
                assertEquals(alertaEsperado, alerta);
            }
        }

    }

    @Test
    public void TC005_LogarComEmailCorretoESenhaInválida() throws IOException {
        CSVReader reader = new CSVReader(new FileReader(csv));
        String[] tableline = null;

        while ((tableline = reader.readNext()) != null) {
            for (int i = 0; i < 1; i++) {
                String alertaEsperado = tableline[3];

                loginPage.ExecutarAcaoDeLogar("2210100404", "RpMarco2");
                String alerta = loginPage.getAlertaTexto();
                assertEquals(alertaEsperado, alerta);
            }
        }

    }

}
