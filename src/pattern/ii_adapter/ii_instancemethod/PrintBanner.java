package pattern.ii_adapter.ii_instancemethod;

/**
 * 인스턴스에 의한 Adapter 패턴(인스턴스에 위임)
 * <p>
 * {@link Banner} 클래스 사용 및 {@link Print} 클래스 상속
 */
public class PrintBanner extends Print {
	/**
	 * {@link Banner} 클래스의 인스턴스
	 */
	private Banner banner;
	
	public PrintBanner( String str ) {
		this.banner = new Banner( str );
	}
	
	@Override
	public void printWeak() {
		banner.showWithParen();
	}

	@Override
	public void printStrong() {
		banner.showWithAster();
	}

}
