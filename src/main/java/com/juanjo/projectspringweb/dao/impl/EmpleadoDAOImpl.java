/**
 * 
 */
package com.juanjo.projectspringweb.dao.impl;

import org.springframework.stereotype.Service;

import com.juanjo.projectspringweb.dao.EmpleadoDAO;

/**
 * @author Juanjo
 *
 */
@Service
public class EmpleadoDAOImpl implements EmpleadoDAO {

	@Override
	public String consultarNombreEmpleado() {
		// TODO Auto-generated method stub
		return "Juan José De LA Fuente Leon";
	}

}
