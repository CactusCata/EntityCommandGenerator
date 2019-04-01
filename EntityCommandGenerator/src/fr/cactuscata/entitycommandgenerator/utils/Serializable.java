package fr.cactuscata.entitycommandgenerator.utils;

public interface Serializable {

	public String serialize();

	public static String serialize(Serializable... serializables) {
		StringBuilder builder = new StringBuilder();
		for (Serializable serializable : serializables) {
			builder.append(serializable.serialize());
			if (serializable != serializables[serializables.length - 1]) builder.append(',');
		}
		return builder.toString();
	}

	public static String serializeJoinedDataTags(Serializable... serializables) {

		StringBuilder builder = new StringBuilder();

		for (int i = 0, j = serializables.length; i < j; i++) {
			builder.append('{').append(serializables[i].serialize()).append('}');
			if (i + 1 != j) builder.append(',');
		}

		return builder.toString();

	}

}
