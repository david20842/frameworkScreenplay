package tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static ui.HomeUI.BTN_ELEMENTS;
import static ui.HomeUI.BTN_LIST_ELEMENTS;
import static utils.Constants.REMEMBER_TEXT_BTN_SUB_ELEMENTS;

@AllArgsConstructor
public class ChooseTask implements Task {

    private String numberSelected;

    @Override
    public <T extends Actor> void performAs(T actor) {
        String number = numberSelected;
        actor.attemptsTo(Scroll.to(BTN_ELEMENTS),
                Click.on(BTN_LIST_ELEMENTS.of(number)));

        String textBtn = BTN_LIST_ELEMENTS.of(number).resolveFor(actor).getText();
        actor.remember(REMEMBER_TEXT_BTN_SUB_ELEMENTS,textBtn);
    }

    public static ChooseTask witchParams(String numberSelected){
        return Tasks.instrumented(ChooseTask.class, numberSelected);
    }
}
