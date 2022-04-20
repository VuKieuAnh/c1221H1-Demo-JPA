package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private IProductService productService;

	@GetMapping
	public ModelAndView showAllProduct() {
		List<Product> products = productService.findAll();
		ModelAndView modelAndView = new ModelAndView("/product/list");
		modelAndView.addObject("products", products);
		return modelAndView;
	}
}
