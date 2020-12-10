package pattern.iv_factory.framework;

/**
 * 제품 인스턴스 생성 위한 상위 추상 클래스
 */
public abstract class AbstractProduct {
	/**
	 * 이 추상 클래스에는 {@link this#use()}만 정의했는데,
	 * 이는 우선 `제품`이란 `사용할 수 있는 것`임을 나타낸다
	 */
	public abstract void use();
}
