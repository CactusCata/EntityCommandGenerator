package fr.cactuscata.entitycommandgenerator.tags.list.item;

import fr.cactuscata.entitycommandgenerator.tags.list.IntTag;

public class PickupDelayItem extends IntTag {

	public PickupDelayItem(int ticks) {
		super(ticks, 0, 32767);
	}

}
