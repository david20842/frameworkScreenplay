package questions;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static ui.HomeUI.TXT_RANDOM_NAME_BTN;

@AllArgsConstructor
@Slf4j
public class ValidateElementsTextBtn implements Question<Boolean> {

    private static final Logger log = LoggerFactory.getLogger(ValidateElementsTextBtn.class);

    public static ValidateElementsTextBtn witchParams(String validTextSubElementBtn) {
        return new ValidateElementsTextBtn();
    }

    private String validTextSubElementBtn;

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String validTextBtnHeader = TXT_RANDOM_NAME_BTN.resolveFor(actor).getText();
        if (validTextBtnHeader != null && validTextSubElementBtn.equals(validTextBtnHeader)) {
            log.info(validTextBtnHeader);
            result = true;
        } else {
            result = false;
        }
        return result;
    }


}