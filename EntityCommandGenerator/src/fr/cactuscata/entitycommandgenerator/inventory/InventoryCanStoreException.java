package fr.cactuscata.entitycommandgenerator.inventory;

import fr.cactuscata.entitycommandgenerator.inv.Item;

public class InventoryCanStoreException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InventoryCanStoreException(Item item) {
		super("The inventory can't store the item " + item.toString() + " (amount is too hard)");
	}

}
