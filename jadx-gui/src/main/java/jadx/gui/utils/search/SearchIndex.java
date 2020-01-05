package jadx.gui.utils.search;

import io.reactivex.Flowable;

public interface SearchIndex<V> {

	void put(String str, V value);

	void put(StringRef str, V value);

	void replace(int index, String str, V value);

	void replace(int index, StringRef str, V value);

	boolean isStringRefSupported();

	Flowable<V> search(String searchStr, boolean caseInsensitive);

	int size();

	int getNextIndex();
}
