package fr.cactuscata.entitycommandgenerator.entity.list;

import fr.cactuscata.entitycommandgenerator.entity.livingentities.LivingEntity;

public class Player extends LivingEntity {

	public Player(float x, float y, float z) {
		super(EntityType.PLAYER, x, y, z);
	}

}
