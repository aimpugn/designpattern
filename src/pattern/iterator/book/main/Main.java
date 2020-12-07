package pattern.iterator.book.main;

import pattern.iterator.book.Book;
import pattern.iterator.book.BookShelf;
import pattern.iterator.interfaces.Iterator;

public class Main {

	public static void main(String[] args) {
		runIterator();

	}

	
		
	/**
	 * 왜 반복자를 사용할까?
	 * <p>
	 * `구현`{@link pattern.iterator.book.BookShelf}에 의존하지 않고 반복 가능하기 때문
	 * <p>
	 * 즉, 아래 코드의 변경 없이, {@link pattern.iterator.book.BookShelf} 수정하고 iterator만 정상적으로 반환하면 동작함
	 * <p>
	 * 이로 인해 클래스, {@link pattern.iterator.book.BookShelf}의 재이용성이 높아진다
	 * <p>
	 * 재이용화 촉진 = 클래스를 부품처럼 사용 & 하나의 부품 수정해도 다른 부품에 큰 영향 없이 적은 수정만으로 끝낼 수 있음
	 * <p>
	 * {@link java.util.Iterator}처럼 가장 추상화된 반복자를 사용하여 어떤 Iterator 구현 클래스가 오더라도
	 * 아래 반복문에 영향이 없도록 할 수 있다.
	 * <p>
	 * 즉, 인터페이스는 클래스 간의 결합을 낮춘다
	 */
	public static void runIterator() {
		BookShelf bookShelf = new BookShelf( 4 );
		bookShelf.appendBook( new Book( "파이썬 웹 프로그래밍" ) );
		bookShelf.appendBook( new Book( "HTML + CSS3 입문" ) );
		bookShelf.appendBook( new Book( "자사스크립트 핵심 가이드" ) );
		bookShelf.appendBook( new Book( "CentOS" ) );
		Iterator it = bookShelf.iterator();
		while( it.hasNext() ) {
			Book book = ( Book ) it.next();
			System.out.println( book.getName() );
		}
	}
}
