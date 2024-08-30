package co.edu.unbosque.persistence;

import java.util.List;

public class EgresadoDTO {

    private List<String> habilidad;
    private String nombre;
    private String direccion;
    private String ciudad;
    private String pais;
    private String coverLetter;
    private boolean estado;
    private String foto;
    private Integer experiencia;
    private String proyecto;
    
    
	public EgresadoDTO(List<String> habilidad, String nombre, String direccion, String ciudad, String pais,
			String coverLetter, boolean estado, String foto, Integer experiencia, String proyecto) {

		this.habilidad = habilidad;
		this.nombre = nombre;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.pais = pais;
		this.coverLetter = coverLetter;
		this.estado = estado;
		this.foto = foto;
		this.experiencia = experiencia;
		this.proyecto = proyecto;
	}


	public List<String> getHabilidad() {
		return habilidad;
	}


	public void setHabilidad(List<String> habilidad) {
		this.habilidad = habilidad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public String getCoverLetter() {
		return coverLetter;
	}


	public void setCoverLetter(String coverLetter) {
		this.coverLetter = coverLetter;
	}


	public boolean isEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	public String getFoto() {
		return foto;
	}


	public void setFoto(String foto) {
		this.foto = foto;
	}


	public Integer getExperiencia() {
		return experiencia;
	}


	public void setExperiencia(Integer experiencia) {
		this.experiencia = experiencia;
	}


	public String getProyecto() {
		return proyecto;
	}


	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}
    
    
    
	
}
