/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espe.distribuidas.dao;

import com.espe.distribuidas.model.Devoluciones;
import com.espe.distribuidas.commons.dao.DefaultGenericDAOImple;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Andres Vr
 */
@LocalBean
@Stateless 
public class DevolucionesDAO extends DefaultGenericDAOImple<Devoluciones, String> {
     public DevolucionesDAO() {
        super(Devoluciones.class);
    }
    
}
