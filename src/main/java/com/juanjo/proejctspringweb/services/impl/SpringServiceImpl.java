/**
 * 
 */
package com.juanjo.proejctspringweb.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juanjo.proejctspringweb.services.SpringService;
import com.juanjo.projectspringweb.dao.EmpleadoDAO;

/**
 * @author Juanjo
 *
 */
@Service
public class SpringServiceImpl implements SpringService {
	
	@Autowired
	private EmpleadoDAO empleadoDAOImpl;

	@Override
	public String mostrarNombreEmpresa() {
		// TODO Auto-generated method stub
		return "Anotacones con Spring y jsf";
	}

	@Override
	public String mostrarNombreEmpleado() {
		// TODO Auto-generated method stub
		return this.empleadoDAOImpl.consultarNombreEmpleado();
	}

}
