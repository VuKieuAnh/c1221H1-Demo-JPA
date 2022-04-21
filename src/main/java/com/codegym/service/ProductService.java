package com.codegym.service;

import com.codegym.model.Product;
import com.codegym.repo.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public class ProductService implements IProductService {
	@Autowired
	private IProductRepo productRepo;

	@Override
	public List<Product> findAll() {
		return productRepo.findAll();
	}

	@Override
	public Product findById(Long id) {
		return productRepo.findById(id);
	}

	@Override
	public void save(Product product) {
		productRepo.save(product);
	}

	@Override
	public void removeById(Long id) {
//		productRepo.removeById(id);
	}
}
