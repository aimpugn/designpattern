package pattern.adapter.extendmethod;

import pattern.adapter.extendmethod.interfaces.Print;

public class PrintBanner extends Banner implements Print{
	public PrintBanner( String str ) {
		super( str );
	}

	@Override
	public void printWeak() {
		showWithParen();
	}

	@Override
	public void printStrong() {
		showWithAster();
	}
}
