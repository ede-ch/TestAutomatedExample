##Passo a passo para a criação de testes automatizados com Selenium, Maven, jUnit e Java.##

1. Estruturar o PageObject de Login.    
    1.1 Criar a classe LoginPO.java dentro da pasta pages; OK!
    1.2 Fazer herança do arquivo BasePO.java; OK!
    1.3 Fazer o mapeamento de todos os elementos da tela de Login; OK!
        1.3.1 Criar os elementos com o PageFactory; OK!

2. Estruturar o arquivo de teste de Login.
    2.1 Criar um arquivo chamdo LoginTest.java; OK!
    2.2 Fazer a herança do arquivo BaseTest.java; OK!
    2.3 Criar um método inicial que saiba instanciar um PO de Login; OK!
    2.4 Criar os testes baseado na Planilha;
        2.4.1 Campos em branco; OK!
        2.4.2 Matrícula incorreta e senha em branco; OK!   
        2.4.3 Matrícula em branco e senha incorreta; OK!
        2.4.4 Matrícula e senha incorretas; OK!
        2.4.5 Matrícula correta e senha incorreta; OK!

