package fr.cactuscata.entitycommandgenerator.tags.mobs.attributes;

public enum AttributeType {

	// ALL LIVING ENTITIES
	MAX_HEALTH("generic.maxHealth",
			20.0f,
			0.0f,
			1024.0f,
			"The maximum health of this mob (in half-hearts); determines the highest health they may be healed to",
			"La santé maximale du mob (en demi-coeurs); détermine la santé maximal à laquelle ils peuvent être guéris"),
	FOLLOW_RANGE("generic.followRange",
			32.0f,
			0.0f,
			2048.0f,
			"The range in blocks within which a mob with this attribute will target players or other mobs to track. Exiting this range will cause the mob to cease following the player/mob. Actual value used by most mobs is 16; for zombies it is 40.",
			"La porté en blocs par laquelle un mob pourra vous traquer. La valeur actuelle de tous les mobs est de 16, les zombies sont à 40"),
	KOCKBACK_RESISTANCE("generic.knockbackResistance",
			0.0f,
			0.0f,
			1.0f,
			"The chance to resist knockback from attacks, explosions, and projectiles. 1.0 is 100% chance for resistance.",
			"Le pourcentage de chance d'annuler l'effet de recul depuis une attaque, une explosion ou encore un projectile, 1.0f est égal à 100% de résistance."),
	MOUVEMENT_SPEED("generic.movementSpeed",
			0.699999988079071f,
			0.0f,
			1024.0f,
			"Speed of movement in some unknown metric. The mob's maximum speed in blocks/second is a bit over 43 times this value, but can be affected by various conditions, such as: being ridden (if a horse), sprinting, fleeing (if a passive mob), attacking (if an enderman or zombie pigman), being led by a leash, being under the effect of a Speed or Slowness potion, being a baby zombie, or being a witch and drinking a potion. Speed in blocks per second can be calculated with the following equation, where x is the movementSpeed attribute y = 43.178x-0.02141",
			"La vitesse de mouvement."),
	// -[ATTACK_DAMAGE] NO ON PASSIVE MOB AND GOLEM
	ATTACK_DAMAGE("generic.attackDamage",
			2.0f,
			0.0f,
			2048.0f,
			"Damage dealt by attacks, in half-hearts. This attribute is not found on passive mobs and golems.",
			"Les dégats infligés par une attaque en demi-coeur. Cet attribut n'est pas trouvable sur les mobs passifs ainsi que les golems"),
	ARMOR("generic.armor",
			0.0f,
			0.0f,
			30.0f,
			"Armor defense points.",
			"Points de défense d'armure."),
	ARMOR_TOUGNESS("generic.armorToughness",
			0.0f,
			0.0f,
			20.0f,
			"Armor Toughness.",
			"Pas de traduction française pour ça, fuck it"),

	// FOR PLAYERS
	ATTACK_SPEED("generic.attackSpeed",
			4.0f,
			0.0f,
			1024.0f,
			"Determines speed at which attack strength recharges. Value is the number of full-strength attacks per second.",
			"Détermine la vitesse à laquelle l'arme se recharge. la valeur est le nombre de coups placables par seconde."),
	LUCK("generic.luck",
			0.0f,
			-1024.0f,
			1024.0f,
			"Affects the results of loot tables using the quality or bonus_rolls tag (e.g. when opening chests or chest minecarts, fishing, and killing mobs).",
			"Affecte le résultat des tables de loot au niveau de la qualité des coffres, pêche, minecarts et les mobs tués."),

	// FOR HORSES
	JUMP_STRENGTH("horse.jumpStrength",
			0.69999999999999996f,
			0.0f,
			2.0f,
			"Horse jump strength in some unknown metric.",
			"Pas de traduction française pour ça, fuck it"),

	// FOR PARROTS
	FLYING_SPEED("generic.flyingSpeed",
			0.4000000059604645f,
			0.0f,
			1024.0f,
			"Flight speed modifier in some unknown metric.",
			"Pas de traduction française pour ça, fuck it"),

	// FOR ZOMBIE
	SPAWN_REINFORCEMENTS("zombie.spawnReinforcements",
			0.0f,
			0.0f,
			1.0f,
			"Chance that a zombie will spawn another zombie when attacked.",
			"Pourcentage qu'un autre zombie apparaisse quand le zombie attaque.");

	private final String attributeName;
	private final float defaultValue, min, max;
	private final String engHelpMessage, frHelpMessage;

	private AttributeType(String attributeName,
			float defaultValue,
			float min,
			float max,
			String engHelpMessage,
			String frHelpMessage) {
		this.attributeName = attributeName;
		this.defaultValue = defaultValue;
		this.min = min;
		this.max = max;
		this.engHelpMessage = engHelpMessage;
		this.frHelpMessage = frHelpMessage;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public float getDefaultValue() {
		return defaultValue;
	}

	public float getMin() {
		return min;
	}

	public float getMax() {
		return max;
	}

	public String getEngHelpMessage() {
		return engHelpMessage;
	}

	public String getFrHelpMessage() {
		return frHelpMessage;
	}

}
