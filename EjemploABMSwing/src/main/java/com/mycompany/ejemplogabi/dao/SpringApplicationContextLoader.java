/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplogabi.dao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author MAP53733
 */
public class SpringApplicationContextLoader {

    public static final ClassPathXmlApplicationContext CONTEXTO = new ClassPathXmlApplicationContext("applicationContext.xml");

    public static void main(String args[]) {
    }
}
