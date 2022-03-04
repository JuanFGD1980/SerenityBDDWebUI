package co.com.sofka.tasks.automationpractice;


import co.com.sofka.utils.Title;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.conditions.Check;
import org.apache.log4j.Logger;

import java.util.List;

import static co.com.sofka.userinterfaces.automationpractice.AutomationPractice.*;
import static co.com.sofka.utils.Title.MR;
import static co.com.sofka.utils.Title.MRS;

public class FillSignInAllForm implements Task {
    public static Logger LOGGER = Logger.getLogger(FillSignInAllForm.class);

    private List<Title> title;
    private String name;
    private String lastName;
    private String email;
    private String password;
    private String dayBirth;
    private String monthBirth;
    private String yearBirth;
    private String newsletter;
    private String offers;
    private String company;
    private String address;
    private String addressAux;
    private String city;
    private String state;
    private String zip;
    private String addInformation;
    private String homePhone;
    private String movilePhone;
    private String aliasAddress;

    public FillSignInAllForm withTitle(List<Title> title) {
        this.title = title;
        return this;
    }

    public FillSignInAllForm andName(String name) {
        this.name = name;
        return this;
    }

    public FillSignInAllForm andLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public FillSignInAllForm andEmail(String email) {
        this.email = email;
        return this;
    }

    public FillSignInAllForm andPassword(String password) {
        this.password = password;
        return this;
    }

    public FillSignInAllForm andDayBirth(String dayBirth) {
        this.dayBirth = dayBirth;
        return this;
    }

    public FillSignInAllForm setMonthBirth(String monthBirth) {
        this.monthBirth = monthBirth;
        return this;
    }

    public FillSignInAllForm andYearBirth(String yearBirth) {
        this.yearBirth = yearBirth;
        return this;
    }

    public FillSignInAllForm andNewsletter(String newsletter) {
        this.newsletter = newsletter;
        return this;
    }

    public FillSignInAllForm andOffers(String offers) {
        this.offers = offers;
        return this;
    }

    public FillSignInAllForm andCompany(String company) {
        this.company = company;
        return this;
    }

    public FillSignInAllForm andAddress(String address) {
        this.address = address;
        return this;
    }

    public FillSignInAllForm andAddressAux(String addressAux) {
        this.addressAux = addressAux;
        return this;
    }

    public FillSignInAllForm andCity(String city) {
        this.city = city;
        return this;
    }

    public FillSignInAllForm andState(String state) {
        this.state = state;
        return this;
    }

    public FillSignInAllForm andZip(String zip) {
        this.zip = zip;
        return this;
    }

    public FillSignInAllForm andAddInformation(String addInformation) {
        this.addInformation = addInformation;
        return this;
    }

    public FillSignInAllForm andHomePhone(String homePhone) {
        this.homePhone = homePhone;
        return this;
    }

    public FillSignInAllForm andMovilePhone(String movilePhone) {
        this.movilePhone = movilePhone;
        return this;
    }

    public FillSignInAllForm andAliasAddress(String aliasAddress) {
        this.aliasAddress = aliasAddress;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Scroll.to(STAR_CREATE_ACCOUNT),
                Click.on(MAN),
                Click.on(FIRST_NAME),
                Enter.theValue(name).into(FIRST_NAME),
                Click.on(LAST_NAME),
                Enter.theValue(lastName).into(LAST_NAME),
                Click.on(PASSWORD),
                Enter.theValue(password).into(PASSWORD),
                Click.on(DAY),
                Click.on(DAY_BIRTH),
                Click.on(MONTH),
                Click.on(MONTH_BIRTH),
                Click.on(YEAR),
                Click.on(YEAR_BIRTH),
                Click.on(NEWSLETTER),
                Click.on(OFFERS),
                Click.on(COMPANY),
                Enter.theValue(company).into(COMPANY),
                //Scroll.to(ADDRESS),
                Click.on(ADDRESS),
                Enter.theValue(address).into(ADDRESS),
                Click.on(ADDRESS_ADD),
                Enter.theValue(addressAux).into(ADDRESS_ADD),
                Click.on(CITY),
                Enter.theValue(city).into(CITY),
                Click.on(STATE),
                Click.on(STATE_SELECT),
                Click.on(ZIP_CODE),
                Enter.theValue(zip).into(ZIP_CODE),
                Click.on(ADD_INFO),
                Enter.theValue(addInformation).into(ADD_INFO),
                Click.on(HOME_PHONE),
                Enter.theValue(homePhone).into(HOME_PHONE),
                Click.on(MOBILE_PHONE),
                Enter.theValue(movilePhone).into(MOBILE_PHONE),
                Click.on(ALIAS_ADDRESS),
                Enter.theValue(aliasAddress).into(ALIAS_ADDRESS),
                Scroll.to(BUTTON_REGISTER),
                Click.on(BUTTON_REGISTER),
                Scroll.to(USER_VALIDATION2)

        );

    }

    public static FillSignInAllForm fillSignInAllForm(){
        return new  FillSignInAllForm();
    }

}
