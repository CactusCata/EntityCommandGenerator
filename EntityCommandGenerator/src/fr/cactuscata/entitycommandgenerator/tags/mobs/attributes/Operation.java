package fr.cactuscata.entitycommandgenerator.tags.mobs.attributes;

import fr.cactuscata.entitycommandgenerator.utils.IntervalsNumbers;
import fr.cactuscata.entitycommandgenerator.utils.Serializable;

public class Operation implements Serializable {

	private final int operationValue;

	/**
	 * A modifier's operation dictates how it modifies an attribute's base
	 * value. Three operations exist:
	 * 
	 * Operation 0: Additive. Adds all of the modifiers' amounts to the current
	 * value of the attribute. For example, modifying an attribute with
	 * {Amount:2,Operation:0} and {Amount:4,Operation:0} with a Base of 3
	 * results in 9 (3 + 2 + 4 = 9).
	 * 
	 * Operation 1: Multiplicative. Multiplies the current value of the
	 * attribute by (1 + x), where x is the sum of the modifiers' amounts. For
	 * example, modifying an attribute with {Amount:2,Operation:1} and
	 * {Amount:4,Operation:1} with a Base of 3 results in 21 (3 * (1 + 2 + 4) =
	 * 21).
	 * 
	 * Operation 2: Multiplicative. For every modifier, multiplies the current
	 * value of the attribute by (1 + x), where x is the amount of the
	 * particular modifier. Functions the same as Operation 1 if there is only a
	 * single modifier with operation 1 or 2. However, for multiple modifiers it
	 * will multiply the modifiers rather than adding them. For example,
	 * modifying an attribute with {Amount:2,Operation:2} and
	 * {Amount:4,Operation:2} with a Base of 3 results in 45 (3 * (1 + 2) * (1 +
	 * 4) = 45).[3]
	 * 
	 * The mathematical behavior is as follows: Operation 0: Increment X by
	 * Amount, Operation 1: Increment Y by X * Amount, Operation 2: Y = Y * (1 +
	 * Amount) (equivalent to Increment Y by Y * Amount). The game first sets X
	 * = Base, then executes all Operation 0 modifiers, then sets Y = X, then
	 * executes all Operation 1 modifiers, and finally executes all Operation 2
	 * modifiers.
	 * 
	 * @param operation
	 */
	public Operation(int operationValue) {
		new IntervalsNumbers(operationValue, 0, 2);
		this.operationValue = operationValue;
	}

	@Override
	public String serialize() {
		return String.valueOf(this.getOperationValue());
	}

	public int getOperationValue() {
		return operationValue;
	}

}
