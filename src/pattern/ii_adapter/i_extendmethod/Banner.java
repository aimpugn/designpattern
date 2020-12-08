package pattern.ii_adapter.i_extendmethod;

/**
 * 1. 목표: {@link Banner}클래스 사용해서 {@link Print} 인터페이스 충족시키는 클래스 
 */
public class Banner {
	private String str;
	public Banner( String str ) {
		this.str = str;
	}
	
	public void showWithParen() {
		System.out.println( "(" + str + ")" );
	}
	
	public void showWithAster() {
		System.out.println( "*" + str + "*" );
	}
	
}
