package co.com.sofka.tasks.automationpractice;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.automationpractice.AutomationPractice.*;

public class BrowseCreateAccount implements Task {

    private String email;

    public BrowseCreateAccount withEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(EMAIL_ADDREES),
                Click.on(EMAIL_ADDREES),
                Enter.theValue(email).into(EMAIL_ADDREES),
                Scroll.to(CREATE_ACCOUNT),
                Click.on(CREATE_ACCOUNT)
        );
    }

    public static BrowseCreateAccount browseCreateAccount(){
        return new BrowseCreateAccount();
    }
}
