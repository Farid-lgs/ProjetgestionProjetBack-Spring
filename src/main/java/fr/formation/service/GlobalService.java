package fr.formation.service;

import java.util.List;

public interface GlobalService<T> {
	void add(T type);
	void delete(T type);
	void update(T type);
	List<T> findAll();
	T findById(long o);
}
