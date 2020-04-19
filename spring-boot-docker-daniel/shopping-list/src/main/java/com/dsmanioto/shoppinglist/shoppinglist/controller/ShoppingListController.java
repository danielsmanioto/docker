package com.dsmanioto.shoppinglist.shoppinglist.controller;

import com.dsmanioto.shoppinglist.shoppinglist.model.ShoppingList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController("/greeting")
public class ShoppingListController {
	
	@GetMapping
	public List<ShoppingList> findAll() {
		return Arrays.asList();
	}
	
}
