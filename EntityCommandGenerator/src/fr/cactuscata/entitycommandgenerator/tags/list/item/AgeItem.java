package fr.cactuscata.entitycommandgenerator.tags.list.item;

import fr.cactuscata.entitycommandgenerator.tags.list.IntTag;

public class AgeItem extends IntTag {

	public AgeItem(int ticks) {
		super(ticks, -32768, 60000);
	}
	
}
