package cn.simon.factory.entity;

public class Food extends Product {
	private static final String productType = "Food";
	
	private String name = null;
	
	@Override
	public String getProductType() {
		return productType;
	}
	
	public void setName(String n){
		name = n;
	}

	@Override
	public String getProductName() {
		return name;
	}

}
