# ☎️ Patrón de Devolución de Llamadas - *Callback*

## 🎯 Intención del patrón de diseño de devolución de llamada
El patrón de diseño de devolución de llamada (*callback*) consiste en un fragmento de código ejecutable que se pasa como argumento a otro código, con la expectativa de que este último lo ejecute (*llame de vuelta*) en un momento determinado.

### 📀 En palabras sencillas
> Un *callback* es un método que se pasa a un ejecutor y que será llamado en un momento definido.

## 🛵 Ejemplo: Delivery de comida
Imaginemos una aplicación de reparto de comida que sigue el siguiente proceso de pedido:

1. Cuando un cliente realiza un pedido, la cocina se encarga de prepararlo. Si todo sale bien, se notifica que el pedido está listo para ser enviado.
2. Una vez el pedido está listo, un *rider* lo recoge y se encarga de entregarlo. Si todo sale bien, se notifica que el pedido ha sido entregado.

### 🎭 **En esta analogía:**
> Cada etapa del proceso realiza una devolución de llamada (*callback*) para notificar que su tarea ha concluido.

### 🔬 Echemos un vistazo a cómo implementarlo en Java:
(ORDER Repository)[https://github.com/RotColton/SOLID-and-patterns-desing/tree/main/callback-pattern/src/main/java/order]

---

## 🐶 Ejemplo: Peluquería canina

Imaginemos que llevamos a nuestro amigo peludo a la peluquería para cortarle el pelo que le ha crecido durante el invierno.
Al llegar, la recepcionista o el propio peluquero nos pedirá algunos datos básicos (como nuestro nombre y número de teléfono).
Una vez completado el registro, dejamos a nuestro compañero y nos vamos a dar una vuelta mientras lo atienden.

Cuando el corte esté terminado, el peluquero nos llamará por teléfono para avisarnos que ya podemos pasar a recogerlo.
### Podemos resumir este proceso de la siguiente manera:
1. Llevamos a nuestro amigo a la peluquería.
2. Nos toman el número de teléfono para poder contactarnos.
3. Una vez que el corte está listo, el peluquero nos llama para que vayamos a recogerlo.

### 🎭 En esta analogía:
> **El ejecutor es el peluquero**, quien realiza el trabajo (cortar el pelo del perro).
Una vez que finaliza su tarea, **envía una notificación (la llamada telefónica)** para avisarnos que el proceso ha concluido.

🔬 Veamos cómo implementarlo en Java:
(PET SALON Repository)[https://github.com/RotColton/SOLID-and-patterns-desing/tree/main/callback-pattern/src/main/java/pet_salon]