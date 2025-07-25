/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Juanes Cardona
 */
package controlador;

import dao.PersonaDAO;
import modelo.Persona;

import java.util.ArrayList;
import java.util.List;

public class controladorPersona{
    private final PersonaDAO dao;
    private ArrayList<Persona> personas;

    public controladorPersona() {
        this.dao = new PersonaDAO();
        this.personas = dao.cargarPersonas();
    }

    public ArrayList<Persona> listar() {
        return personas;
    }

    public void agregar(Persona persona) {
        personas.add(persona);
        dao.guardarPersonas(personas);
    }

    public void eliminarPorIdentificacion(String id) {
        personas.removeIf(p -> p.getIdentificacion().equals(id));
        dao.guardarPersonas(personas);
    }
    
    public static boolean validarPersona(String nombre, String documento) {
    return nombre != null && !nombre.isEmpty() && documento != null && documento.matches("\\d+");
}

}

