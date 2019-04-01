package fr.cactuscata.entitycommandgenerator.tags.list;

import fr.cactuscata.entitycommandgenerator.utils.IntervalsNumbers;
import fr.cactuscata.entitycommandgenerator.utils.Serializable;

public class IntTag implements Serializable {

	private final int value;

	public IntTag(int value) {
		this.value = value;
	}

	public IntTag(int value, Number min, Number max) {
		new IntervalsNumbers(value, min, max);
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	@Override
	public String serialize() {
		return String.valueOf(this.getValue());
	}

}
