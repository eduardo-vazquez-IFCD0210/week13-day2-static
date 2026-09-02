Ejercicio: la perrera
Tienes una clase Perro.
Cada perro tiene:
- Un nombre.
- Una fechaNacimiento de tipo LocalDate.
- Un método ladrar() que devuelve "Guau guau!" //static
- Un método calcularEdad() que calcula su edad a partir de su fecha de nacimiento (LocalDate)

- Además, todos los perros de la residencia tienen una cantidad mínima de paseos diarios: 2.
Esta cantidad debe ser static, porque es una regla común a todos los perros.

Crear un toString() que muestre algo como:
El perro se llama Toby, (* id extra), tiene 4 años, dice 'Guau guau!' y necesita como mínimo 2 paseos al día.

En main, instancia varios perros diferentes y muestra su información.

(*) EXTRA: - Un id del tipo UUID random (investigar qué es esto)

2- Llega Black Friday en tu tienda online de teléfonos móviles y decides ofrecer un 20% de descuento en todos tus productos.

Instancia algunos móviles para probar.

El descuento se aplica en todos (static), así que debes poder mostrar el precio antiguo y el precio con descuento. Puedes crear un método en Movil que calcule el precio con descuento.

+EXTRA: posibilidad de anular el descuento a todos los productos después del Black Friday, mediante método a tal propósito.
