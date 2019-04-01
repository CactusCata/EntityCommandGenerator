package fr.cactuscata.entitycommandgenerator.tags.list.villager;

import fr.cactuscata.entitycommandgenerator.inv.Item;
import fr.cactuscata.entitycommandgenerator.utils.Serializable;

public final class Recipe implements Serializable {

	private final int maxUses;
	private final Item buy, buy2, sell;

	public Recipe(int maxUses, Item buy, Item buy2, Item sell) {
		this.maxUses = maxUses;
		this.buy = buy;
		this.buy2 = buy2;
		this.sell = sell;
	}

	public int getMaxUses() {
		return this.maxUses;
	}

	public Item getBuy() {
		return this.buy;
	}

	public Item getBuy2() {
		return this.buy2;
	}

	public Item getSell() {
		return this.sell;
	}

	@Override
	public String serialize() {
		return String.format(
				"maxUses:%d,buy:%s,buyB:%s,sell:%s",
				this.getMaxUses(),
				this.getBuy().serialize(),
				this.getBuy2().serialize(),
				this.getSell().serialize());
	}

}
