package co.com.sofka.tasks.automationpractice;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.automationpractice.AutomationPractice.SIGN;

public class BrowseSingIn implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(SIGN),
                Click.on(SIGN)
        );
    }

    public static BrowseSingIn browseSingIn(){
        return new BrowseSingIn();
    }
}
