package co.com.sofka.questions.automationpractice;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.automationpractice.AutomationPractice.USER_VALIDATION2;

public class AutomationPracticeSignInAllFill implements Question {


    @Override
    public Object answeredBy(Actor actor) {
        return USER_VALIDATION2.resolveFor(actor).getText();

    }

    public static AutomationPracticeSignInAllFill automationPracticeSignInAllFill(){
        return new AutomationPracticeSignInAllFill();
    }
}
