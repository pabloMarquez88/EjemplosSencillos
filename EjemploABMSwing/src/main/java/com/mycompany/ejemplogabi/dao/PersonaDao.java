/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplogabi.dao;

import com.mycompany.ejemplogabi.modelo.entity.Persona;
import java.util.List;

/**
 *
 * @author MAP53733
 */
public interface PersonaDao {

    public Persona save(Persona p);

    public Persona delete(Persona p);

    public Persona update(Persona p);

    public List<Persona> list();
}
