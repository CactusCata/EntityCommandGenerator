package fr.cactuscata.entitycommandgenerator.inv;

import fr.cactuscata.entitycommandgenerator.utils.IntervalsNumbers;
import fr.cactuscata.entitycommandgenerator.utils.Serializable;

public class Item implements Serializable {

	private final Material material;
	private int amount, damage;

	public Item(Material material, int amount, int damage) {
		new IntervalsNumbers(amount, 0, Integer.MAX_VALUE).check(damage, 0, Integer.MAX_VALUE);
		this.material = material;
		this.amount = amount;
		this.damage = damage;
	}

	public Item(Material material, int amount) {
		this(material, amount, 0);
	}

	public int getDamage() {
		return damage;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public void addAmount(int amount) {
		this.setAmount(this.getAmount() + amount);
	}

	public void removeAmount(int amount) {
		this.addAmount(-amount);
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public Material getMaterial() {
		return material;
	}

	@Override
	public String serialize() {
		return "TODO ITEM SERIALIZER";
	}

	@Override
	public final boolean equals(Object object) {
		if (!(object instanceof Item)) return false;
		Item item = (Item) object;
		return item.getMaterial() == this.getMaterial() && item.getAmount() == this
				.getAmount() && item.getDamage() == this.getDamage();
	}

	@Override
	public final String toString() {
		return String.format(
				"[material:%s,amount:%s,damage:%s]",
				this.getMaterial().getName(),
				this.getAmount(),
				this.getDamage());
	}

}
