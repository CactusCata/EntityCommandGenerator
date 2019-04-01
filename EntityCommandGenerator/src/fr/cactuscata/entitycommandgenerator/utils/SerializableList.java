package fr.cactuscata.entitycommandgenerator.utils;

import java.util.ArrayList;

public class SerializableList<E extends Serializable> extends ArrayList<E> {

	private static final long serialVersionUID = 1L;

	public SerializableList() {

	}

	@SafeVarargs
	public SerializableList(E... es) {
		this.addAll(es);
	}

	public void addAll(@SuppressWarnings("unchecked") E... es) {
		for (E e : es) {
			super.add(e);
		}
	}

	@Override
	public final String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append('[');
		super.forEach(
				serialized -> builder.append('{').append(serialized.serialize()).append('}').append(
						','));
		builder.append(']');
		return builder.toString();
	}

	@SafeVarargs
	public static <E extends Serializable> SerializableList<E> asSerializableList(E... es) {
		SerializableList<E> sl = new SerializableList<>(es);
		for (E e : es) {
			sl.add(e);
		}
		return sl;
	}

}
