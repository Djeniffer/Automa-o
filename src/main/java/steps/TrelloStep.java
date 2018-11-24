package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pom.LoginPage;

public class TrelloStep {
    LoginPage loginPage;

    @Dado("^que esteja logado no trello$")
    public void queEstejaLogadoNoTrello() throws Throwable{
        loginPage = new LoginPage();
        loginPage.access();
        try {
            Thread.sleep (10000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        loginPage.doLogin("djeniffercordeiro1", "senh@trello");
        Assert.assertEquals("Página Inicial do Trello",
                loginPage.chekInitialPage());

    }

    @E("^acesse o board$")
    public void acesseOBoard() {
        System.out.println("acesseOBoard");
    }

    @Quando("^crio um card com o nome \"([^\"]*)\"$")
    public void crioUmCardComONome(String arg0) throws Throwable {
        System.out.println("crioUmCardComONome");
       }

    @E("^comento \"([^\"]*)\"$")
    public void comento(String arg0) throws Throwable {
        System.out.println("comento");
       }

    @Entao("^card deve estar na lista$")
    public void cardDeveEstarNaLista() {
        System.out.println("cardDeveEstarNaLista");
    }

    @Quando("^excluo o card$")
    public void excluoOCard() {
        System.out.println("excluoOCard");

    }

    @Entao("^o card nao existe mais$")
    public void oCardNaoExisteMais() {
        System.out.println("oCardNaoExisteMais");
    }
}