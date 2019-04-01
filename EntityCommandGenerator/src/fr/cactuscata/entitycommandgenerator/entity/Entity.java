package fr.cactuscata.entitycommandgenerator.entity;

import fr.cactuscata.entitycommandgenerator.entity.list.EntityType;
import fr.cactuscata.entitycommandgenerator.tags.DataTag;
import fr.cactuscata.entitycommandgenerator.tags.DataTagType;
import fr.cactuscata.entitycommandgenerator.tags.DataTagsMap;
import fr.cactuscata.entitycommandgenerator.utils.Serializable;

public class Entity implements Serializable {

	private final EntityType entityType;
	private final float x, y, z;
	private final DataTagsMap dataTags = new DataTagsMap();

	public Entity(EntityType entityType, float x, float y, float z, DataTagType... allDataTags) {
		this.entityType = entityType;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public void addDataTags(DataTagType[] tags, Object[] values) {
		if (tags.length != values.length) { throw new IllegalArgumentException(
				"Size of tags array if different compared to values array"); }

		for (int i = 0; i < tags.length; i++) {
			this.addDataTag(tags[i], values[i]);
		}
	}

	public void addDataTags(DataTag... dataTags) {
		for (DataTag dataTag : dataTags) {
			this.addDataTag(dataTag.getDataTagType(), dataTag.getValue());
		}
	}

	public void addDataTag(DataTagType tag, Object value) {
		this.getDataTags().put(tag, value);
	}

	public DataTagsMap getDataTags() {
		return this.dataTags;
	}

	public EntityType getEntityType() {
		return entityType;
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public float getZ() {
		return z;
	}

	@Override
	public String serialize() {
		return null;
	}

}
