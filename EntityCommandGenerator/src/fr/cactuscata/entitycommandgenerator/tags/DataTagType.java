package fr.cactuscata.entitycommandgenerator.tags;

import java.util.UUID;

import fr.cactuscata.entitycommandgenerator.entity.Entity;
import fr.cactuscata.entitycommandgenerator.entity.list.EntityType;
import fr.cactuscata.entitycommandgenerator.inv.Item;
import fr.cactuscata.entitycommandgenerator.inv.Material;
import fr.cactuscata.entitycommandgenerator.inventory.list.HorseInventory;
import fr.cactuscata.entitycommandgenerator.tags.list.DropChance;
import fr.cactuscata.entitycommandgenerator.tags.list.Motion;
import fr.cactuscata.entitycommandgenerator.tags.list.Position;
import fr.cactuscata.entitycommandgenerator.tags.list.Rotation;
import fr.cactuscata.entitycommandgenerator.tags.list.arrow.Pickup;
import fr.cactuscata.entitycommandgenerator.tags.list.fireball.Direction;
import fr.cactuscata.entitycommandgenerator.tags.list.horse.Temper;
import fr.cactuscata.entitycommandgenerator.tags.list.horse.Type;
import fr.cactuscata.entitycommandgenerator.tags.list.horse.Variant;
import fr.cactuscata.entitycommandgenerator.tags.list.item.AgeItem;
import fr.cactuscata.entitycommandgenerator.tags.list.item.HealthItem;
import fr.cactuscata.entitycommandgenerator.tags.list.item.PickupDelayItem;
import fr.cactuscata.entitycommandgenerator.tags.list.ozelot.CatType;
import fr.cactuscata.entitycommandgenerator.tags.list.players.Dimension;
import fr.cactuscata.entitycommandgenerator.tags.list.players.FoodLevel;
import fr.cactuscata.entitycommandgenerator.tags.list.players.PlayerGameType;
import fr.cactuscata.entitycommandgenerator.tags.list.players.SelectedItemSlot;
import fr.cactuscata.entitycommandgenerator.tags.list.potion.PotionTag;
import fr.cactuscata.entitycommandgenerator.tags.list.sheep.Color;
import fr.cactuscata.entitycommandgenerator.tags.list.skeleton.SkeletonType;
import fr.cactuscata.entitycommandgenerator.tags.list.villager.Career;
import fr.cactuscata.entitycommandgenerator.tags.list.villager.Offers;
import fr.cactuscata.entitycommandgenerator.tags.list.villager.Profession;
import fr.cactuscata.entitycommandgenerator.tags.list.villager.Recipe;
import fr.cactuscata.entitycommandgenerator.tags.mobs.Attribute;
import fr.cactuscata.entitycommandgenerator.tags.mobs.LeashPosition;
import fr.cactuscata.entitycommandgenerator.tags.mobs.attributes.AttributeType;
import fr.cactuscata.entitycommandgenerator.tags.mobs.customeffects.ActiveEffects;
import fr.cactuscata.entitycommandgenerator.utils.Serializable;

public enum DataTagType {

	// ALL ENTITIES
	ID(0,
			"id:(EntityID)",
			"Specifies the entity (only needed when using \"Riding:\"-tag)",
			"L'id de l'entité (seulement utile quand le tag \"Riding\" est utilisé)"),
	POS(new Position(0.0f, 0.0f, 0.0f),
			"Pos:[(x-Coord),(y-Coord),(z-Coord)]",
			"Specifies position coordinates (only needed when using “Riding”-tag)",
			"La position de l'entité (seulement utile quand le tag \"Riding\" est utilisé)"),
	MOTION(new Motion(0.0f, 0.0f, 0.0f),
			"Motion:[(x-m/s),(y-m/s),(z-m/s)]",
			"Specifies the speed in blocks per second in x/y/z-direction (with at least one decimal place!)",
			"La vitesse en blocs par seconde en x/y/z-direction"),
	ROTATION(new Rotation(0.0f, 0.0f),
			"Rotation:[(yaw),(pitch)]",
			"“yaw” specifies the rotation around the y-axis (from 0 to 360) and “pitch” the up/down-direction (90=straight down, 0=horizontal, -90=straight up)",
			"\"yaw\", la rotation autour de l'axe des y (de 0 à 360) et \"pitch\" le haut-bas de la direction"),
	FALL_DISTANCE(0,
			"FallDistance:(blocks)",
			"Specifies current fall distance",
			"La distance en blocs de chute"),
	FIRE(0,
			"Fire:(ticks)",
			"Specifies number of ticks until entity is no longer on fire",
			"Le nombre de ticks jusqu'à que l'entité ne soit plus en feu"),
	AIR(0,
			"Air:(ticks)",
			"Specifies number of ticks the entity has air left for",
			"Spécifie le nombre de ticks pendant lesquels l'entité était en l'air"),
	INVULNERABLE(false,
			"Invulnerable:(1/0)",
			"If true, then the entity is invulnerable, if false, then not",
			"Si \"true\", l'entité sera invulnérable"),
	PORTAL_COOLDOWN(0,
			"PortalCooldown:(ticks)",
			"Specifies number of ticks until the entity can go through a portal again",
			"Spécifie le nombre en ticks jusqu'à ce que l'entité puisse à nouveau traverser un portail"),
	RIDING(new Entity(EntityType.ZOMBIE, 0.0f, 0.0f, 0.0f),
			"Riding:(entity)",
			"Specifies all entity-infos for the entity, which is being ridden by the actual one",
			"Spécifie toutes les informations à propos de l'entité"),
	UUID_LEAST(UUID.randomUUID(),
			"UUIDLeast:(uuid)",
			"Specifies the right half of the UUID (can be any number)",
			"Spécifie la partie droite de l'UUID (peut être n'importe quel nombre)"),
	UUID_MOST(UUID.randomUUID(),
			"UUIDMost:(uuid)",
			"Specifies the left half of the UUID (can be any number), if you summon a mob with a certain UUIDLeast and UUIDMost, you can then find this specific mob again, by using the testfor-command and giving it the specified UUID",
			"Spécifie la partie gauche de l'uuid (peut être un nombre). Si vous invoquez une entité avec une certaine UUIDLeast et UUIDMost, vous pourrez retrouver l'entité avec la commande de testfor"),

	// PLAYERS
	DIMENSION(new Dimension(0),
			"Dimension:(-1/0/1)",
			"Specifies the dimension the player is in, -1 = Nether, 0 = Overworld, 1 = End",
			"Spécifie la dimension du joueur, -1 = Nether, 0 = Overworld, 1 = End"),
	PLAYER_GAME_TYPE(new PlayerGameType(1),
			"playerGameType:(0/1/2/3)",
			"Specifies the game mode of the player, 0 = Survival, 1 = Creative, 2 = Adventure, 3 = Spectator",
			"Spécifie le mode de jeu du joueur, 0 = Survie, 1 = Créatif, 2 = Aventure, 3 = Spectateur"),
	SELECTED_ITEM_SLOT(new SelectedItemSlot(0),
			"SelectedItemSlot:(slot)b",
			"Specifies the selected slot in the hotbar of the player",
			"Spécifie l'emplacement sélectionné dans la hotbar du joueur"),
	SPAWN_X(0,
			"SpawnX:(coord)",
			"Specifies the x-coordinate of the players’ bed",
			"Spécifie la coordonnée x du lit du joueur"),
	SPAWN_Y(0,
			"SpawnY:(coord)",
			"Specifies the y-coordinate of the players’ bed",
			"Spécifie la coordonnée y du lit du joueur"),
	SPAWN_Z(0,
			"SpawnZ:(coord)",
			"Specifies the z-coordinate of the players’ bed",
			"Spécifie la coordonnée z du lit du joueur"),
	SPAWNED_FORCE(false,
			"SpawnForced:(0/1)",
			"If true, then the player will be spawned at the Spawn X/Y/Z-coordinates, even if no bed can be found, if false, then not",
			"Si true, alors le joueur sera engendré aux coordonnées X / Y / Z, même si aucun lit ne peut être trouvé, si false, alors non"),
	SLEEPING(0/* b */,
			"Sleeping:(0b/1b)",
			"If 1b, then the player is currently sleeping, if 0b, then not",
			"Si 1b, alors le joueur dort actuellement, si 0b, alors non"),
	FOOD_LEVEL(new FoodLevel(20),
			"foodLevel:(number)",
			"Specifies the level of the players’ hunger bar (from 0 to 20)",
			" Spécifie le niveau de la barre de faim du joueur (de 0 à 20)"),
	XP_LEVEL(0,
			"XpLevel:(number)",
			"Specifies the players’ XP-level (the number above the bar)",
			"Spécifie le niveau XP des joueurs (le nombre au dessus de la barre)"),
	INVENTORY(new Item[]{new Item(Material.AIR, 1)},
			"Inventory:[{item-tags},{…},{…}]",
			"Specifies the items in the inventory of the player (you can leave away the slot-tag in the item-tags to search the entire inventory for the item)",
			"Spécifie les éléments dans l'inventaire du joueur (vous pouvez laisser le nombre du slot dans les tags d'article pour rechercher l'intégralité de l'inventaire)"),
	ENDER_ITEM(new Item[]{new Item(Material.AIR, 1)},
			"EnderItems:[{item-tags},{…},{…}]",
			"Specifies the items in the ender chest of the player",
			"Spécifie les éléments dans le coffre ender du joueur"),

	// ALL MOBS
	HEALF(20,
			"HealF:(number)",
			"Specifies number of half hearts that the entity has (no decimal places)(does not exceed the actual maximum health of the mob)",
			"Spécifie le nombre de demi-cœurs que possède l'entité (pas de décimales) (ne dépasse pas la santé maximal du mob"),
	ABSORBTION_AMOUNT(0,
			"AbsorptionAmount:(number)",
			"Specifies number of golden extra-hearts that the entity has",
			"Spécifie le nombre de coeurs supplémentaires dorés que l'entité a"),
	ATTRIBUTES(new Attribute[]{new Attribute(AttributeType.MAX_HEALTH, 20.0f)},
			"Attributes:[{Name:(attribute-name),Base:(number)},{…},{…}]",
			"Specifies the mob’s attributes, given are the name of the attribute and the strength (base), here you’ll have to use decimal places sometimes, see following link for min/max values of the Base (Attribute-names: http://minecraft.gam...a.com/Attribute)"),
	ACTIVE_EFFECTS(new ActiveEffects[]{new ActiveEffects(0, 0, 0, false, false)},
			"ActiveEffects:[{Id:(potion-id),Duration:(ticks),Amplifier:(number),Ambient:(1/0),ShowParticles:(1b/0b)},{…,{…}}]",
			"Specifies the mob’s active potion effects, “Id” (with capitalised “I”!) gives the effect, “Duration” the duration in ticks, “Amplifier” the strength (up to 255), “Ambient” gives, if the particles should be visible or not and “ShowParticles” gives, if the particles should be visible at all, or not (Potion-effect-IDs: http://minecraft.gam...m/Potion_effect)"),
	EQUIPMENT(
			new Item[]{new Item(Material.AIR, 1), new Item(Material.AIR, 1), new Item(
					Material.AIR,
					1), new Item(Material.AIR, 1), new Item(Material.AIR, 1)},
			"Equipment:[{hand-item},{feet-item},{leg-item},{chest-item},{head-item}]",
			"Specifies the equipment the mob wears in the order hand, feet, legs, chest, head (Item tags below, the “count”-tag must exist!), brackets may be left empty to (for instance) skip the feet"),
	DROP_CHANCES(new DropChance(0.0f, 0.0f, 0.0f, 0.0f, 0.0f),
			"DropChances:[(number)f,(number)f,(number)f,(number)f,(number)f]",
			"Specifies the chances for the equipment to drop. 0.0 is 0%, 1.0 is 100%, 2.0 is 100% with no item damage, the order is the same as with “Equipment”, the “f” needs to be put behind every number"),
	CAN_PICKUP_LOOT(false,
			"CanPickUpLoot:(1/0)",
			"If true, the mob can pick up items, if false, then not",
			"Si true, le mob peut prendre les objets par terre, sinon, non."),
	PERSISTANCE_REQUIRED(false,
			"PersistenceRequired:(1/0)",
			"If true, the mob can't despawn, if false, then not.",
			"Si true, le mob ne pourra pas disparaître, sinon il pourra"),
	CUSTOM_NAME(" ",
			"CustomName:”name”",
			"Specifies the name of the mob",
			"Spécifie le nom du mob"),
	CUSTOM_NAME_VISIBLE(false,
			"CustomNameVisible:(1/0)",
			"If true, then the custom name is visible, if true, then not",
			"Si true, le nom peronnalisé du mob sera visible, sinon non."),
	LEASHED(false,
			"Leashed:(1/0)",
			"If true, then the mob is leashed, if true, then not",
			"Si true, le mob sera attaché, sinon non."),
	LEASH(new LeashPosition(0.0f, 0.0f, 0.0f),
			"Leash:{X:(x-coord),Y:(y-coord),Z:(z-coord)}",
			"Specifies the location of the fence the mob is leashed to, note to add a “.5” behind the x/z-coords (x=53 -> x=53.5)"),

	// BREADABLE MOBS
	IN_LOVE(0,
			"InLove:(ticks)",
			"Specifies the number of ticks the mob will search for a mate and have the “heart-effect”",
			"Spécifie le nombre de ticks pendant lequel le mob cherche un partenaire sexuel et a l'effet \"heart-effect\""),
	AGE(0,
			"Age:(ticks)",
			"Specifies the number of ticks until the mob is adult, negative numbers=baby, from 0=adult",
			"Spécifie le nombre de ticks avant que le mob soit adulte, nombre négatif=bébé, après 0=adulte"),

	// TAMEABLE MOBS (except horses)(“Wolf” and “Ozelot”):
	OWNER("playerNameOwner",
			"Owner:(name)",
			"Specifies the name of the player this animal is owned by, if not existing, the animal is wild",
			"Spécifie le nom du possesseur, si le tag n'existe pas, l'animal est sauvage"),
	SITTING(false,
			"Sitting:(false/true)",
			"If true, then the animal is sitting, if false, then not",
			"Si true, l'animal est assit, sinon il ne l'est pas"),

	// CREEPER
	POWERED(false,
			"powered:(false/true)",
			"If true, then the creeper is powered (lightning), if false, then not",
			"Si true, le creeper est chargé (éclair), sinon il ne l'est pas"),
	EXPLOSION_RADUIS(3,
			"ExplosionRadius:(number)",
			"Specifies the explosion radius",
			"Spécifie le rayon de l'explosion"),
	FUSE(40,
			"Fuse:(ticks)",
			"Specifies the number of ticks until the creeper explodes",
			"Spécifie le nombre de ticks avant que le creeper explose"),
	IGNITED(false,
			"ignited:(false/true)",
			"If true, then the creeper is ignited, if false, then not",
			"Si true, le creeper est allumé, sinon il ne l'est pas"),

	// ENDERMAN
	CARRIED(0,
			"carried:(item-id)",
			"Specifies the item-id of the block the enderman is carrying",
			"Spécifie l'id du bloc que l'endermen tient en main"),
	CARRIED_DATA(0,
			"carriedData:(item-damage)",
			"Specifies the damage-value of the block the enderman is carrying",
			"Spécifie la damage-vaue du bloc que l'endermen tient en main"),

	// ENDERMITE
	LIFE_TIME(0,
			"Lifetime:(ticks)",
			"Specifies the number of ticks the Endermite has existed for, it despawns at 2400",
			"Spécifie le nombre de ticks depuis lequel l'endermite existe, elle disparait à 2400"),

	// HORSE
	CHESTED_HORSE(false,
			"ChestedHorse:(false/true)",
			"If true, then the animal is carrying a chest, if false, then not",
			"Si true, l'animal porte un coffre, sinon il n'en porte pas"),
	EATING_HAYSTACK(false,
			"EatingHaystack:(false/true)",
			"If true, then the horse is currently eating (head down), if false, then not",
			"Si true, le cheval est en train de manger (tête vers le bas), sinon non"),
	TAME(false,
			"Tame:(false/true)",
			"If true, then the horse is tamed, if false, then not",
			"Si true, alors le cheval sera apprivoisé, sinon non"),
	TEMPER(new Temper(50),
			"Temper:(number)",
			"Specifies the temper of the horse (from 0 to 100), the higher, the easier to tame is the horse",
			"Spécifie le tempérament du cheval (de 0 à 100), plus la valeur est haute, plus le cheval est facile à apprivoiser"),
	TYPE(new Type(0),
			"Type:(0/1/2/3/4)",
			"Specifies the type of the horse, 0=normal, 1=donkey, 2=mule, 3=zombie, 4=skeleton",
			"Spécifie le type du cheval, 0=normal, 1=donkey, 2=mule, 3=zombie, 4=skeleton"),
	VARIANT(new Variant(0),
			"Variant:(number)",
			"Specifies the variant of the horse, each kind has its own number",
			"Spécifie la variant du cheval"),
	ITEMS(new HorseInventory(),
			"Items:[{item-tags},{…},{…}]",
			"Specifies the items the donkey/mule is carrying, you have to provide the item-id and a slot (slot must be at least 2!)(item specification below!)",
			"Spécifie les objets que la mule/cheval porte (le slot doit être supérieur à 2))"),
	ARMOR_ITEM(new Item(Material.AIR, 1),
			"ArmorItem:{item-tags}",
			"Specifies the horse’s armour (only the IDs of iron, gold and diamond-horse armour are valid!)",
			"Spécifie l'armure du cheval (seulement les armures en fer/or/diamant ou de l'air)"),
	SADDLE(false,
			"Saddle:(1/0)",
			"If true, then the horse is wearing a saddle, if false, then not",
			"Si true, le cheval a une selle, sinon il n'en a pas"),

	// OZELOT
	CAT_TYPE(new CatType(0),
			"CatType:(0/1/2/3)",
			"Specifies the type, 0=wild,1=tuxedo, 2=tabby, 3=siamese",
			"Spécifie le type du chat, 0=sauvage, 1=tuxedo(à traduire), 2=tabby(à traduire), 3=siamese(à traduire)"),

	// GHAST
	EXPLOSION_POWER(2,
			"ExplosionPower:(number)",
			"Specifies the strength of the explosion",
			"Spécifie la force de l'explosion"),

	// SHEEP
	SHEARED(false,
			"Sheared:(false/true)",
			"If true, then the sheep is shorn, if false, then not",
			"Si true, le mouton sera razé, sinon il ne le sera pas"),
	COLOR(new Color(0),
			"Color:(0-15)",
			"Specifies the color of the sheep (0=white, 15=black, etc.)",
			"Spécifie la couleur du mouton (0=blanc, 15=noir, etc...)"),

	// SKELETON
	SKELETON_TYPE(new SkeletonType(0),
			"SkeletonType:(1/0)",
			"Specifies the skeleton type, 0=normal, 1=wither",
			"Spécifie le type du squelette (0=normal, 1=wither)"),

	// SLIME AND MAGMA CUBES
	SIZE(3,
			"Size:(number)",
			"Specifies the size of the slimes, starts at 0",
			"Spécifie la taille du slime, commence à 0"),

	// WITHER BOSS
	INVUL(0,
			"Invul:(ticks)",
			"Specifies the number of ticks until the invincibility shield of the wither wears off",
			"Spécifie le nombre de ticks avant que le bouclier d'invincibilité du wither disparaisse"),

	// WOLF
	ANGRY(false,
			"Angry:(1/0)",
			"If 1, then the wolf is angry (red eyes), if 0, then not",
			"Si true, le loup est enervé (yeux rouges), sinon il ne l'est pas"),
	COLLAR_COLOR(new Color(0),
			"CollarColor:(0-15)",
			"Specifies the color of the collar (numbers like with sheep)",
			"Spécifie la couleur du colier (nombres comme avec le mouton)"),

	// VILLAGER
	PROFESSION(new Profession(0),
			"Profession:(0/1/2/3/4/5)",
			"Specifies the look and profession of the villagers (Link to the IDs (scroll down to “Profession and careers”, third column in the table!) http://minecraft.gam...ons_and_Careers)"),
	CAREER(new Career(0),
			"Career:(0/1/2/3)",
			"Specifies the career of the villager (has influence on the trade options and the name in the trading window)(See IDs at the link under “Profession”, fifth column of the table)"),
	CAREER_LEVEL(1,
			"CareerLevel:(number)",
			"Specifies the career level of the villager, which influences the trade options, if higher that the career’s maximum, then no trades will be available"),
	WILLING(false,
			"Willing:(true/false)",
			"If true, then the villager is searching for a mate, if false, then not",
			"Si true, alors le villageois cherchera un partenaire sexuel, sinon non"),
	OFFERS(new Offers(
			new Recipe(
					0,
					new Item(Material.AIR, 1),
					new Item(Material.AIR, 1),
					new Item(Material.AIR, 1))),
			"Offers:{Recipes:[{maxUses:(number),buy:{item-tags},buyB:{item-tags},sell:{item-tags}},{…},{…}]}",
			"Specifies the trade options the villager has, “maxUses” gives the maximum number of trades until the option is closed, “buy” gives the first item to buy, “buyB” the optional second item to buy (can be left away) and “sell” gives the item being sold"),

	// VILLAGER_GOLEM
	PLAYER_CREATED(false,
			"PlayerCreated:(true/false)",
			"If true, then the golem was created by a player, if false, then not",
			"Si true, le golem a été crée par un joueur et il le défendra, sinon non"),

	// ZOMBIE
	IS_VILLAGER(false,
			"IsVillager:(true/false)",
			"If true, then the zombie is an infected villager, if false, then not",
			"Si true, le zombie sera un villageois infecté, sinon non"),
	IS_BABY(false,
			"IsBaby:(1/0)",
			"If 1, then the zombie is a baby, if 0, then not",
			"Si true, le zombie sera un bébé, sinon non"),
	CONVERSION_TIME(0,
			"ConversionTime:(ticks)",
			"Specifies the number of ticks until the villager zombie was cured to a villager",
			"Spécifie le nombre de ticks avant que le zombie devienne à nouveau un villageois"),
	CAN_BREAK_DOOR(false,
			"CanBreakDoors:(1/0)",
			"If 1, then the zombie can break in doors, if 0, then not",
			"If 1, lee zombie pourra briser des portes"),

	// PIG ZOMBIE
	ANGER(0,
			"Anger:(number)",
			"Specifies the aggressivity against the player, 0 when not aggressive",
			"Spécifie l'agressivité contre le joueur, 0 quand il n'est pas aggressif"),

	// ARROW
	PICKUP(new Pickup(0),
			"pickup:(0/1/2)",
			"Specifies if the arrow can be picked up, 0=cannot, 1=survival and creative, 2= only creative",
			"Spécifie si la flèche peut être récuperée, 0=elle ne peut pas, 1=en survie et en créatif, 2=seulement en créatif"),
	LIFE(0,
			"life:(ticks)",
			"Specifies the time in ticks since the arrow hasn’t moved anymore, when this value reaches 1200, the arrow despawns",
			"Spécifie le temps en ticks depuis lequel la flèche n'a pas bougée, lorsque la valeur atteint 1200, cette dernière disparait"),

	DAMAGE(2.0f,
			"damage:(number)",
			"Specifies the damage the arrow does when impacting (For better understanding: 2.0 is standard, every “power”-enchantment gives +0.5)",
			"Spécifie les dégats de l'impact de la flèche (plus plus de compréhension: 2.0 est la valeur par défaut, chaque enchantement \"power\" donne +0.5)"),

	// FIREBALL
	DIRECTION(new Direction(0.0f, 0.0f, 0.0f),
			"direction:[(x-m/s),(y-m/s),(z-m/s)]",
			"Specifies the motion instead of the “motion”-tag (in other words, just do the exact same as with the “motion”-tag, but just with “direction”!)",
			"Spécifie la direction en (x-m/s),(y-m/s),(z-m/s) (comme le tag de motion)"),
	EXPLOSION_POWER_FIREBALL(2,
			"ExplosionPower:(number)",
			"Specifies the explosion strength",
			"Spécifie la force d'explosion"),

	// THROWN PEARL
	OWNER_NAME_THROWN_PEARL_OR_POTION(" ",
			"ownerName:(name)",
			"Specifies the name of the player that threw the pearl or potion",
			"Spécifie le nom du joueur qui a lancé la pearle ou la potion"),

	// THROWN_POTION
	POTION(new PotionTag(0, 0),
			"Potion:{item-tags}",
			"Specifies the type of the thrown potion (only “id” and “Damage” necessary!)",
			"Spécifie le type de la potion (seulement \"id\" et \"Damage\" necessaires!"),

	// DROPPED ITEM
	AGE_ITEM(new AgeItem(0),
			"Age:(ticks)",
			"Specifies the number of ticks since the items has last been touched, at 6000 it will despawn, if set to “-32768” the item will never despawn",
			"Spécifie le nombre de ticks depuis que l'objet a été touché, à 6000 il disparaitra, si la valeur est mise à -32768, l'item ne disparaîtra jamais"),

	HEALTH_ITEM(new HealthItem(5),
			"Health:(number)",
			"Specifies the health of the item, 5 is standard, at 0 the item is destroyed",
			"Spécifie la vie de l'objet, 5 de base, 0 quand l'objet est détruit"),

	PICKUP_DELAY_ITEM(new PickupDelayItem(0),
			"PickupDelay:(ticks)",
			"Specifies the number of ticks until the item can be picked up, if set to “32767” the item can never be picked up",
			"Spécifie le temps en ticks avant que l'objet soit récuperable, si il est mit à \"32767\", l'objet ne sera jamais récuperable"),

	;

	private final String defaultValue;
	private final String tagName;
	private final String structure;
	private final String engHelpMessage, frHelpMessage;

	private DataTagType(Serializable[] serializables,
			String structure,
			String engHelpMessage,
			String frHelpMessage) {
		this(
				Serializable.serializeJoinedDataTags(serializables),
				structure,
				engHelpMessage,
				frHelpMessage);
	}

	private DataTagType(Serializable serializable,
			String structure,
			String engHelpMessage,
			String frHelpMessage) {
		this(serializable.serialize(), structure, engHelpMessage, frHelpMessage);
	}

	private DataTagType(Object defaultValue,
			String structure,
			String engHelpMessage,
			String frHelpMessage) {
		this.defaultValue = defaultValue.toString();
		this.tagName = structure.split(":")[0];
		this.structure = structure;
		this.engHelpMessage = engHelpMessage;
		this.frHelpMessage = frHelpMessage;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public String getTagName() {
		return tagName;
	}

	public String getDataTag() {
		return String.format("%s:%s", this.getTagName(), this.getDefaultValue());
	}

}
