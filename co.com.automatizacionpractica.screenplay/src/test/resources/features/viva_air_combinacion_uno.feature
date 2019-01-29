#language:es
#Author: your.email@your.domain.com

@tag
Característica: Compra tiquetes Aereos
	Como persona
  Quiero comprar tiquetes para ir de vacaciones
	A través de la página web de Vivaair.com/co
	
	@tag1
	Escenario: Reservas de vuelo vivaAir
	Dado que Jesus quiere ingresar a la pagina de vivaAir
	Cuando el registra datos para reserva
	|ciudadOrigen  |ciudadDestino                     |numeroPasajerosAdultos|numeroPasajerosMenores|numeroPasajerosInfantes|fechaIda  |moneda|tiposDePrecio  |mes  |dia|
	|Montería (MTR)|Medellín, José María Córdova (MDE)|1                     |2                     |1                      |02/02/2019|USD   |Precios del mes|Enero|31 |
	Y selecciona la tarifa mas baja
	Y ingresa datos adulto
	|nombres|apellidos    |genero   |numeroDocumento|correo          |celular   |
	|Andres |Jurado Tirado|Masculino|78120154       |correo@gmail.com|3207891452|
	Y ingresa datos acompañantes
	|nombresNIño1|apellidosNIño1|fechaNacimientoNIño1|generoNIño1 |numeroDocumentoNIño1|nombresNIño2|apellidosNIño2|fechaNacimientoNIño2|generoNIño2|numeroDocumentoNIño2|nombresInfante|apellidosInfante|fechaNacimientoInfante|servicioAdicional|
	|andres			 |mercado			   |09/08/2013         |Masculino		|123456712           |pablo       |perez         |09/09/2013          |Masculino  |7894561             |Carmen        |Gomez           |09/12/2018            | No gracias.     |
	Entonces el valida el valor de servicios adicionales "USD 0.00"
  




