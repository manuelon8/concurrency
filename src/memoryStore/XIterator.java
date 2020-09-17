package memoryStore;

import java.util.ArrayList;
import java.util.Iterator;

public class XIterator<T> implements Iterable<T> {
	
	  	private T[] arrayList;
	    private int currentSize;
	    
	    
	
	
	public  XIterator(T[] arrayList) {
			
			this.arrayList = arrayList;
			this.currentSize = arrayList.length;
		}

	@Override
	public Iterator<T> iterator() {
		
		Iterator<T> it = new Iterator<T>() {
			private int currentIndex = 0;
			
			@Override
			public boolean hasNext() {
				return currentIndex < currentSize && arrayList[currentIndex] != null;
			}

			@Override
			public T next() {
				return arrayList[currentIndex++];
			}
			
		};
		
		return it;
	}

}
