package pattern.i_iterator.interfaces;

/**
 * <pre>
 * for (int i; i < list.lengt; i++) { // `i`를 하나씩 증가시키면
 * 	list[i];  // list 요소 전체를 처음부터 차례대로 검색
 * }
 * 
 * - `int i 변수의 기능`을 추상화해서 일반화한 것을 `Interator 패턴`이라고 하며
 * - Interator 패턴`은
 * 	- 많이 모여 있는 것들을 순서대로 지정하면서 
 * 	- 전체를 검색하는 처리를 실행하기 위한 것
 * 	- Aggregate 역할의 외부에 놓여 있어서 Aggregate에 종속되지 않고 여러 Interator 구현 클래스 역할을 만들 수 있다
 * </pre>
 */
public interface Iterator {
	/**
	 * @return 다음 요소가 존재할 경우 <code>true</code> 
	 */
	public abstract boolean hasNext();
	
	/**
	 * 1. 집합체({@link pattern.i_iterator.interfaces.Aggregate} 인터페이스 구현 클래스)의 요소를 1개 반환<p>
	 * 2. 다음번 {@link Iterator#next()} 호출 시 다음 요소 반환하도록 다음으로 진행
	 * 
	 * @return 집합체의 요소 1개
	 */
	public abstract Object next();
}
