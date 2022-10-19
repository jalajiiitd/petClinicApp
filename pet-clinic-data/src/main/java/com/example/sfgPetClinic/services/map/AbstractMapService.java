package com.example.sfgPetClinic.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import com.example.sfgPetClinic.model.BaseEntity;


public abstract class AbstractMapService<T extends BaseEntity,ID extends Long> {

	protected Map<Long, T> map = new HashMap<>();
	Set<T> findAll() {
		return new HashSet<>(map.values());
	}
	
	T findById(ID id) {
		return map.get(id);
	}
	
	T save(T obj) {
		
		if(obj != null) {
			if(obj.getId() == null) {
				obj.setId(getNextId());
			}
			map.put(obj.getId(), obj);
		}
		else {
			throw new RuntimeException("Object cannot be null");
		}
		return obj;
	}
	
	void deleteById(ID id) {
		map.remove(id);
	}
	
	void delete(T obj) {
		Iterator<Map.Entry<Long, T>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
		    Map.Entry<Long,T> entry = iterator.next();
		    if (obj.equals(entry.getValue())) {
		        iterator.remove();
		    }
		}
	}
	
	private Long getNextId() {
		Long nextId = null;
		try {
			nextId = Collections.max(map.keySet()) + 1;
		}
		catch(NoSuchElementException e) {
			nextId = 1L;
		}
		return nextId;
	}
}
