package pattern.iv_factory.idcard;

import java.util.ArrayList;
import java.util.List;

import pattern.iv_factory.framework.AbstractFactory;
import pattern.iv_factory.framework.AbstractProduct;
/**
 * 상위 추상 클래스를 구현하는 하위 클래스
 */
public class IDCardFactory extends AbstractFactory {
	private List<String> owners = new ArrayList<>();

	/**
	 * {@link pattern.iv_factory.framework.AbstractFactory#create(String)} 내의 로직에서 사용되는 상품 생성 메서드
	 */
	@Override
	public AbstractProduct createProduct(String owner) {
		return new IDCard(owner);
	}

	/**
	 * {@link pattern.iv_factory.framework.AbstractFactory#create(String)} 내의 로직에서 사용되는 상품 등록 메서드
	 */
	@Override
	public void registerProduct(AbstractProduct product) {
		owners.add(((IDCard) product).getOwner());
	}
}

