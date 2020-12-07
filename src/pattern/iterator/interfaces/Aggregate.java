package pattern.iterator.interfaces;

/**
 * 요소들이 나열되어 있는 집합체를 타나낸다. 이 인터페이스를 구현하는 클래스는 
 * {@link pattern.iterator.interfaces.Iterator} 주석의 list처럼 
 * 무엇인가 많이 모여 있을 것이다.
 * <p>
 * {@link pattern.iterator.interfaces.Aggregate}와 {@link pattern.iterator.interfaces.Iterator}의 관계는,
 * {@link pattern.iterator.book.BookShelf}와 {@link pattern.iterator.book.BookShelfIterator}의 관계로 구체화된다 
 */
public interface Aggregate {
	/**
	 * @return 집합체의 요소를 순회하기 위한 반복자 인스턴스 반환
	 */
	public abstract Iterator iterator();
}
