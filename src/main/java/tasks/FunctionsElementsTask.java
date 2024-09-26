package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static ui.HomeUI.ID_CARD_ELEMENTS;
import static ui.HomeUI.ID_MI_ELEMENTO;
import static utils.Constants.TIME_SHORT;

public class FunctionsElementsTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(ID_CARD_ELEMENTS));
        actor.attemptsTo(WaitUntil.the(ID_CARD_ELEMENTS, isEnabled()).
                forNoMoreThan(TIME_SHORT).seconds(),
                Click.on(ID_CARD_ELEMENTS));
    }
    public static FunctionsElementsTask choose(){
        return Tasks.instrumented(FunctionsElementsTask.class);
    }
}
