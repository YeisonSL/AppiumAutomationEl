package interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class ClickEntry implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        //actor.attemptsTo(Click.on(ENTRY_BUTTON));


    }

    public static ClickEntry button() {
        return instrumented(ClickEntry.class);
    }
}
