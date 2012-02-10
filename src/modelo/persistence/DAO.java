package modelo.persistence;

import java.util.List;

public interface DAO<T> {

	
	public void inserir(T obj);
	public List<T> listar();
	
	
	
	
	
	
	
	
	
}