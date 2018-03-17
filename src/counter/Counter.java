package counter;

import java.util.Observable;

/**
 * A simple counter.
 * 
 * @author Kanchanok Kannee
 */
public class Counter extends Observable {
	private int count;

	/**
	 * Initialize a Counter.
	 */
	public Counter() {
		this.count = 0;
	}

	public void add(int howmuch) {
		count += howmuch;
		setChanged();
		notifyObservers();
	}

	public int getCount() {
		return count;
	}
}
