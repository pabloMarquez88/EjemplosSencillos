/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplogabi.service;

import com.mycompany.ejemplogabi.modelo.entity.Persona;
import java.util.List;

/**
 *
 * @author MAP53733
 */
public interface PersonaService {

    public Persona guardar(Persona p);

    public Persona modificar(Persona p);

    public Persona eliminar(Persona p);

    public List<Persona> listar();
}
