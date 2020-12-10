package pattern.iv_factory.framework;

import pattern.iv_factory.idcard.IDCard;

/**
 * `인스턴스 생성 방법`을 결정하는 상위 추상 클래스
 * <p>
 * 인스턴스 생성 위한 골격(framework)를 정의
 */
public abstract class AbstractFactory {
	/**
	 * 제품을 만들기 추상 메서드. 구현 필요
	 * 
	 * @param owner
	 * @return
	 */
	public abstract AbstractProduct createProduct(String owner);

	/**
	 * 디폴트로 구현을 해놓을 수도 있다
	 * 
	 * @param owner
	 * @return
	 */
	public IDCard creaProductDefault(String owner) {
		return new IDCard(owner);
	}

	/**
	 * 디폴트로 구현을 해놓을 수도 있다
	 * 
	 * @param owner
	 * @return
	 */
	public AbstractProduct createProductException(String owner) {
		throw new FactoryMethodRuntimeException();
	}

	/**
	 * 제품을 등록하기 추상 메서드. 구현 필요
	 * 
	 * @param product
	 */
	public abstract void registerProduct(AbstractProduct product);

	/**
	 * 상품 생성 로직을 정의한 템플릿. 
	 * <p>
	 * 여기서 공장이란 "이 메서드에서 {@link pattern.iv_factory.framework.AbstractProduct}의 구체적인 인스턴스를 생성하는 것" 의미
	 * <p>
	 * {@link pattern.iii_templatemethod.AbstractDisplay#display()}와 같다
	 * 
	 * @param owner
	 * @return instance of concrete class extends AbstractProduct
	 */
	public final AbstractProduct create(String owner) {
		//제품(Product)의 구체적인 생성 방법은 하위 클래스에 위임
		AbstractProduct p = createProduct(owner);
		//제품의 구체적인 등록 방법도 하위 클래스에 위임
		registerProduct(p);

		return p;
	}
}
