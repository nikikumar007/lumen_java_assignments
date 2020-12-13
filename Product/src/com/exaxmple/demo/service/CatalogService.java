package com.exaxmple.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.exaxmple.demo.model.Product;

public class CatalogService {
private List<Product> catalog;

public CatalogService() {
	this.catalog =new ArrayList<>();
}

public boolean add(Product product)
{
	return this.catalog.add(product);
}

public List<Product> getAll()
{
	return this.catalog;
}

}
