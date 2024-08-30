package co.edu.unbosque.persistence;


import java.time.LocalDateTime;

public class FormularioDTO {

	private String nombreEgresado;
	private String email;
	private String mensaje;
	private LocalDateTime fechaLimite;
	
	public FormularioDTO(String nombreEgresado, String email, String mensaje, LocalDateTime fechaLimite) {

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
	
	
	
}
