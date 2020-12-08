package pattern.ii_adapter.i_extendmethod;

import pattern.ii_adapter.i_extendmethod.interfaces.Print;

public class Main {

	public static void main(String[] args) {
		//Main 클래스는 PrintBanner가 어떻게 실현되고 있는지 모른다.
		//showWithParen이나 showWithAster는 완전히 감추어져 있다.
		//Main 클래스 변경 없이 PrintBanner 클래스 구현을 바꿀 수 있다.
		Print p = new PrintBanner( "HELLO" );
		
		p.printWeak();
		
		p.printStrong();
	}

}
