# conversor
Conversor de monedas de Alura Latam

Este proyecto tiene como finalidad poner en práctica los conocimientos adquiridos durante la segunda fase de la formación, en este caso, la especilización en Java Backend.

Consiste en realizr un conversor de monedas, entre las cuales sobresalen el dólar estadounidense, el peso colombiano, el peso argentino y el real brasileño.

El usuario debe elegir entre una serie de opciones que aparecen en pantalla a través de un menú, y debe ingresar la cantidad a convertir. 

El menú es el siguiente:

![image](https://github.com/user-attachments/assets/ef659e5e-1b44-4494-b44d-3fbac26f1863)

Luego de elegir la opción, el sistema le solicita que ingrese la cantidad de dinero a convertir. Posteriormente, ejecuta el cálculo y muestra el resultado en la pantalla.

Adicionalmente, vuelve a mostrar el menú, por si el usuario desea realizar otro cálculo.

![image](https://github.com/user-attachments/assets/8451350c-99a0-48ed-ac3d-e961e73b1921)

Ahora vamos a analizar cuál es la estructura del proyecto.

En primer lugar, tenemos un archivo denominado Principal.java que es el que contiene el menú, junto con un switch case que se encarga de enviar los códigos de las monedas a la URL para su posterior cálculo.

![image](https://github.com/user-attachments/assets/0e942b86-7d19-4cc7-bcc0-46dc81853d79)

![image](https://github.com/user-attachments/assets/73e0c908-4c02-4aeb-b2f3-4837c47bcd17)

Posteriormente, encontramos el archivo ConsultarMoneda.java, el cual se encarga de hacer la conexion con la API de exchange rate.

![image](https://github.com/user-attachments/assets/c8e8be1e-b5b4-476a-92e9-c3b0943ec8e4)

Finalmente, nos encontramos con el archivo ConvertirMoneda.java, el cual se encarga de realizar los cálculos respectivos para realizar las conversiones.

![image](https://github.com/user-attachments/assets/72ce00e3-1dc9-406a-a49c-3bac3deab616)

Quisiera destacar la importancia de realizar este tipo de actividades, las cuales suponen un reto más que interesante ya que nos permite poner en práctica los conocimientos que hemos adqiuirido hasta el momento, y nos permiten ir consolidando un poco más lo aprendido. Muchas gracias por esta maravillosa oportunidad! 







