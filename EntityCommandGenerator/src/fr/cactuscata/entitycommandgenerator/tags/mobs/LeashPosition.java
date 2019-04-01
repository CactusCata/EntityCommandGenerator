package fr.cactuscata.entitycommandgenerator.tags.mobs;

import fr.cactuscata.entitycommandgenerator.utils.Serializable;
import fr.cactuscata.smartapplication.helper.StringUtils;

public class LeashPosition implements Serializable {

	private final float x, y, z;

	public LeashPosition(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
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

	@Override
	public String serialize() {
		return StringUtils.join(new Object[]{x, y, z}, ",");
	}

}
