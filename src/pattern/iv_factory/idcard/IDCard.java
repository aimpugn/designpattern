package pattern.iv_factory.idcard;

import pattern.iv_factory.framework.AbstractProduct;

public class IDCard extends AbstractProduct{
	private String owner;
	
	public IDCard(String owner) {
		System.out.println(owner + "의 카드를 만듭니다. ");
		this.owner = owner;
	}
	
	/**
	 * `사용할 수 있는 것`의 `사용`을 구체적으로 정의
	 */
	@Override
	public void use() {
		System.out.println(owner + "의 카드를 사용합니다");
	} 
	
	public String getOwner() {
		return owner;
	}
}