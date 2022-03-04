package co.com.sofka.stepdefinition.automationpractice;

import co.com.sofka.exceptions.ValidationTextDoNotMatch;
import co.com.sofka.models.automationpractice.AutomationPracticeContactUsModel;
import co.com.sofka.stepdefinition.Setup;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import java.util.Locale;

import static co.com.sofka.exceptions.ValidationTextDoNotMatch.VALIDATION_DO_NOT_MATCH;

import static co.com.sofka.questions.automationpractice.AutomationPractice.MESSAGE_CONFIRM;
import static co.com.sofka.questions.automationpractice.AutomationPractice.automationPractice;
import static co.com.sofka.tasks.OpenLandingPage.openLandingPage;
import static co.com.sofka.tasks.automationpractice.BrowseToContacUs.browseToContacUs;
import static co.com.sofka.tasks.automationpractice.FillContacUsCustomerForm.fillContacUsCustomerForm;
import static co.com.sofka.tasks.automationpractice.FillContacUsWebmasterForm.fillContacUsWebmasterForm;
import static co.com.sofka.userinterfaces.automationpractice.AutomationPractice.MESSAGE_VALIDATION;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class AutomationPracticeContactUsStepDefinition extends Setup {

    public static Logger LOGGER = Logger.getLogger(AutomationPracticeContactUsStepDefinition.class);

    private AutomationPracticeContactUsModel cliente1;
    private AutomationPracticeContactUsModel cliente2;

    Faker usFaker = new Faker(new Locale("en-US"));

    private static final String ACTOR_NAME = "Felipe";

    @Given("el Cliente está en la pagina de aterrizaje http:\\/\\/automationpractice.com\\/index.php")
    public void elClienteEstaEnLaPaginaDeAterrizajeHttpAutomationpracticeComIndexPhp() {
        try {
            actorSetupTheBrowser(ACTOR_NAME);
            theActorInTheSpotlight().wasAbleTo(
                    openLandingPage()
            );
            LOGGER.info("** Inicio scenario");
        }catch (Exception e){
            LOGGER.error(e);
            LOGGER.info("** Error en el inicio del Scenario");
        }
    }

    @When("el cliente realizara el proceso para el contacto con la compañía con Webmaster")
    public void elClienteRealizaraElProcesoParaElContactoConLaCompannia() {
        try {
            generateCliente1();
            theActorInTheSpotlight().attemptsTo(
                    browseToContacUs(),
                    fillContacUsWebmasterForm()
                            .withEmail(cliente1.getEmail())
                            .andOrder_reference(cliente1.getOrder_reference())
                            .andMessage(cliente1.getMessage())
            );
            LOGGER.info("** Inicio Generacion proceso scenario 1");
        }catch (Exception e){
            LOGGER.error(e);
            LOGGER.info("Error en el inicio del la generacion del proceso");
        }
    }

    @Then("el cliente  deberá observar el mensaje de  confirmación del envío del mensaje al Webmaster")
    public void elClienteDeberaObservarElMensajeDeConfirmacionDelEnvioDelMensaje() {
        try {
            theActorInTheSpotlight().should(
                    seeThat(
                            automationPractice(),equalTo(true)
                    )
                            .orComplainWith(
                                    ValidationTextDoNotMatch.class,
                                    String.format(VALIDATION_DO_NOT_MATCH, compareInWithSystemOutcome())
                            )
            );
            LOGGER.info("** Inicio de la aserción");
        }catch (Exception e){
            LOGGER.error(e);
            LOGGER.info("Error en el la aserción");
        }
    }

    @When("el cliente realizara el proceso para el contacto con la compañía con Customer service")
    public void elClienteRealizaraElProcesoParaElContactoConLaCompañíaConCustomerService() {
        try {
            generateCliente2();
            theActorInTheSpotlight().attemptsTo(
                    browseToContacUs(),
                    fillContacUsCustomerForm()
                            .withEmail(cliente2.getEmail())
                            .andOrder_reference(cliente2.getOrder_reference())
                            .andMessage(cliente2.getMessage())
            );
            LOGGER.info("** Inicio Generacion proceso scenario 2");
        }catch (Exception e){
            LOGGER.error(e);
            LOGGER.info("Error en el inicio del la generacion del proceso scenario 2");
        }
    }

    @Then("el cliente  deberá observar el mensaje de  confirmación del envío del mensaje al Customer service")
    public void elClienteDeberáObservarElMensajeDeConfirmaciónDelEnvíoDelMensajeAlCustomerService() {
        try {
            theActorInTheSpotlight().should(
                    seeThat(
                            automationPractice(),equalTo(true)
                    )
                            .orComplainWith(
                                    ValidationTextDoNotMatch.class,
                                    String.format(VALIDATION_DO_NOT_MATCH, compareInWithSystemOutcome())
                            )
            );
            LOGGER.info("** Inicio de la aserción");
        }catch (Exception e){
            LOGGER.error(e);
            LOGGER.info("Error en el la aserción");
        }
    }



    private void generateCliente1(){
        String fullName = StringUtils.deleteWhitespace(usFaker.name().fullName()) ;
        String email = fullName+"@gmail.com";
        String orderReference = usFaker.bothify("######-?");
        String message = usFaker.lorem().fixedString(500);

        cliente1 = new AutomationPracticeContactUsModel();
        cliente1.setEmail(email);
        cliente1.setOrder_reference(orderReference);
        cliente1.setMessage(message);
    }

    private void generateCliente2(){
        String fullName = StringUtils.deleteWhitespace(usFaker.name().fullName());
        String email = fullName+"@hotmail.com";
        String orderReference = usFaker.bothify("######-?");
        String message = usFaker.lorem().fixedString(500);

        cliente2 = new AutomationPracticeContactUsModel();
        cliente2.setEmail(email);
        cliente2.setOrder_reference(orderReference);
        cliente2.setMessage(message);
    }

    private String compareInWithSystemOutcome(){
        return "\n" + "Datos para la prueba: resultado del sistema"
                + "\n" + MESSAGE_CONFIRM + " : " + MESSAGE_VALIDATION.resolveFor(theActorInTheSpotlight()).getText()
                ;
    }

}
