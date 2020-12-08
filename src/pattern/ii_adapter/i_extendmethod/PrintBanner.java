package pattern.ii_adapter.i_extendmethod;

import pattern.ii_adapter.i_extendmethod.interfaces.Print;

/**
 * 클래스에 의한 Adapter 패턴(추상 클래스 상속)
 * <p>
 * {@link Banner} 클래스 사용 및 {@link Print} 인터페이스 구현
 */
public class PrintBanner extends Banner implements Print{
	public PrintBanner( String str ) {
		super(str);
	}

	/**
	 * 이미 구현된 {@link Banner#showWithParen()} 사용하여 구현
	 */
	@Override
	public void printWeak() {
		showWithParen();
	}

	/**
	 * 이미 구현된 {@link Banner#showWithAster()} 사용하여 구현
	 */
	@Override
	public void printStrong() {
		showWithAster();
	}
}
