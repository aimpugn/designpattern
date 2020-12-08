package pattern.iii_templatemethod;

/**
 * 뼈대를 결정하는 상위 클래스
 */
public abstract class AbstractDisplay {
	/**
	 * 실체 없는 추상 메서드
	 */
	public abstract void open();

	/**
	 * 실체 없는 추상 메서드
	 */
	public abstract void print();

	/**
	 * 실체 없는 추상 메서드
	 */
	public abstract void close();

	/**
	 * 로직이 정의된 템플릿 메서드
	 * <p>
	 * 실체 없는 추상 메서드 사용하고 final 선언하여 메서드의 뼈대를 고정
	 * <p>
	 * 실체는 이 {@link AbstractDisplay} 클래스 상속하는 하위 클래스의 몫
	 * <p>
	 * <pre>
	 * open();
	 * FOR 5
	 *   print();
	 * close
	 * </pre>
	 */
	public final void display() {
		open();
		for( int i = 0; i < 5; i++ ) {
			print();
		}
		close();
	}
}
