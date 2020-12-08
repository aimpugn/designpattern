package pattern.i_iterator.book;

import pattern.i_iterator.interfaces.Iterator;

public class BookShelfIterator implements Iterator {

	/**
	 * BookShelfIterator가 검색할 서가
	 */
	private BookShelf bookShelf;
	/**
	 * 현재 가리키고 있는 책을 가리키는 인덱스
	 */
	private int index;
	
	public BookShelfIterator( BookShelf bookShelf ) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}
	
	/**
	 * 마지막 요소 얻기 전에 true 값 반환하지만, 마지막 요소 얻은 후에 false 반환
	 */
	@Override
	public boolean hasNext() {
		//iterator의 위치(index)가 집합체의 크기보다 작은 경우에는 다음값이 존재
		if( index < bookShelf.getLength() ) {
			return true;
		}

		return false;
	}

	/**
	 * next() = return current element and advance to next position
	 */
	@Override
	public Object next() {
		// `BookShelf가 어떻게 구현되어 있는지 알기에 사용`할 수 있다는 것은, 이 Iterator 구현 클래스가 
		// BookShelf에 종속되어 있음을 의미하며, getBookAt 메서드라는 인터페이스 변경 시 이 Iterator 구현 클래스도 수정 필요
		Book book = bookShelf.getBookAt( index );
		//다음 next() 호출시 다음 값을 반환하도록 인덱스 증가
		index++;

		return book;
	}
}
