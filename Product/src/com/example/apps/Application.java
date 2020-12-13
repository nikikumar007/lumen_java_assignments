package com.example.apps;

import java.util.List;

import com.exaxmple.demo.model.ElectronicProduct;
import com.exaxmple.demo.model.FoodProduct;
import com.exaxmple.demo.model.Product;
import com.exaxmple.demo.service.CatalogService;

public class Application {
	public static void pushAndPull(List<? super Product> list,Product prod)
	{
		System.out.println(list.add(prod));
		System.out.println(list.get(1));
	}
	public static void OnlypullNotPush(List<? extends ElectronicProduct> list,Product prod)
	{
		//System.out.println(list.add(prod));
		System.out.println(list.get(1));
	}
public static void main(String[] args)
{
	CatalogService service=new CatalogService();
	
	Product paneer =new FoodProduct(1010, "paneer", 20.0,"");
	Product tv=new ElectronicProduct(4848, "Sony Tv", 45000);
	Product tv2=new ElectronicProduct(5457, "LG Tv", 45000);
	service.add(paneer);
	service.add(tv);
	System.out.println(service.getAll());
	List<Product> list=service.getAll();
	pushAndPull(list, tv2);
}
}
