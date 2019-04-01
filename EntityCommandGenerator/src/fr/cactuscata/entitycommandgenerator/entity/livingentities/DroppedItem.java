package fr.cactuscata.entitycommandgenerator.entity.livingentities;

import java.util.Arrays;

import fr.cactuscata.entitycommandgenerator.entity.list.EntityType;
import fr.cactuscata.entitycommandgenerator.tags.DataTagType;

public class DroppedItem extends LivingEntity {

	public DroppedItem(float x, float y, float z) {
		super(
				EntityType.DROPPED_ITEM,
				x,
				y,
				z,
				DataTagType.AGE,
				DataTagType.HEALTH,
				DataTagType.AGE,
				DataTagType.PICKUP_DELAY,
				DataTagType.OWNER,
				DataTagType.THROWER,
				DataTagType.ITEM);
	}

}
