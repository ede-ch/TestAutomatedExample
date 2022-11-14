package testerp;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import pages.BingPO;

public class Edgetest extends BaseTest {

    private static BingPO bingPage;

    @BeforeClass
    public static void prepararTestes() {
        bingPage = new BingPO(driver);
    }

    @Test
    public void PesquisaBind() {

        bingPage.pesquisar("Teste de Software");

        String resultado = bingPage.obterResultado();

        assertTrue(resultado, resultado.contains("Sobre"));
    }

}
