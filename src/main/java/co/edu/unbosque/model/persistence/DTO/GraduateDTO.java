package co.edu.unbosque.model.persistence.DTO;

import java.util.List;

import co.edu.unbosque.model.Project;

/**
 * La clase {@code GraduateDTO} representa un objeto de transferencia de datos para un graduado.
 * Contiene la información que se puede transportar entre capas de la aplicación, como el nombre,
 * dirección, ubicación, carta de presentación, disponibilidad para trabajar, foto, experiencia y proyectos.
 */
public class GraduateDTO {
	/**
	 * El nombre del graduado.
	 */
	private String name;

	/**
	 * La dirección del graduado.
	 */
	private String address;

	/**
	 * La ubicación del graduado (ciudad o región).
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
	private List<ProjectDTO> projects;
	
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
    public List<ProjectDTO> getProjects() {
        return projects;
    }

    /**
     * Establece la lista de proyectos en los que el graduado ha trabajado.
     * 
     * @param projects la lista de proyectos.
     */
    public void setProjects(List<ProjectDTO> projects) {
        this.projects = projects;
    }
}
