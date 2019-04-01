package fr.cactuscata.entitycommandgenerator.entity.livingentities;

import fr.cactuscata.entitycommandgenerator.entity.list.EntityType;
import fr.cactuscata.entitycommandgenerator.tags.DataTagType;

public class ExperienceOrb extends LivingEntity {

	public ExperienceOrb(float x, float y, float z) {
		super(EntityType.DROPPED_ITEM, x, y, z, DataTagType.HEALTH, DataTagType.VALUE);
	}

}
