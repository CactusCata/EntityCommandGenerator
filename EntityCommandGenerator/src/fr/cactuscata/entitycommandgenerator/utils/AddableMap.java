package fr.cactuscata.entitycommandgenerator.utils;

import java.util.HashMap;

public class AddableMap<K> extends HashMap<K, Integer> {

	private static final long serialVersionUID = 1L;
	private K last;

	public void register(K k) {
		this.last = k;
	}

	public final void add(int value) {
		try {
			super.put(
					this.last,
					super.containsKey(this.last) ? value + super.get(this.last) : value);
		} catch (NullPointerException e) {
			throw new AddableMapException();
		}
	}

	private static class AddableMapException extends RuntimeException {

		private static final long serialVersionUID = 1L;

		private AddableMapException() {
			super("The key hasn't registered before !");
		}

	}

}
