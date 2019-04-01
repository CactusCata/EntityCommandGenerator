package fr.cactuscata.entitycommandgenerator.entity.livingentities;

import fr.cactuscata.entitycommandgenerator.entity.Entity;
import fr.cactuscata.entitycommandgenerator.entity.list.EntityType;
import fr.cactuscata.entitycommandgenerator.tags.DataTagType;

public class LivingEntity extends Entity {

	public LivingEntity(EntityType entityType,
			float x,
			float y,
			float z,
			DataTagType... addedDatatags) {
		super(entityType, x, y, z, addedDatatags);
	}

}
