import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "src/test/java/resource/msedgedriver107.0.1418.42.exe");
        WebDriver driver = new EdgeDriver();
        final String URL_BASE = "https://pergamum.unipampa.edu.br/biblioteca_s/php/login_usu.php?flag=index.php";

        driver.get(URL_BASE);

        String csv = "teste.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(csv))) {

            String linha = br.readLine();
            linha = br.readLine();

            while (linha != null) {

                for (int i = 0; i < 1; i++) {

                String tituloAtual = driver.getTitle();

                String[] palavra = linha.split(",");
                String tituloEsperado = palavra[0];
                String tituloErrado = palavra[1];

                System.out.println(tituloAtual + tituloErrado + tituloEsperado);

                linha = null;
                }
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        driver.close();
    }
}
