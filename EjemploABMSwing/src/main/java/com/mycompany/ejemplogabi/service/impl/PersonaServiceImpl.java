/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplogabi.service.impl;

import com.mycompany.ejemplogabi.dao.PersonaDao;
import com.mycompany.ejemplogabi.modelo.entity.Persona;
import com.mycompany.ejemplogabi.service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author MAP53733
 */
@Component (value = "personaService")
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaDao personaDao;

    @Override
    @Transactional
    public Persona guardar(Persona p) {
        return personaDao.save(p);
    }

    @Override
    @Transactional
    public Persona modificar(Persona p) {
        return personaDao.update(p);
    }

    @Override
    @Transactional
    public Persona eliminar(Persona p) {
        return personaDao.delete(p);
    }

    @Override
    @Transactional
    public List<Persona> listar() {
        return personaDao.list();
    }

}
