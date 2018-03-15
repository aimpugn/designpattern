package pattern.adapter.instancemethod;

//이미 제공되어 있는 클래스
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
