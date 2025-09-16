# 📝 Prueba Técnica Java — Gestión de entradas para festival Sonic Fest.

Duración estimada: 50–60 minutos

---

## 👨‍💻 Contexto

Vas a construir un pequeño sistema para gestionar la venta de entradas de un festival que dura 3 días. 

El sistema debe permitir registrar usuarios (con su email, DNI y fecha de nacimiento) para comprar distintos tipos de entradas. 

Algunas entradas habilitan acceso al camping y ventajas adicionales. 

> ⚠️ **NO es necesario que el programa gestione la entrada de datos por consola.**

---

## 👤 Historias de Usuario

### Historia 1 — Registro de usuario
Como usuario interesado, quiero registrarme proporcionando email, DNI y fecha de nacimiento para poder comprar entradas.

- [ ] El registro debe rechazar menores de 18 años.
- [ ] Email, DNI y fecha de nacimiento son obligatorios.

### Historia 2 — Comprar entrada básica
Como usuario interesado, quiero comprar una entrada de 1 día para poder acceder al festival ese día concreto.
- [ ] Solo los usuarios registrados pueden comprar entradas.
- [ ] Formato ID ticket: `DNI - BASIC`.
- [ ] El ticket cuenta las fechas de acceso al festival.
- [ ] Un usuario solo puede adquirir una entrada.

### Historia 3 — Comprar entrada de 2 días
Como usuario interesado, quiero comprar una entrada para 2 días (dos días consecutivos) que incluya 2 consumiciones (vouchers) para usar en el recinto.
- [ ] Formato ID ticket: `DNI - TWO`.
- [ ] La compra de dos días consecutivos asigna al usuario dos consumiciones (vouchers) identificadas con un ID que se compone de: 
`Cantidad - DNI del usuario - VOUCHER` 

### Historia 4 — Comprar entrada full (3 días)
Como usuario interesado, quiero comprar la entrada full (3 días) que me permita entrar los 3 días y acceder al camping. La entrada full incluye 4 consumiciones.
- [ ] Formato ID ticket: `DNI - FULL`.
- [ ] Con la compra de la entrada se asignará automáticamente una parcela del camping con identificador único. `ID-CAMP`
- [ ] Se le asignará también 4 consumiciones. ID voucher: `Cantidad - DNI del usuario - VOUCHER`

### Historia 5 — Entrada con localización privilegiada en camping
Como usuario interesado, quiero poder comprar una entrada full con privilegios (VIP) para obtener una posición privilegiada en el camping (más cercana a duchas, a la entrada o a los escenarios) si deseo mayor comodidad.
- [ ] Formato ID ticket: `DNI - VIP - Localización`. Ejemplo: "Y69462715-VIP-STAGES".
- [ ] Se le regalarán 4 consumiciones. ID voucher: `Cantidad - DNI del usuario - VOUCHER`.
- [ ] La compra de esta entrada requiere la elección al tipo de localización preferida: baños, acceso principal o escenarios.
- [ ] Se le asignará una parcela automáticamente correspondiente a la zona escogida. Identificador único: `ID-LOCALIZACIÓN`

### Historia 7 — Historial de entradas vendidas.
Como administrador, quiero obtener un listado con el total de las entradas vendidas para ver el detalle total de ventas.
- [ ] El listado debe mostrar número de entrada, DNI del cliente, vouchers y parcela de camping según corresponda.

--- 

## 🎯 Objetivos

- Implementar código sencillo a partir del diseño definido en los tests.
- Diseñar una aplicación sencilla basándose en los requerimientos de las historias de usuario.

---

## ⚒️ Qué debes hacer

1- Escribir el código necesario para que pasen los tests ya definidos.

2- Escribir los tests de las historias restantes, pensando en el diseño que mejor se adapta a los requerimientos (clases necesarias, interfaces, excepciones, herencia, tipo de datos, colecciones).

3- Implementar el código necesario para que estos nuevos tests pasen.

---

## ✅ Criterios de evaluación:
- Gestión del tiempo y el estrés.
- Calidad de código. Clean code, convención de nombres y código fácil de interpretar.
- Diseño de la aplicación: Uso de herencia e interfaces.
- Manejo de errores: correcta implementación de excepciones.
