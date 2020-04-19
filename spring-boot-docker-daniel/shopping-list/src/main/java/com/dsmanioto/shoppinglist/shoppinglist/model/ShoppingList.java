package com.dsmanioto.shoppinglist.shoppinglist.model;

import lombok.Builder;
import lombok.Getter;
import org.springframework.cache.annotation.Cacheable;

import java.time.LocalDateTime;

@Cacheable
@Getter
@Builder
public class ShoppingList {
	
	private long id;
	private String item;
	private LocalDateTime dateRegistry;
	
}
