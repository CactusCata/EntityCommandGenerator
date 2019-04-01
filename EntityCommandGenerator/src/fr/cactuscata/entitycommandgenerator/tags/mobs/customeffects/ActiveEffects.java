package fr.cactuscata.entitycommandgenerator.tags.mobs.customeffects;

import fr.cactuscata.entitycommandgenerator.utils.Serializable;

public final class ActiveEffects implements Serializable {

	private final int potionID, durationTicks, amplifier;
	private final boolean ambiant, showParticles;

	public ActiveEffects(int potionID,
			int durationTicks,
			int amplifier,
			boolean ambiant,
			boolean showParticles) {
		this.potionID = potionID;
		this.durationTicks = durationTicks;
		this.amplifier = amplifier;
		this.ambiant = ambiant;
		this.showParticles = showParticles;
	}

	public int getPotionID() {
		return this.potionID;
	}

	public int getDurationTicks() {
		return this.durationTicks;
	}

	public int getAmplifier() {
		return this.amplifier;
	}

	public boolean isAmbiant() {
		return this.ambiant;
	}

	public boolean isShowParticles() {
		return this.showParticles;
	}

	@Override
	public String serialize() {
		return String.format(
				"Id:%d,Duration:%d,Amplifier:%d,Ambiant:%b,ShowParticles:%b",
				this.getPotionID(),
				this.getDurationTicks(),
				this.getAmplifier(),
				this.isAmbiant(),
				this.isShowParticles());
	}

}
