package co.edu.unbosque.model.persistence.DAO;

import java.util.List;

/**
 * La interfaz {@code DataAccessObject} proporciona métodos genéricos para acceder a datos
 * en una capa de persistencia. Las implementaciones específicas de esta interfaz
 * manejarán operaciones concretas para almacenar y recuperar objetos del tipo especificado.
 *
 * @param <T> el tipo de objeto que esta interfaz maneja.
 */
public interface DataAccessObject<T> {
	/**
     * Recupera todos los objetos del tipo especificado desde la capa de persistencia.
     * 
     * @return una lista de todos los objetos del tipo {@code T}. Si no hay objetos,
     *         se devuelve una lista vacía.
     */
	List<T> getAll();
	
	void post(T item);
}
