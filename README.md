Este proyecto es una aplicación de escritorio en Java desarrollada con el patrón MVC (Modelo-Vista-Controlador) para la gestión de personas en una veterinaria,
específicamente Propietarios y Veterinarios. Se implementó una clase abstracta Persona que es serializable y sirve como base para las clases hijas Propietario 
y Veterinario, las cuales añaden atributos específicos como teléfono y especialidad. El controlador (controladorPersona) maneja la lógica para agregar, listar
y eliminar personas, y se comunica con la clase PersonaDAO, que gestiona la persistencia de datos mediante serialización en un archivo binario (personas.dat).
La interfaz gráfica fue construida con Java Swing (JFrame, JTextField, JComboBox, JTextArea, etc.), permitiendo al usuario registrar personas, visualizar el
listado y eliminar registros por identificación. Se aplicaron principios de programación orientada a objetos como herencia y polimorfismo, así como validaciones
básicas de entrada, logrando una aplicación modular, funcional y fácilmente escalable.

