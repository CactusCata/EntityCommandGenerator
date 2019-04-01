package fr.cactuscata.entitycommandgenerator.tags.list.potion;

import fr.cactuscata.entitycommandgenerator.utils.Serializable;

public class PotionTag implements Serializable {

	private final int id, damage;
	
	public PotionTag(int id, int damage) {
		this.id = id;
		this.damage = damage;
	}
	
	@Override
	public String serialize() {
		return "AU SECONOURRRR";
	}

	public int getId() {
		return id;
	}

	public int getDamage() {
		return damage;
	}

}
