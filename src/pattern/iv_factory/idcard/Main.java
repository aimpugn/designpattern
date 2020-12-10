package pattern.iv_factory.idcard;

import pattern.iv_factory.framework.AbstractFactory;
import pattern.iv_factory.framework.AbstractProduct;

public class Main {

	public static void main(String[] args) {
		AbstractFactory factory = new IDCardFactory();
		AbstractProduct card1 = factory.create( "가나다" );
		AbstractProduct card2 = factory.create( "라마바" );
		AbstractProduct card3 = factory.create( "사아자" );
		card1.use();
		card2.use();
		card3.use();
	}

}

