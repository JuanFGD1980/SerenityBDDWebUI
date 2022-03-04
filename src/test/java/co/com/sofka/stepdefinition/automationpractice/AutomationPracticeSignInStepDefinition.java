package co.com.sofka.stepdefinition.automationpractice;

import co.com.sofka.models.automationpractice.AutomationPracticeSignInModel;
import co.com.sofka.stepdefinition.Setup;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

import java.util.Locale;

import static co.com.sofka.questions.automationpractice.AutomationPracticeSignIn.automationPracticeSignIn;
import static co.com.sofka.questions.automationpractice.AutomationPracticeSignInAllFill.automationPracticeSignInAllFill;
import static co.com.sofka.tasks.OpenLandingPage.openLandingPage;
import static co.com.sofka.tasks.automationpractice.BrowseCreateAccount.browseCreateAccount;
import static co.com.sofka.tasks.automationpractice.BrowseSingIn.browseSingIn;
import static co.com.sofka.tasks.automationpractice.FillSignInAllForm.fillSignInAllForm;
import static co.com.sofka.tasks.automationpractice.FillSignInMandatoryForm.fillSignInMandatoryForm;
import static co.com.sofka.utils.Title.MR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class AutomationPracticeSignInStepDefinition extends Setup {

    public static Logger LOGGER = Logger.getLogger(AutomationPracticeSignInStepDefinition.class);

    private AutomationPracticeSignInModel user1;
    private AutomationPracticeSignInModel user2;

    Faker usFaker = new Faker(new Locale("en-US"));

    private static final String ACTOR_NAME = "Alejandra";

    @Given("el Cliente está en la pagina de landingpage http:\\/\\/automationpractice.com\\/index.php")
    public void elClienteEstaEnLaPaginaDeLandingpageHttpAutomationpracticeComIndexPhp() {
        try {
            actorSetupTheBrowser(ACTOR_NAME);
            theActorInTheSpotlight().wasAbleTo(
                    openLandingPage()
            );
            LOGGER.info("// Inicio primer Scenario //");
        }catch (Exception e){
            LOGGER.error(e);
            LOGGER.info("** Error en el inicio de Scenario 1 ");
        }
    }

    @When("El cliente ingresa la información necesaria para el registro en la pagina web de la compañia")
    public void elClienteIngresaLaInformacionNecesariaParaElRegistroEnLaPaginaWebDeLaCompannia() {
        try {
            genetareUserFillMandatory();
            theActorInTheSpotlight().attemptsTo(
                    browseSingIn(),
                    browseCreateAccount()
                            .withEmail(user1.getEmail()),
                    fillSignInMandatoryForm()
                            .withName(user1.getName())
                            .andLastName(user1.getLastName())
                            .andPassword(user1.getPassword())
                            .andAddress(user1.getAddress())
                            .andCity(user1.getCity())
                            .andZip(user1.getZip())
                            .andMovilePhone(user1.getMovilePhone())
            );

            LOGGER.info("// Inicio Registro de usuario 1 con el minimo de campos requeridos //");
        }catch (Exception e){
            LOGGER.error(e);
            LOGGER.info("** Error en la creacion usuario ");
        }
    }

    @Then("el cliente deberá observar el mensaje de  confirmación del registro exitoso en la aplicación con informacion minima")
    public void elClienteDeberaObservarElMensajeDeConfirmacionDelRegistroExitosoEnLaAplicacionConInformacionMinima() {
        try {
            theActorInTheSpotlight().should(
                    seeThat(
                            automationPracticeSignIn(),
                            equalTo(user1.getName()+" "+user1.getLastName()+" "
                                    +user1.getAddress()+" "+user1.getCity()+" "
                                    +user1.getZip()+" "+user1.getMovilePhone()
                            )
                    )

            );

            LOGGER.info("** Se genera  la validacion  de la ejecucion del primer scenario ");
        }catch (Exception e){
            LOGGER.error(e);
            LOGGER.info("** Error en la Validacion");
        }
    }

    @When("El cliente ingresa la información completa para el registro en la pagina web de la compañia")
    public void elClienteIngresaLaInformacionCompletaParaElRegistroEnLaPaginaWebDeLaCompannia() {
        try {
            genetareClienteFillAll();
            theActorInTheSpotlight().attemptsTo(
                    browseSingIn(),
                    browseCreateAccount()
                            .withEmail(user2.getEmail()),
                    fillSignInAllForm()

                            .andName(user2.getName())
                            .andLastName(user2.getLastName())
                            .andPassword(user2.getPassword())
                            .andCompany(user2.getCompany())
                            .andAddress(user2.getAddress())
                            .andAddressAux(user2.getAddressAux())
                            .andCity(user2.getCity())
                            .andZip(user2.getZip())
                            .andAddInformation(user2.getAddInformation())
                            .andHomePhone(user2.getHomePhone())
                            .andMovilePhone(user2.getMovilePhone())
                            .andAliasAddress(user2.getAliasAddress())
            );
            LOGGER.info(user2.getTitle());
            LOGGER.info("** // Inicio Registro de usuario 2 con el todos de campos  //");
        }catch (Exception e){
            LOGGER.error(e);
            LOGGER.info("** Error en la creacion usuario  ");
        }

    }

    @Then("el cliente deberá observar el mensaje de  confirmación del registro exitoso en la aplicación con informacion completa")
    public void elClienteDeberaObservarElMensajeDeConfirmacionDelRegistroExitosoEnLaAplicacionConInformacionCompleta() {
        try {
            theActorInTheSpotlight().should(
                    seeThat(
                            automationPracticeSignInAllFill(), equalTo(user2.getName()+" "+user2.getLastName())
                    )
            );
            LOGGER.info("** Se genera  la validacion  de la ejecucion del segundo scenario  ");
        }catch (Exception e){
            LOGGER.error(e);
            LOGGER.info("** Error en la Validacion");
        }
    }

    private void genetareUserFillMandatory(){
        String name = usFaker.name().firstName();
        String lasName = usFaker.name().lastName();
        String email = name+lasName+"@gmail.com";
        String password = usFaker.bothify("########");
        String address = usFaker.address().streetAddress();
        String zip = usFaker.numerify("#####");
        String mobilePhone = usFaker.numerify("##########");

        user1 = new AutomationPracticeSignInModel();
        user1.setName(name);
        user1.setLastName(lasName);
        user1.setEmail(email);
        user1.setPassword(password);
        user1.setAddress(address);
        user1.setCity("Orlando");
        user1.setZip(zip);
        user1.setMovilePhone(mobilePhone);

    }

    private void genetareClienteFillAll(){
        String name = usFaker.name().firstName();
        String lasName = usFaker.name().lastName();
        String email = name+lasName+"@gmail.com";
        String password = usFaker.bothify("########");
        String company = usFaker.company().name();
        String address = usFaker.address().streetAddress();
        String addressAdd = usFaker.address().secondaryAddress();
        String zip = usFaker.numerify("#####");
        String addInfo = usFaker.lorem().fixedString(50);
        String homePhone = usFaker.numerify("604#######");
        String mobilePhone = usFaker.numerify("##########");
        String aliasAddress = "The "+name+" "+lasName+" House";

        user2 = new AutomationPracticeSignInModel();

        user2.setName(name);
        user2.setLastName(lasName);
        user2.setEmail(email);
        user2.setPassword(password);
        user2.setCompany(company);
        user2.setAddress(address);
        user2.setAddressAux(addressAdd);
        user2.setCity("Miami");
        user2.setZip(zip);
        user2.setAddInformation(addInfo);
        user2.setHomePhone(homePhone);
        user2.setMovilePhone(mobilePhone);
        user2.setAliasAddress(aliasAddress);

    }


}
