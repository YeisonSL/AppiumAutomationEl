package interaction.generalinteraction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;


import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.*;

public class WaitApp implements Interaction {

	@Override
	public <T extends Actor> void performAs(T actor) {

		boolean initialized = false;
		while (!initialized) {

			if (BUTON_PERFIL.resolveFor(actor).isVisible())

			{
				initialized = true;
			}
		}
	}

	public static WaitApp initialized() {
		return instrumented(WaitApp.class);
	}
}