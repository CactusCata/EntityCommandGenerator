package fr.cactuscata.entitycommandgenerator.entity.list;

import fr.cactuscata.entitycommandgenerator.entity.Entity;
import fr.cactuscata.entitycommandgenerator.entity.livingentities.DroppedItem;
import fr.cactuscata.entitycommandgenerator.entity.livingentities.ExperienceOrb;

public enum EntityType {

	// LIVING ENTITY

	// DROPS
	DROPPED_ITEM(1, 2, "item", new DroppedItem(0.0f, 0.0f, 0.0f)),
	EXPERIENCE_ORB(2, -1, "xp_orb", new ExperienceOrb(0.0f, 0.0f, 0.0f)),

	// IMMOBILE
	AREA_EFFECT_CLOUD(3, "area_effect_cloud", new AreaEffectCloud(0.0f, 0.0f, 0.0f)),
	LEAD_KNOT(),
	PAINTING(),
	ITEM_FRAME(),
	ARMOR_STAND(),
	EVOCATION_FANGS(),
	END_CRYSTAL(),

	// PROJECTILES
	THROWN_EGG(),
	SHOT_ARROW(),
	THROWN_SNOWBALL(),
	GHAST_FIREBALL(),
	BLASE_FIREBALL(),
	THROWN_ENDERPEARL(),
	THROWN_EYE_OF_ENDER(),
	THROWN_SPLASH_POTION(),
	THROWN_BOTTLE_OF_ENCHANTING(),
	WITHER_SKULL(),
	FIREWORK_ROCKET(),
	SHOT_SPECTRAL_ARROW(),
	SHULKER_BULLET(),
	DRAGON_FIREBALL(),
	LLAMA_SPIT(),

	// BLOCKS
	PRIMED_TNT(),
	FALLING_BLOCK(),

	// VEHICULES
	MINECART(),
	MINECART_WITH_CHEST(),
	MINECART_WITH_FURNACE(),
	MINECART_WITH_TNT(),
	MINECART_WITH_HOPPER(),
	MINECART_WITH_COMMAND_BLOCK(),
	MINECART_WITH_SPAWNER(),
	BOAT(),

	// HOSTILE MOBS
	ELDER_GUARDIAN(),
	WITHER_SKELETON(),
	STRAY(),
	HUSK(),
	ZOMBIE_VILLAGER(),
	EVOKER(),
	VEX(),
	VINDICATOR(),
	ILLUSIONER(),
	CREEPER(),
	SKELETON(),
	SPIDER(),
	GIANT(),
	ZOMBIE(),
	SLIME(),
	GHAST(),
	ZOMBIE_PIGMAN(),
	ENDERMAN(),
	CAVE_SPIDER(),
	SILVERFISH(),
	BLAZE(),
	MAGMA_CUBE(),
	ENDER_DRAGON(),
	WITHER(),
	WITCH(),
	ENDERMITE(),
	SHULKER(),

	// PASSIVE MOBS
	SKELETON_HORSE(),
	ZOMBIE_HORSE(),
	DONKEY(),
	MULE(),
	BAT(),
	PIG(),
	SHEEP(),
	COW(),
	CHICKEN(),
	SQUID(),
	WOLF(),
	MOOSHROOM(),
	SNOW_GOLEM(),
	OCELOT(),
	IRON_GOLEM(),
	HORSE(),
	RABBIT(),
	POLAR_BEAR(),
	LLAMA(),
	PARROT(),
	VILLAGER(),

	// OTHER
	PLAYER(),
	LIGHTNING_BOLT(),
	FISHING_ROD_HOOK();

	private final int internalIDDecimal, networkIDDecimal;
	private final String internalIDHexadecimal, networkIDHexadecimal;

	private final String savegameID;
	private final Entity defaultEntity;

	private EntityType(int internalIDDecimal,
			int networkIDDecimal,
			String savegameID,
			Entity defaultEntity) {
		this.internalIDDecimal = internalIDDecimal;
		this.internalIDHexadecimal = Integer.toHexString(this.internalIDDecimal);
		this.networkIDDecimal = internalIDDecimal;
		this.networkIDHexadecimal = Integer.toHexString(this.networkIDDecimal);
		this.savegameID = String.format("minecraft:%s", savegameID);
		this.defaultEntity = defaultEntity;
	}

	private EntityType(int internalIDDecimal, String savegameID, Entity defaultEntity) {
		this(internalIDDecimal, internalIDDecimal, savegameID, defaultEntity);
	}

	public int getInternalIDDecimal() {
		return this.internalIDDecimal;
	}

	public int getNetworkIDDecimal() {
		return this.networkIDDecimal;
	}

	public String getInternalIDHexadecimal() {
		return this.internalIDHexadecimal;
	}

	public String getNetworkIDHexadecimal() {
		return this.networkIDHexadecimal;
	}

	public String getSavegameID() {
		return this.savegameID;
	}

	public Entity getDefaultEntity() {
		return this.defaultEntity;
	}

}
