package co.com.sofka.questions.automationpractice;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.automationpractice.AutomationPractice.MESSAGE_VALIDATION;

public class AutomationPractice implements Question<Boolean> {

    public static final String MESSAGE_CONFIRM = "Your message has been successfully sent to our team.";

    @Override
    public Boolean answeredBy(Actor actor) {
        return (MESSAGE_VALIDATION.resolveFor(actor).containsOnlyText(MESSAGE_CONFIRM));
    }

    public static AutomationPractice automationPractice() {
        return new AutomationPractice();
    }
}
