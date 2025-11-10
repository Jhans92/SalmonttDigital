# 🐟 Proyecto SalmonttDigital

**Autor:** Jhans Pulido  
**Carrera:**  ANALISTA PROGRAMADOR COMPUTACIONAL
**Asignatura:** Desarrollo Orientado a Objetos I  
**Institución:** Fundación Instituto Profesional DUOC UC  
**Año:** 2025  

---

## 📘 Descripción General

El proyecto **SalmonttDigital** fue desarrollado en el lenguaje **Java**, dentro del entorno de desarrollo **IntelliJ IDEA**, con el propósito de aplicar de manera práctica los principios fundamentales de la **Programación Orientada a Objetos (POO)**.  
La temática se centra en una simulación empresarial del rubro salmonero en el sur de Chile, donde se modelan clases que representan **personas**, **empleados** y sus respectivas **relaciones jerárquicas y de composición**, incorporando validaciones reales como el formato del **RUT chileno** y direcciones estructuradas.

El sistema demuestra el uso correcto de **herencia**, **encapsulamiento**, **modularidad**, **manejo de excepciones personalizadas** y **validación de datos**, además de la capacidad de organizar un proyecto Java siguiendo estándares profesionales de arquitectura en capas (`model`, `util`, `app`).

El propósito académico del proyecto es desarrollar una aplicación sencilla pero bien estructurada, que refleje el entendimiento conceptual y técnico de la POO, permitiendo comprender la interacción entre objetos, la reutilización de código y la claridad del diseño orientado a clases.

---

## 🧩 Estructura General del Proyecto

La organización interna del proyecto sigue un modelo **modular y escalable**, distribuyendo el código según responsabilidad funcional:

```
SalmonttDigital/
│
├── src/
│   ├── app/
│   │   └── Main.java                     # Clase principal - punto de entrada del programa
│   │
│   ├── model/
│   │   ├── Persona.java                  # Clase base - representa a una persona genérica
│   │   ├── Empleado.java                 # Subclase - hereda de Persona e incluye cargo y sueldo
│   │   ├── Direccion.java                # Clase compuesta - agrupa información de ubicación
│   │   └── Rut.java                      # Clase especializada - valida y gestiona el RUT chileno
│   │
│   └── util/
│       └── RutInvalidoException.java     # Excepción personalizada para manejo de errores en RUT
│
├── .idea/                                # Configuración generada por IntelliJ IDEA
├── .gitignore                            # Archivos y carpetas excluidas del control de versiones
├── SalmonttDigital.iml                   # Archivo de módulo para IntelliJ
└── README.md                             # Documento de información y guía del proyecto
```

---

## ⚙️ Tecnologías y Herramientas Utilizadas

- **Lenguaje:** Java SE 17  
- **IDE:** IntelliJ IDEA Community Edition  
- **Sistema operativo de desarrollo:** Windows 10  
- **Compilador:** `javac` (Java Compiler)  
- **Sistema de control de versiones:** Git y GitHub  
- **Ejecución por consola:** PowerShell  

Estas herramientas permiten mantener un flujo de trabajo profesional, desde la codificación, compilación, pruebas en consola y publicación en GitHub, garantizando reproducibilidad y trazabilidad.

---

## 🚀 Ejecución del Programa

### 🔧 Compilación
```bash
javac -d out src/model/*.java src/util/*.java src/app/*.java
```

### ▶️ Ejecución
```bash
java -cp out app.Main
```

### 💻 Salida esperada
```
========== PERSONA ==========
Andrea Silva | RUT: 12345678-K | Av. Austral 1234, Mirasol, Puerto Montt, Los Lagos

========== EMPLEADO ==========
Carla Oyarzo | RUT: 15222333-1 | Los Salmónidos 456, Chinquihue, Puerto Montt, Los Lagos | EMP-001 - Jefa de Planta - $1500000.0
```

---

## 🧠 Conceptos de Programación Orientada a Objetos Aplicados

1. **Clases y Objetos** – representación de entidades reales.  
2. **Herencia** – la clase `Empleado` extiende a `Persona`.  
3. **Composición** – uso de objetos `Rut` y `Direccion` dentro de `Persona`.  
4. **Encapsulamiento** – protección de datos mediante `private` y métodos `get/set`.  
5. **Excepciones personalizadas** – `RutInvalidoException` controla errores específicos.  
6. **Validación de datos** – verificación del RUT chileno con lógica interna.  
7. **Modularidad** – estructura clara por paquetes (`app`, `model`, `util`).  

---

## 📦 Control de Versiones y GitHub

Repositorio oficial: [https://github.com/Jhans92/SalmonttDigital](https://github.com/Jhans92/SalmonttDigital)

---

## 🎓 Conclusión Académica

El proyecto **SalmonttDigital** evidencia la comprensión integral de los pilares de la **Programación Orientada a Objetos**, demostrando un diseño limpio, validaciones efectivas y modularidad en la estructura del código.  
La implementación de herencia, composición y manejo de excepciones refuerza el entendimiento de la interacción entre clases y la importancia de una arquitectura organizada.  
Además, el proceso completo desde el desarrollo hasta la publicación en GitHub refleja competencias profesionales esenciales en el ámbito del desarrollo de software.

---

## 🧾 Licencia

Proyecto desarrollado con fines académicos y formativos.  
© 2025 Jhans Pulido — Todos los derechos reservados.
