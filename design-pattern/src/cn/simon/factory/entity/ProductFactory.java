package cn.simon.factory.entity;

public class ProductFactory extends Factory {

	@Override
	public <T extends Product> T createProduct(Class<T> t) {
		Product p = null;
		try {
			p = (Product) Class.forName(t.getName()).newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return (T) p;
	}

}
