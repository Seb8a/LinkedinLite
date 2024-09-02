package co.edu.unbosque.model;

import java.time.LocalDate;
import java.util.List;

/**
 * La clase {@code Project} representa un proyecto en el que un graduado ha trabajado, incluyendo detalles sobre la empresa,
 * el rol del graduado, las fechas de inicio y fin del trabajo, y las experiencias tecnológicas adquiridas.
 * Esta clase implementa la interfaz {@code Serializable} para permitir la serialización de objetos de tipo {@code Project}.
 * <p>
 * La clase contiene información sobre la empresa, el rol, las fechas de inicio y fin, y las experiencias tecnológicas del proyecto.
 * </p>
 */

public class Project {
	/**
	 * El nombre de la empresa en la que se realizó el proyecto.
	 */
	private String company;

	/**
	 * El rol desempeñado por el graduado en el proyecto.
	 */
	private String role;

	/**
	 * La fecha de inicio del trabajo en el proyecto.
	 */
	private LocalDate initialJob;

	/**
	 * La fecha de fin del trabajo en el proyecto.
	 */
	private LocalDate endJob;

	/**
	 * La lista de experiencias tecnológicas adquiridas durante el proyecto.
	 */
	private List<String> technologicalExperiences;
	
	/**
	 * El nombre del graduado.
	 */
	private String nameGraduate;
	
	/**
     * Constructor con parámetros para la clase {@code Project}.
     * 
     * @param company la empresa en la que se realizó el proyecto
     * @param role el rol desempeñado en el proyecto
     * @param initialJob la fecha de inicio del trabajo en el proyecto
     * @param endJob la fecha de fin del trabajo en el proyecto
     * @param technologicalExperiences la lista de experiencias tecnológicas adquiridas en el proyecto
     */
    public Project(String company, String role, LocalDate initialJob, LocalDate endJob, List<String> technologicalExperiences, String nameGraduate) {
        this.company = company;
        this.role = role;
        this.initialJob = initialJob;
        this.endJob = endJob;
        this.technologicalExperiences = technologicalExperiences;
        this.nameGraduate = nameGraduate;
    }
    
    /**
     * Obtiene el nombre de la empresa donde se realizó el proyecto.
     * 
     * @return el nombre de la empresa.
     */
    public String getCompany() {
        return company;
    }

    /**
     * Establece el nombre de la empresa donde se realizó el proyecto.
     * 
     * @param company el nombre de la empresa.
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * Obtiene el rol desempeñado en el proyecto.
     * 
     * @return el rol desempeñado en el proyecto.
     */
    public String getRole() {
        return role;
    }

    /**
     * Establece el rol desempeñado en el proyecto.
     * 
     * @param role el rol desempeñado en el proyecto.
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Obtiene la fecha de inicio del trabajo en el proyecto.
     * 
     * @return la fecha de inicio del trabajo en el proyecto.
     */
    public LocalDate getInitialJob() {
        return initialJob;
    }

    /**
     * Establece la fecha de inicio del trabajo en el proyecto.
     * 
     * @param initialJob la fecha de inicio del trabajo en el proyecto.
     */
    public void setInitialJob(LocalDate initialJob) {
        this.initialJob = initialJob;
    }

    /**
     * Obtiene la fecha de fin del trabajo en el proyecto.
     * 
     * @return la fecha de fin del trabajo en el proyecto.
     */
    public LocalDate getEndJob() {
        return endJob;
    }

    /**
     * Establece la fecha de fin del trabajo en el proyecto.
     * 
     * @param endJob la fecha de fin del trabajo en el proyecto.
     */
    public void setEndJob(LocalDate endJob) {
        this.endJob = endJob;
    }

    /**
     * Obtiene la lista de experiencias tecnológicas adquiridas en el proyecto.
     * 
     * @return la lista de experiencias tecnológicas.
     */
    public List<String> getTechnologicalExperiences() {
        return technologicalExperiences;
    }

    /**
     * Establece la lista de experiencias tecnológicas adquiridas en el proyecto.
     * 
     * @param technologicalExperiences la lista de experiencias tecnológicas.
     */
    public void setTechnologicalExperiences(List<String> technologicalExperiences) {
        this.technologicalExperiences = technologicalExperiences;
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
     * @param nameGraduate el nombre del graduado.
     */
	public void setNameGraduate(String nameGraduate) {
		this.nameGraduate = nameGraduate;
	}
    
    
}
