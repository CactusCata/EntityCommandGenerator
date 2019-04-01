package fr.cactuscata.entitycommandgenerator.tags;

import fr.cactuscata.entitycommandgenerator.utils.Serializable;

public class DataTag implements Serializable {

	private final DataTagType dataTag;
	private final Object value;

	public DataTag(DataTagType dataTag, Object value) {
		this.dataTag = dataTag;
		this.value = value == null || value.toString().isEmpty() ? dataTag
				.getDefaultValue() : value;
	}

	public DataTag(DataTagType dataTag) {
		this(dataTag, dataTag.getDefaultValue());
	}

	public DataTagType getDataTagType() {
		return this.dataTag;
	}

	public Object getValue() {
		return this.value;
	}

	@Override
	public String serialize() {
		return String.format(
				"%s:%s",
				this.dataTag.getTagName(),
				(this.value instanceof Serializable ? ((Serializable) this.value)
						.serialize() : this.value.toString()));
	}

}
