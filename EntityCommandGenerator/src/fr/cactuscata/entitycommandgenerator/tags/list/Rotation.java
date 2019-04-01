package fr.cactuscata.entitycommandgenerator.tags.list;

import fr.cactuscata.entitycommandgenerator.utils.IntervalsNumbers;
import fr.cactuscata.entitycommandgenerator.utils.Serializable;

/**
 * “yaw” specifies the rotation around the y-axis (from 0 to 360) and “pitch”
 * the up/down-direction (90=straight down, 0=horizontal, -90=straight up).
 * 
 * @author CactusCata
 * @version 1.0.0
 * @since 1.0.0
 *
 */
public final class Rotation implements Serializable {

	private final float yaw, pitch;

	/**
	 * 
	 * @param yaw
	 *            the rotation around the y-axis (from 0 to 360)
	 * @param pitch
	 *            up/down-direction (90=straight down, 0=horizontal,
	 *            -90=straight up)
	 */
	public Rotation(float yaw, float pitch) {
		new IntervalsNumbers(yaw, 0, 360).check(pitch, -90, 90);
		this.yaw = yaw;
		this.pitch = pitch;
	}

	/**
	 * 
	 * @return the rotation around the y-axis (from 0 to 360)
	 */
	public final float getYaw() {
		return this.yaw;
	}

	/**
	 * 
	 * @return the up/down-direction (90=straight down, 0=horizontal,
	 *         -90=straight up)
	 */
	public final float getPitch() {
		return this.pitch;
	}

	@Override
	public String serialize() {
		return String.format("[%f,%f]", this.getYaw(), this.getPitch());
	}
}