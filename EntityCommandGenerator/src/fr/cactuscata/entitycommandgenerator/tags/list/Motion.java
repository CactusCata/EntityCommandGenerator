package fr.cactuscata.entitycommandgenerator.tags.list;

import fr.cactuscata.entitycommandgenerator.utils.Serializable;

/**
 * Specifies the speed in blocks per second in x/y/z-direction (with at least
 * one decimal place!)
 * 
 * @author CactusCata
 * @version 1.0.0
 * @since 1.0.0
 *
 */
public final class Motion implements Serializable {

	private final float x, y, z;

	/**
	 * 
	 * @param x
	 *            m/s
	 * @param y
	 *            m/s
	 * @param z
	 *            m/s
	 */
	public Motion(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/**
	 * 
	 * @return x m/s
	 */
	public final float getX() {
		return this.x;
	}

	/**
	 * 
	 * @return y m/s
	 */
	public final float getY() {
		return this.y;
	}

	/**
	 * 
	 * @return z m/s
	 */
	public final float getZ() {
		return this.z;
	}

	@Override
	public String serialize() {
		return String.format("[%f,%f,%f]", this.getX(), this.getY(), this.getZ());
	}
}
