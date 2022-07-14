package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

public class IngesarCrdenciales implements Task {
	private String user;
	private String pass;

	public IngesarCrdenciales(String user, String pass) {
		this.user = user;
		this.pass = pass;

	}

	@Override
	@Step("{0} attemps to login in CT ")
	public <T extends Actor> void performAs(T actor) {



	}

	public static IngesarCrdenciales login(String user, String pass) {
		return instrumented(IngesarCrdenciales.class, user, pass);
	}

}
