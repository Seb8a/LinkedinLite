package co.edu.unbosque.model;

import java.util.List;

import co.edu.unbosque.model.persistence.DTO.ProjectDTO;

/**
 * La clase {@code Graduate} representa a un graduado con información relevante sobre su dirección, ubicación,
 * disponibilidad para trabajar, experiencia y proyectos asociados.
 * Esta clase implementa la interfaz {@code Serializable} para permitir la serialización de objetos de tipo {@code Graduate}.
 * <p>
 * La clase contiene información sobre el nombre del graduado, su dirección, ubicación, disponibilidad para trabajar,
 * una foto, experiencia y proyectos en los que ha trabajado.
 * </p>
 */

public class Graduate {
	/**
	 * El nombre del graduado.
	 */
	private String name;

	/**
	 * La dirección del graduado.
	 */
	private String address;

	/**
	 * La ubicación del graduado (ciudad o pais).
	 */
	private String location;

	/**
	 * La carta de presentación del graduado.
	 */
	private String coverLetter;

	/**
	 * Indica si el graduado está abierto a oportunidades laborales.
	 * {@code true} si está abierto, {@code false} en caso contrario.
	 */
	private boolean openToWork;

	/**
	 * La foto del graduado (normalmente una URL o ruta a un archivo).
	 */
	private String photo;

	/**
	 * La cantidad de experiencia del graduado en años.
	 */
	private int experience;

	/**
	 * La lista de proyectos en los que el graduado ha trabajado.
	 */
	private List<Project> projects;
	
	/**
     * Constructor con parámetros para la clase {@code Graduate}.
     * 
     * @param name el nombre del graduado
     * @param address la dirección del graduado
     * @param location la ubicación del graduado
     * @param coverLetter la carta de presentación del graduado
     * @param openToWork indica si el graduado está dispuesto a trabajar
     * @param photo la foto del graduado
     * @param experience la experiencia del graduado en años
     * @param projects la lista de proyectos en los que el graduado ha trabajado
     */
    public Graduate(String name, String address, String location, String coverLetter, boolean openToWork, String photo, int experience, List<Project> projects) {
        this.name = name;
        this.address = address;
        this.location = location;
        this.coverLetter = coverLetter;
        this.openToWork = openToWork;
        this.photo = photo;
        this.experience = experience;
        this.projects = projects;
    }
	
    /**
     * Obtiene el nombre del graduado.
     * 
     * @return el nombre del graduado.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre del graduado.
     * 
     * @param name el nombre del graduado.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene la dirección del graduado.
     * 
     * @return la dirección del graduado.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Establece la dirección del graduado.
     * 
     * @param address la dirección del graduado.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Obtiene la ubicación del graduado.
     * 
     * @return la ubicación del graduado.
     */
    public String getLocation() {
        return location;
    }

    /**
     * Establece la ubicación del graduado.
     * 
     * @param location la ubicación del graduado.
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Obtiene la carta de presentación del graduado.
     * 
     * @return la carta de presentación del graduado.
     */
    public String getCoverLetter() {
        return coverLetter;
    }

    /**
     * Establece la carta de presentación del graduado.
     * 
     * @param coverLetter la carta de presentación del graduado.
     */
    public void setCoverLetter(String coverLetter) {
        this.coverLetter = coverLetter;
    }

    /**
     * Indica si el graduado está abierto a oportunidades laborales.
     * 
     * @return {@code true} si el graduado está abierto a trabajar, {@code false} en caso contrario.
     */
    public boolean getOpenToWork() {
        return openToWork;
    }

    /**
     * Establece si el graduado está abierto a oportunidades laborales.
     * 
     * @param openToWork {@code true} si el graduado está abierto a trabajar, {@code false} en caso contrario.
     */
    public void setOpenToWork(boolean openToWork) {
        this.openToWork = openToWork;
    }

    /**
     * Obtiene la foto del graduado.
     * 
     * @return la foto del graduado.
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * Establece la foto del graduado.
     * 
     * @param photo la foto del graduado.
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    /**
     * Obtiene la cantidad de experiencia del graduado en años.
     * 
     * @return la cantidad de experiencia del graduado.
     */
    public int getExperience() {
        return experience;
    }

    /**
     * Establece la cantidad de experiencia del graduado en años.
     * 
     * @param experience la cantidad de experiencia del graduado.
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }

    /**
     * Obtiene la lista de proyectos en los que el graduado ha trabajado.
     * 
     * @return la lista de proyectos.
     */
    public List<Project> getProjects() {
        return projects;
    }

    /**
     * Establece la lista de proyectos en los que el graduado ha trabajado.
     * 
     * @param list la lista de proyectos.
     */
    public void setProjects(List<Project> list) {
        this.projects = list;
    }
}
