package co.edu.unbosque.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Proyecto implements Serializable {
	
	private static final long serialVersionUID= 1L;
	private String nombreCompania;
	private String cargo;
	private LocalDateTime fechaInicio;
	private LocalDateTime fechaFin;
	private String tecnologiaUsada;
	private String role;
	
	public Proyecto(String nombreCompania, String cargo, LocalDateTime fechaInicio, LocalDateTime fechaFin, String tecnologiaUsada,
			String role) {
		super();
		this.nombreCompania = nombreCompania;
		this.cargo = cargo;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.tecnologiaUsada = tecnologiaUsada;
		this.role = role;
	}

	public String getNombreCompania() {
		return nombreCompania;
	}

	public void setNombreCompania(String nombreCompania) {
		this.nombreCompania = nombreCompania;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDateTime fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDateTime getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDateTime fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getTecnologiaUsada() {
		return tecnologiaUsada;
	}

	public void setTecnologiaUsada(String tecnologiaUsada) {
		this.tecnologiaUsada = tecnologiaUsada;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Proyecto [nombreCompania=" + nombreCompania + ", cargo=" + cargo + ", fechaInicio=" + fechaInicio
				+ ", fechaFin=" + fechaFin + ", tecnologiaUsada=" + tecnologiaUsada + ", role=" + role + "]";
	}
	
	
	
	

}
