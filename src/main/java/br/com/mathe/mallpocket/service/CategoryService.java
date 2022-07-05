package br.com.mathe.mallpocket.service;

import java.util.List;

import br.com.mathe.mallpocket.entity.CategoryEntity;

public interface CategoryService {

	CategoryEntity findById(Long id);
	
	List<CategoryEntity> findAll();
	
	CategoryEntity save(CategoryEntity ent);
	
	List<CategoryEntity> saveAll(List<CategoryEntity> ent);
}
