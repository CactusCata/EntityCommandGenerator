package fr.cactuscata.entitycommandgenerator.tags.list.fireball;

import fr.cactuscata.entitycommandgenerator.utils.Serializable;

public class Direction implements Serializable {

	private final float x, y, z;

	public Direction(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public String serialize() {
		return String.format("[%f,%f,%f]", this.getX(), this.getY(), this.getZ());
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public float getZ() {
		return z;
	}

}
