package pattern.iterator.book;

import pattern.iterator.interfaces.Aggregate;
import pattern.iterator.interfaces.Iterator;

public class BookShelf implements Aggregate{
	private Book[] books;
	private int last = 0;
	
	public BookShelf(int maxsize) {
		this.books = new Book[ maxsize ];
	}
	
	//특정 인덱스의 객체 얻기
	public Book getBookAt( int index ) {
		return books[ index ];
	}
	
	//책 추가하기
	//책이 추가될 때 비로소 마지막 인덱스가 증가한다.
	public void appendBook( Book book ) {
		this.books[ last ] = book;
		last++;
	}
	
	//BookShelf의 길이 구하기
	public int getLength() {
		return last;
	}

	//BookShelf 클래스에 대응하는 Iterator
	@Override
	public Iterator iterator() {
		//BookShelf 클래스의 검색을 실행
		return new BookShelfIterator( this );
	}
}
