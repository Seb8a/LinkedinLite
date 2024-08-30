package co.edu.unbosque.persistence;

public interface FormularioDAO<T> {

	String getAll();
	boolean add(T x);
	boolean delete(T x);
	T find (T x);
	boolean update(T x, T y);

}
