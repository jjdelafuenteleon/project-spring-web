/**
 * 
 */
package com.juanjo.projectspringweb.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.juanjo.proejctspringweb.services.SpringService;

/**
 * @author Juanjo
 *
 */
@ManagedBean
@ViewScoped
public class SpringJSFController {
	
	private String nombreEmpresa;
	private String nombreEmpleado;
	
	
	@ManagedProperty("#{springServiceImpl}")
	private SpringService springServiceImpl;
	
	@PostConstruct
	public void init() {
		String nombre = this.springServiceImpl.mostrarNombreEmpresa();
		System.out.println("SpringJSFController.init(this.SpringServicesImpl) = "+nombre);
		this.nombreEmpresa = nombre;
		
		String nombreEmpleado = this.springServiceImpl.mostrarNombreEmpleado();
		System.out.println("SpringJSFController.init(nombreEmpleado) = "+nombreEmpleado);
		this.nombreEmpleado = nombreEmpleado;
	}
	
	/**
	 * @return the spingServiceImpl
	 */
	public SpringService getSpingServiceImpl() {
		return springServiceImpl;
	}

	/**
	 * @param spingServiceImpl the spingServiceImpl to set
	 */
	public void setSpringServiceImpl(SpringService springServiceImpl) {
		this.springServiceImpl = springServiceImpl;
	}
	
	/**
	 * @return the nombreEmpresa
	 */
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	/**
	 * @param nombreEmpresa the nombreEmpresa to set
	 */
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	/**
	 * @return the nombreEmpleado
	 */
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	/**
	 * @param nombreEmpleado the nombreEmpleado to set
	 */
	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}


}
