package pattern.factory.idcard;

import pattern.factory.framework.Factory;
import pattern.factory.framework.Product;

public class Main {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create( "가나다" );
		Product card2 = factory.create( "라마바" );
		Product card3 = factory.create( "사아자" );
		card1.use();
		card2.use();
		card3.use();
	}

}

