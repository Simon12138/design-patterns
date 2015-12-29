package cn.simon.factory.main;

import cn.simon.factory.entity.Factory;
import cn.simon.factory.entity.Food;
import cn.simon.factory.entity.ProductFactory;

public class FactoryMain {

	public static void main(String[] args) {
		Factory factory = new ProductFactory();
		Food food = factory.createProduct(Food.class);
		food.setName("banana");
		
		System.out.println(food.getProductType() + "\n" + food.getProductName());
	}

}
