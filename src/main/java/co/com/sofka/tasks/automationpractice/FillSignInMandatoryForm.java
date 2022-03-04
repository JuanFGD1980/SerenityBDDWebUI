package co.com.sofka.tasks.automationpractice;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.automationpractice.AutomationPractice.*;

public class FillSignInMandatoryForm implements Task {

    private String name;
    private String lastName;
    private String email;
    private String password;
    private String dayBirth;
    private String address;
    private String addressAux;
    private String city;
    private String state;
    private String zip;
    private String movilePhone;

    public FillSignInMandatoryForm withName(String name) {
        this.name = name;
        return this;
    }

    public FillSignInMandatoryForm andLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public FillSignInMandatoryForm andEmail(String email) {
        this.email = email;
        return this;
    }

    public FillSignInMandatoryForm andPassword(String password) {
        this.password = password;
        return this;
    }

    public FillSignInMandatoryForm andDayBirth(String dayBirth) {
        this.dayBirth = dayBirth;
        return this;
    }

    public FillSignInMandatoryForm andAddress(String address) {
        this.address = address;
        return this;
    }

    public FillSignInMandatoryForm andAddressAux(String addressAux) {
        this.addressAux = addressAux;
        return this;
    }

    public FillSignInMandatoryForm andCity(String city) {
        this.city = city;
        return this;
    }

    public FillSignInMandatoryForm andState(String state) {
        this.state = state;
        return this;
    }

    public FillSignInMandatoryForm andZip(String zip) {
        this.zip = zip;
        return this;
    }

    public FillSignInMandatoryForm andMovilePhone(String movilePhone) {
        this.movilePhone = movilePhone;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Scroll.to(FIRST_NAME),
                Click.on(FIRST_NAME),
                Enter.theValue(name).into(FIRST_NAME),
                Click.on(LAST_NAME),
                Enter.theValue(lastName).into(LAST_NAME),
                Click.on(PASSWORD),
                Enter.theValue(password).into(PASSWORD),
                Scroll.to(ADDRESS),
                Click.on(ADDRESS),
                Enter.theValue(address).into(ADDRESS),
                Click.on(CITY),
                Enter.theValue(city).into(CITY),
                Click.on(STATE),
                Click.on(STATE_SELECT),
                Click.on(ZIP_CODE),
                Enter.theValue(zip).into(ZIP_CODE),
                Click.on(MOBILE_PHONE),
                Enter.theValue(movilePhone).into(MOBILE_PHONE),
                Scroll.to(BUTTON_REGISTER),
                Click.on(BUTTON_REGISTER),
                Scroll.to(MY_ADDRESS),
                Click.on(MY_ADDRESS),
                Scroll.to(CONTAINER_INFO)

        );
    }

    public static FillSignInMandatoryForm fillSignInMandatoryForm() {
        return new FillSignInMandatoryForm();
    }
}
