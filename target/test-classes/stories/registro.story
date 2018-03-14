Narrative:
yo como usuario de training site
quiero registrarme en la aplicacion
para poder ingresar a la compra de libros

Scenario: registro
Given estoy en la aplicacion de training site
When me registro con usuario<usuario>, password<password>, repeatpassword<repeatpassword>, gender<gender>, address<address>, billing_address<billing_address>, state<state>
Then puedo iniciar sesion desde la pagina de login

Examples:
|usuario|password|repeatpassword|gender|address|billing_address|state|
|Hernan|clave|clave|male|calle falsa 123|calle falsa 1234|Kerala|