package fr.cactuscata.entitycommandgenerator.tags.mobs.attributes;

import fr.cactuscata.entitycommandgenerator.utils.Disencouraged;

public enum SlotAttributeType {

	// TODO completed other slots
	MAIN_HAND("mainhand"), @Disencouraged
	ALL("all");

	private final String slotAttributeTypeName;

	private SlotAttributeType(String slotAttributeTypeName) {
		this.slotAttributeTypeName = slotAttributeTypeName;
	}

	public String getSlotAttributeTypeName() {
		return this.slotAttributeTypeName;
	}

}
