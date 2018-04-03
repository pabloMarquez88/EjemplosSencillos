/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplogabi.facade;

import com.mycompany.ejemplogabi.dao.SpringApplicationContextLoader;
import com.mycompany.ejemplogabi.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 *
 * @author MAP53733
 */
public class ServicesFacade {

    public static final ServicesFacade INSTANCIA = new ServicesFacade();

    private PersonaService personaService;

    public ServicesFacade() {
        ClassPathXmlApplicationContext contexto = SpringApplicationContextLoader.CONTEXTO;
        personaService = (PersonaService) contexto.getBean("personaService");
    }

    public static void main(String[] args) {
        System.out.println(INSTANCIA.personaService);

    }

    public PersonaService getPersonaService() {
        return personaService;
    }

    public void setPersonaService(PersonaService personaService) {
        this.personaService = personaService;
    }

}
