package org.mehtor.repository;

import java.util.List;
import java.util.Optional;

public interface ICrud<T,ID> {
	
	T save(T entity);
	
	Iterable<T> saveAll(Iterable<T> entities);
	
	Boolean deleteById(ID id);
	
	Optional<T> findById(ID id);
	
	Boolean existById(ID id);
	
	List<T> findAll();
	
//	Optional<T> findTeamIdByName(String teamName);
	
//	List<T> findByFieldNameAndValue(String fieldName,Object value);

//	List<T> findByFilledFields(T entity);
}