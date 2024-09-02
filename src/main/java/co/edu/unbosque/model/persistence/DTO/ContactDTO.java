package co.edu.unbosque.model.persistence.DTO;

import java.time.LocalDate;

/**
 * La clase {@code ContactDTO} representa un objeto de transferencia de datos para la información de contacto.
 * Contiene el nombre de la empresa, el correo electrónico de recursos humanos, el mensaje y la fecha de expiración del trabajo.
 */
public class ContactDTO {
	/**
	 * El nombre de la empresa de contacto.
	 */
	private String nameCompany;

	/**
	 * El correo electrónico de recursos humanos de la empresa de contacto.
	 */
	private String emailRRHH;

	/**
	 * El mensaje relacionado con el contacto.
	 */
	private String message;

	/**
	 * La fecha de expiración del trabajo o la oferta de contacto.
	 */
	private LocalDate expirationJob;
	
	/**
	 * Nombre del graudado a contactar
	 */
	private String nameGraduate;
	
	 /**
     * Obtiene el nombre de la empresa.
     * 
     * @return el nombre de la empresa
     */
    public String getNameCompany() {
        return nameCompany;
    }

    /**
     * Establece el nombre de la empresa.
     * 
     * @param nameCompany el nombre de la empresa
     */
    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    /**
     * Obtiene el correo electrónico de recursos humanos.
     * 
     * @return el correo electrónico de recursos humanos
     */
    public String getEmailRRHH() {
        return emailRRHH;
    }

    /**
     * Establece el correo electrónico de recursos humanos.
     * 
     * @param emailRRHH el correo electrónico de recursos humanos
     */
    public void setEmailRRHH(String emailRRHH) {
        this.emailRRHH = emailRRHH;
    }

    /**
     * Obtiene el mensaje relacionado con el contacto.
     * 
     * @return el mensaje
     */
    public String getMessage() {
        return message;
    }

    /**
     * Establece el mensaje relacionado con el contacto.
     * 
     * @param message el mensaje
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Obtiene la fecha de expiración del trabajo.
     * 
     * @return la fecha de expiración del trabajo
     */
    public LocalDate getExpirationJob() {
        return expirationJob;
    }

    /**
     * Establece la fecha de expiración del trabajo.
     * 
     * @param expirationJob la fecha de expiración del trabajo
     */
    public void setExpirationJob(LocalDate expirationJob) {
        this.expirationJob = expirationJob;
    }
    
    /**
     * Obtiene el nombre del graduado.
     * 
     * @return el nombre del graduado
     */
	public String getNameGraduate() {
		return nameGraduate;
	}
	
	 /**
     * Establece el nombre del graduado.
     * 
     * @param nameGraduate el nombre del graduado
     */
	public void setNameGraduate(String nameGraduate) {
		this.nameGraduate = nameGraduate;
	}
}
