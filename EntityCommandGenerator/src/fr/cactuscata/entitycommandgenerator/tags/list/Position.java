package fr.cactuscata.entitycommandgenerator.tags.list;

import fr.cactuscata.entitycommandgenerator.utils.Serializable;

/**
 * Specifies position coordinates (only needed when using “Riding”-tag)
 * 
 * @author CactusCata
 * @version 1.0.0
 * @since 1.0.0
 *
 */
public final class Position implements Serializable {

	private final float x, y, z;

	/**
	 * 
	 * @param x
	 *            coordinates
	 * @param y
	 *            coordinates
	 * @param z
	 *            coordinates
	 */
	public Position(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/**
	 * 
	 * @return x coordinates
	 */
	public final float getX() {
		return this.x;
	}

	/**
	 * 
	 * @return y coordinates
	 */
	public final float getY() {
		return this.y;
	}

	/**
	 * 
	 * @return z coordinates
	 */
	public final float getZ() {
		return this.z;
	}

	@Override
	public String serialize() {
		return String.format("[%f,%f,%f]", this.getX(), this.getY(), this.getZ());
	}

}
