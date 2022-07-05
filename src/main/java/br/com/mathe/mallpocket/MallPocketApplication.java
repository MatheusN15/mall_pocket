package br.com.mathe.mallpocket;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.mathe.mallpocket.entity.CategoryEntity;
import br.com.mathe.mallpocket.service.CategoryService;

@SpringBootApplication
public class MallPocketApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MallPocketApplication.class, args);
	}
	
	@Autowired
	private CategoryService service;

	@Override
	public void run(String... args) throws Exception {
		CategoryEntity cat1 = new CategoryEntity();
		cat1.setNome("Um");
		CategoryEntity cat2 = new CategoryEntity();
		cat2.setNome("Dois");
		List<CategoryEntity> list = new ArrayList<>();
		list.add(cat1);
		list.add(cat2);
		service.saveAll(list);
	}

}
