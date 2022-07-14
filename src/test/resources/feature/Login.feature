# language: es
Característica: Resgitrarse en la app de Elenas
  Yo como un usuario nuevo de Elenas
  Deseo poder registrarme en la app
  Para poder empezar mi negocio

  @RegistrarUsuario
  Escenario: Registrarse en la app de Elenas
    Dado el usuario nuevo ingresa a la app
    Cuando el realice el proceso de registro con los datos
      | nombres | apellidos | celular | correo         | codigoReferencia |contrasena|
      | user    | last      | 773773  | user@gmail.com | 366              | 451234   |
    Entonces el deberia mensaje de inicio
