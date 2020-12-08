package pattern.iv_factory.framework;

//Template Method 패턴 사용
public abstract class Factory {
	//제품을 만들기
	public abstract Product createProduct( String owner );
	//제품을 등록하기
	public abstract void registerProduct( Product product );
	//create()에서 Product의 인스턴스 생성
	public final Product create( String owner ) {
		//제품(Product)의 구체적인 생성 방법은 하위 클래스에 위임
		Product p = createProduct( owner );
		//제품의 구체적인 등록 방법도 하위 클래스에 위임
		registerProduct( p );
		return p;
	}
}
