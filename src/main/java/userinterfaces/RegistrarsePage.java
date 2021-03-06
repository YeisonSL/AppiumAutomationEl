package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegistrarsePage {

    public static final Target BUTON_REGISTRARME = Target.the("Entry button").locatedBy("//*[@text='Registrarme']");
    public static final Target CAMPO_NOMBRE = Target.the("Campor para ingresar nombres").locatedBy("//*[@text='Nombre(s)']");
    public static final Target CAMPO_APELLIDO = Target.the("Campor para ingresar apellidos").locatedBy("//*[@text='Apellido(s)']");
    public static final Target CAMPO_CELULAR = Target.the("Campor para ingresar celular").locatedBy("//*[@class='android.widget.EditText' and @text='Número de celular']");
    public static final Target CAMPO_CORREO = Target.the("Campor para ingresar email").locatedBy("//*[@class='android.widget.EditText' and @text='Correo Electrónico']");
    public static final Target CAMPO_CODIGO_REFERIDO = Target.the("Campor para ingresar referido").locatedBy("//*[@text='Si alguien te refirió, ingresa su código']");
    public static final Target CHECK_TERMINOS_CONDICIONES =Target.the("Check para aceptar los terminos y condiciones").locatedBy("(//*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and ./parent::*[@class='android.widget.ScrollView']]]/*/*/*[@class='android.view.ViewGroup' and ./parent::*[@class='android.view.ViewGroup' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.ViewGroup']]])[2]");
    public static final Target BOTON_SIGUIENTE = Target.the("Boton para dar siguiente").locatedBy("//*[@text='Siguiente']");
    public static final Target CAMPO_CONTRSENA = Target.the("Campo para crear contraseña ").locatedBy("//*[@text='Crea tu contraseña' and @class='android.widget.EditText']");
    public static final Target CAMPO_CONFRIMAR_CONTRASENA = Target.the("Campo para confrirmar contraseña").locatedBy("//*[@text='Confirma tu contraseña' and @class='android.widget.EditText']");
    public static final Target BOTON_CONTINUAR = Target.the("Boton para continuar luego de crear contraseña").locatedBy("//*[@text='Continuar']");
}
