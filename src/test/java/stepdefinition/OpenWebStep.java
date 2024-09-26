package stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.ChooseTask;
import tasks.FunctionsElementsTask;

import static utils.Constants.ACTOR;

public class OpenWebStep {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @And("validar el area de elementos")
    public void validarElAreaDeElementos() {
        OnStage.theActorCalled(ACTOR).attemptsTo(FunctionsElementsTask.choose());
    }

    @When("seleccione una subfuncion")
    public void seleccioneUnaSubfuncion() {
        OnStage.theActorCalled(ACTOR).attemptsTo(ChooseTask.witchParams("2"));
    }

    @Then("visualizara en la cabecera el nombre de la opcion elegida")
    public void visualizaraEnLaCabeceraElNombreDeLaOpcionElegida() {
    }
}
