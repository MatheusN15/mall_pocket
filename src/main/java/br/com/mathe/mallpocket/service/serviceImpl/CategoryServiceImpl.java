package br.com.mathe.mallpocket.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mathe.mallpocket.entity.CategoryEntity;
import br.com.mathe.mallpocket.repository.CategoryRepository;
import br.com.mathe.mallpocket.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryRepository repo;
	
	@Override
	public CategoryEntity findById(Long id) {
		return repo.findById(id).get();
	}

	@Override
	public List<CategoryEntity> findAll() {
		return repo.findAll();
	}

	@Override
	public CategoryEntity save(CategoryEntity ent) {
		return repo.save(ent);
	}

	@Override
	public List<CategoryEntity> saveAll(List<CategoryEntity> ent) {
		return repo.saveAll(ent);
	}

}
