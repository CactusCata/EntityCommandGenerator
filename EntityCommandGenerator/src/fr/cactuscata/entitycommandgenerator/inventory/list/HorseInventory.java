package fr.cactuscata.entitycommandgenerator.inventory.list;

import fr.cactuscata.entitycommandgenerator.inv.Item;
import fr.cactuscata.entitycommandgenerator.inventory.Inventory;

public class HorseInventory extends Inventory {

	public HorseInventory(Item... items) {
		super(9 * 3, items);
		// TODO faire des inventaires avec des slots interdits
	}

}
