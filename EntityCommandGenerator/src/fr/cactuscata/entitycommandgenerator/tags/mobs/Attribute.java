package fr.cactuscata.entitycommandgenerator.tags.mobs;

import fr.cactuscata.entitycommandgenerator.tags.mobs.attributes.AttributeType;
import fr.cactuscata.entitycommandgenerator.tags.mobs.attributes.Operation;
import fr.cactuscata.entitycommandgenerator.tags.mobs.attributes.SlotAttributeType;
import fr.cactuscata.entitycommandgenerator.utils.IntervalsNumbers;
import fr.cactuscata.entitycommandgenerator.utils.Serializable;

public class Attribute implements Serializable {

	private final AttributeType attribueType;
	private final float amount;
	private final Operation operation;
	private final SlotAttributeType slotType;

	public Attribute(AttributeType attributeType,
			float amount,
			int operationValue,
			SlotAttributeType slotType) {
		new IntervalsNumbers(amount, attributeType.getMin(), attributeType.getMax());
		this.attribueType = attributeType;
		this.amount = amount;
		this.operation = new Operation(operationValue);
		this.slotType = slotType;
	}

	public Attribute(AttributeType attribueType, float amount) {
		this(attribueType, amount, 0, SlotAttributeType.ALL);
	}

	public float getAmount() {
		return amount;
	}

	public AttributeType getAttribueType() {
		return attribueType;
	}

	public Operation getOperation() {
		return operation;
	}

	public SlotAttributeType getSlotType() {
		return slotType;
	}

	@Override
	public String serialize() {
		return String.format(
				"Slot:%s,AttributeName:%s,Name:%s,Amount:%f,Operation:%d",
				this.getSlotType().getSlotAttributeTypeName(),
				this.getAttribueType().getAttributeName(),
				this.getAttribueType().getAttributeName(),
				this.getAmount(),
				this.getOperation().serialize());
	}

}
