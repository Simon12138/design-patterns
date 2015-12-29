package cn.simon.factory.entity;

public class Drink extends Product {
	private final static String type = "Drink";
	
	private String name = null;
	
	@Override
	public String getProductType() {
		return type;
	}
	
	public void setName(String n){
		name = n;
	}

	@Override
	public String getProductName() {
		return name;
	}

}
