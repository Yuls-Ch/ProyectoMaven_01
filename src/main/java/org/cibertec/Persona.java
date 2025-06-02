package org.cibertec;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Persona {

	private String nombre,web; //modificador private es opcional
	private int edad; //debidoa laclase lombok
	
	public Persona(String nombre, String web ,int edad) {
		this.nombre = nombre;
		this.web = web;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	
}
