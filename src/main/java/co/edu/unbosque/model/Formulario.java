package co.edu.unbosque.model;

import java.io.Serializable;
import java.time.LocalDateTime;


public class Formulario implements Serializable {
	
	private static final long serialVersionUID= 1L;
	private String nombreEgresado;
	private String email;
	private String mensaje;
	private LocalDateTime fechaLimite;
	
	public Formulario(String nombreEgresado, String email, String mensaje, LocalDateTime fechaLimite) {
		super();
		this.nombreEgresado = nombreEgresado;
		this.email = email;
		this.mensaje = mensaje;
		this.fechaLimite = fechaLimite;
	}

	public String getNombreEgresado() {
		return nombreEgresado;
	}

	public void setNombreEgresado(String nombreEgresado) {
		this.nombreEgresado = nombreEgresado;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public LocalDateTime getFechaLimite() {
		return fechaLimite;
	}

	public void setFechaLimite(LocalDateTime fechaLimite) {
		this.fechaLimite = fechaLimite;
	}

	@Override
	public String toString() {
		return "Formulario [nombreEgresado=" + nombreEgresado + ", email=" + email + ", mensaje=" + mensaje
				+ ", fechaLimite=" + fechaLimite + "]";
	}
	
	
	
	
}
