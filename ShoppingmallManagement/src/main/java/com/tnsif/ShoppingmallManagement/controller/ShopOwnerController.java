package com.tnsif.ShoppingmallManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.ShoppingmallManagement.entity.ShopOwner;
import com.tnsif.ShoppingmallManagement.entity.ShopOwner;
import com.tnsif.ShoppingmallManagement.repository.ShopOwnerRepository;

@RestController
public class ShopOwnerController {
	@Autowired
	ShopOwnerRepository repo;

	@PostMapping("/ShopOwner")
	public ShopOwner addStudent(@RequestBody ShopOwner s) {

		return repo.save(s);
	}

	@GetMapping("/ShopOwner")
	public List<ShopOwner> getStudents() {
		return repo.findAll();

	}

	@GetMapping("/ShopOwner/{id}")
	public ShopOwner getShopOwnerById(@PathVariable Integer id) {
		return repo.findById(id).get();

	}

	@DeleteMapping("/ShopOwner/{id}")
	public void deleteStudent(@PathVariable Integer id) {
		repo.deleteById(id);
	}

}
