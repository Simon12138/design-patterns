package cn.simon.factory.entity;

public abstract class Factory {
	public abstract <T extends Product> T createProduct(Class<T> t);
}
