package co.com.sofka.questions.automationpractice;

import co.com.sofka.tasks.automationpractice.FillSignInMandatoryForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.apache.commons.lang3.StringUtils;

import static co.com.sofka.userinterfaces.automationpractice.AutomationPractice.*;


public class AutomationPracticeSignIn implements Question{

    private String name;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String movilePhone;

    public AutomationPracticeSignIn withName(String name) {
        this.name = name;
        return this;
    }

    public AutomationPracticeSignIn andLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public AutomationPracticeSignIn andAddress(String address) {
        this.address = address;
        return this;
    }

    public AutomationPracticeSignIn andCity(String city) {
        this.city = city;
        return this;
    }

    public AutomationPracticeSignIn andState(String state) {
        this.state = state;
        return this;
    }

    public AutomationPracticeSignIn andZip(String zip) {
        this.zip = zip;
        return this;
    }

    public AutomationPracticeSignIn andMovilePhone(String movilePhone) {
        this.movilePhone = movilePhone;
        return this;
    }


    @Override
    public Object answeredBy(Actor actor) {
        return NAME_LASTNAME_VALIDATION.resolveFor(actor).getText() +" "+ ADDRESS_VALIDATION.resolveFor(actor).getText()
                +" "+StringUtils.removeEnd(CITY_VALIDATION.resolveFor(actor).getText(), ",")
                +" "+ZIP_VALIDATION.resolveFor(actor).getText()
                +" "+MOBILE_PHONE_VALIDATION.resolveFor(actor).getText();
    }

    public static AutomationPracticeSignIn automationPracticeSignIn(){
        return new  AutomationPracticeSignIn();
    }


}
