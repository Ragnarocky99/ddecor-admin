#  DdecorAdmin - Sistema de Gestión de Inventario y Producción

¡Bienvenido a **DdecorAdmin**! Este proyecto es un sistema integral de gestión diseñado a medida para optimizar el inventario, las ventas, las compras y la cadena de producción de artículos a partir de materias primas.

---

##  Características Principales

*  **Gestión de Inventario:** Control detallado de stock de productos terminados e insumos.
*  **Ventas y Compras:** Registro de transacciones comerciales y proveedores.
*  **Módulo de Producción:** Transformación y control de uso de materias primas para la elaboración de artículos.
*  **Base de Datos Relacional:** Almacenamiento seguro e integridad de datos.
*  **Próximamente (Futuro):** App móvil / Plataforma web para consultas remotas de stock y reportes en tiempo real.

---

##  Tecnologías Utilizadas

* **Lenguaje:** Java 
* **Interfaz Gráfica:** Java Swing (MVC - Modelo Vista Controlador)
* **Base de Datos:** PostgreSQL
* **Entorno de Desarrollo:** NetBeans
* **Control de Versiones:** Git & GitHub

---

##  Estructura del Proyecto

El proyecto está organizado bajo el patrón de arquitectura **MVC (Modelo-Vista-Controlador)** para garantizar la escalabilidad y limpieza del código:

```text
com.ragnar.ddecoradmin
 ├── controllers/     # Lógica de control e interacción con la vista
 ├── db/              # Conexiones y gestión de la base de datos PostgreSQL
 └── ui/              # Interfaces gráficas desarrolladas en Java Swing
