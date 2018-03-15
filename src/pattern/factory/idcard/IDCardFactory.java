package pattern.factory.idcard;

import java.util.ArrayList;
import java.util.List;

import pattern.factory.framework.Factory;
import pattern.factory.framework.Product;

public class IDCardFactory extends Factory {
	private List<String> owners = new ArrayList<>();
	@Override
	public Product createProduct(String owner) {
		return new IDCard( owner );
	}
	@Override
	public void registerProduct(Product product) {
		owners.add( ( ( IDCard ) product ).getOwner() );
	}
}

