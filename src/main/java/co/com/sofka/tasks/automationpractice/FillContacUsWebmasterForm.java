package co.com.sofka.tasks.automationpractice;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.automationpractice.AutomationPractice.*;

public class FillContacUsWebmasterForm implements Task {

    private String email;
    private String order_reference;
    private String message;

    public FillContacUsWebmasterForm withEmail(String email) {
        this.email = email;
        return this;
    }

    public FillContacUsWebmasterForm andOrder_reference(String order_reference) {
        this.order_reference = order_reference;
        return this;
    }

    public FillContacUsWebmasterForm andMessage(String message) {
        this.message = message;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(SUBJECT_HEADING_OPTION_WEBMASTER),
                Click.on(SUBJECT_HEADING_OPTION_WEBMASTER),

                Enter.theValue(email).into(EMAIL),

                Enter.theValue(order_reference).into(ORDER_REFERENCE),

                Enter.theValue(message).into(MESSAGE),

                Click.on(BUTTON_SUTMITMESSAGE)
        );
    }

    public static FillContacUsWebmasterForm fillContacUsWebmasterForm(){
        return new FillContacUsWebmasterForm();
    }
}
