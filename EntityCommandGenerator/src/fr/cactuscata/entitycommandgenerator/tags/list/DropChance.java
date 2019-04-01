package fr.cactuscata.entitycommandgenerator.tags.list;

import fr.cactuscata.entitycommandgenerator.utils.IntervalsNumbers;
import fr.cactuscata.entitycommandgenerator.utils.Serializable;

public class DropChance implements Serializable {

	private final float firstItemDropChance, secondItemDropChance, theirthItemDropChance,
			foorthItemDropChance, fivethItemDropChance;

	public DropChance(float firstItemDropChance,
			float secondItemDropChance,
			float theirthItemDropChance,
			float foorthItemDropChance,
			float fivethItemDropChance) {
		new IntervalsNumbers(firstItemDropChance, 0, 100)
				.check(secondItemDropChance)
				.check(theirthItemDropChance)
				.check(foorthItemDropChance)
				.check(fivethItemDropChance);
		this.firstItemDropChance = firstItemDropChance;
		this.secondItemDropChance = secondItemDropChance;
		this.theirthItemDropChance = theirthItemDropChance;
		this.foorthItemDropChance = foorthItemDropChance;
		this.fivethItemDropChance = fivethItemDropChance;
	}

	@Override
	public String serialize() {
		return String.format(
				"[%ff,%ff,%ff,%ff,%ff]",
				this.getFirstItemDropChance(),
				this.getSecondItemDropChance(),
				this.getTheirthItemDropChance(),
				this.getFoorthItemDropChance(),
				this.getFivethItemDropChance());
	}

	public float getFirstItemDropChance() {
		return firstItemDropChance;
	}

	public float getSecondItemDropChance() {
		return secondItemDropChance;
	}

	public float getTheirthItemDropChance() {
		return theirthItemDropChance;
	}

	public float getFoorthItemDropChance() {
		return foorthItemDropChance;
	}

	public float getFivethItemDropChance() {
		return fivethItemDropChance;
	}

}
