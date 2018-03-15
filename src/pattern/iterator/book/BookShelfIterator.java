package pattern.iterator.book;

import pattern.iterator.interfaces.Iterator;

public class BookShelfIterator implements Iterator {

	//BookShelfIterator가 검색할 서가
	private BookShelf bookShelf;
	//현재 주목하고 있는 책을 가리키는 첨자
	private int index;
	
	public BookShelfIterator( BookShelf bookShelf ) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}
	
	@Override
	public boolean hasNext() {
		//iterator의 위치(index)가 집합체의 크기보다 작은 경우에는 다음값이 존재
		if( index < bookShelf.getLength() ) {
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		Book book = bookShelf.getBookAt( index );
		//다음 next() 호출시 다음 값을 반환하도록 인덱스 증가
		index++;
		return book;
	}

}
